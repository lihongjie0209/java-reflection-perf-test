package cn.lihongjie.reflection.perf.test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import lombok.SneakyThrows;
import org.openjdk.jmh.annotations.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 5, time = 1)
@Measurement(iterations = 5, time = 1)
@Fork(1)
@State(Scope.Thread)
public class JsonStringMaskPerfTest {


    private final ObjectMapper mapper;
    private byte[] json1MB = null;
    private byte[] json5MB = null;
    private byte[] json10MB = null;
    private byte[] json20MB = null;
    private Pattern httpsRegex = Pattern.compile("https://(.+)");


    public JsonStringMaskPerfTest() {

        try {

            json1MB = Files.readAllBytes(Paths.get("./data/1mb.json"));
            json5MB = Files.readAllBytes(Paths.get("./data/5mb.json"));
            json10MB = Files.readAllBytes(Paths.get("./data/10mb.json"));
            json20MB = Files.readAllBytes(Paths.get("./data/20mb.json"));
        } catch (Exception e) {
            e.printStackTrace();
        }


        mapper = new ObjectMapper();

        SimpleModule module = new SimpleModule();
        module.addSerializer(String.class, new JsonSerializer<String>() {
            @Override
            public void serialize(String s, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {

                if (s.startsWith("http")) {

                    Matcher matcher = httpsRegex.matcher(s);

                    String result = matcher.replaceAll("http://$1");

                    jsonGenerator.writeString(result);
                } else {
                    jsonGenerator.writeString(s);
                }
            }
        });
        mapper.registerModule(module);
    }

    @Benchmark
    public void test1MB_regex() {


        String s = new String(json1MB);


        Matcher matcher = httpsRegex.matcher(s);

        String result = matcher.replaceAll("http://$1");

    }


    @Benchmark
    public void test10MB_regex() {


        String s = new String(json10MB);


        Matcher matcher = httpsRegex.matcher(s);

        String result = matcher.replaceAll("http://$1");

    }

    @Benchmark
    public void test20MB_regex() {


        String s = new String(json20MB);


        Matcher matcher = httpsRegex.matcher(s);

        String result = matcher.replaceAll("http://$1");

    }


    @Benchmark
    public void test5MB_regex() {


        String s = new String(json5MB);


        Matcher matcher = httpsRegex.matcher(s);

        String result = matcher.replaceAll("http://$1");

    }


    @SneakyThrows
    @Benchmark
    public void test1MB_jackson() {


        mapper.writeValueAsString(mapper.readTree(json1MB));

    }

    @SneakyThrows
    @Benchmark
    public void test5MB_jackson() {
        mapper.writeValueAsString(mapper.readTree(json5MB));
    }


    @SneakyThrows
    @Benchmark
    public void test10MB_jackson() {
        mapper.writeValueAsString(mapper.readTree(json10MB));
    }

    @SneakyThrows
    @Benchmark
    public void test20MB_jackson() {
        mapper.writeValueAsString(mapper.readTree(json20MB));
    }
}
