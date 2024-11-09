package cn.lihongjie.reflection.perf.test;

import cn.hutool.core.util.ReflectUtil;
import cn.lihongjie.reflection.perf.dto.Field100DTO;
import cn.lihongjie.reflection.perf.dto.Field10DTO;
import cn.lihongjie.reflection.perf.dto.Field50DTO;
import com.esotericsoftware.reflectasm.FieldAccess;
import com.esotericsoftware.reflectasm.MethodAccess;
import lombok.SneakyThrows;
import org.apache.commons.beanutils.PropertyUtils;
import org.openjdk.jmh.annotations.*;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 5, time = 1)
@Measurement(iterations = 5, time = 1)
@Fork(1)
@State(Scope.Thread)
public class PerfTest {

    MethodAccess access10 = MethodAccess.get(Field10DTO.class);
    MethodAccess access50 = MethodAccess.get(Field50DTO.class);
    MethodAccess access100 = MethodAccess.get(Field100DTO.class);


    @Benchmark
    public void test_field10_java_baseline() {

        Field10DTO dto = new Field10DTO();


        dto.setField1("");
        dto.setField2("");
        dto.setField3("");
        dto.setField4("");
        dto.setField5("");
        dto.setField6("");
        dto.setField7("");
        dto.setField8("");
        dto.setField9("");
        dto.setField10("");


        String field1 = dto.getField1();
        String field2 = dto.getField2();
        String field3 = dto.getField3();
        String field4 = dto.getField4();
        String field5 = dto.getField5();
        String field6 = dto.getField6();
        String field7 = dto.getField7();
        String field8 = dto.getField8();
        String field9 = dto.getField9();
        String field10 = dto.getField10();


    }


    @Benchmark
    public void test_field50_java_baseline() {

        Field50DTO dto = new Field50DTO();


        dto.setField1("");
        dto.setField2("");
        dto.setField3("");
        dto.setField4("");
        dto.setField5("");
        dto.setField6("");
        dto.setField7("");
        dto.setField8("");
        dto.setField9("");
        dto.setField10("");
        dto.setField11("");
        dto.setField12("");
        dto.setField13("");
        dto.setField14("");
        dto.setField15("");
        dto.setField16("");
        dto.setField17("");
        dto.setField18("");
        dto.setField19("");
        dto.setField20("");
        dto.setField21("");
        dto.setField22("");
        dto.setField23("");
        dto.setField24("");
        dto.setField25("");
        dto.setField26("");
        dto.setField27("");
        dto.setField28("");
        dto.setField29("");
        dto.setField30("");
        dto.setField31("");
        dto.setField32("");
        dto.setField33("");
        dto.setField34("");
        dto.setField35("");
        dto.setField36("");
        dto.setField37("");
        dto.setField38("");
        dto.setField39("");
        dto.setField40("");
        dto.setField41("");
        dto.setField42("");
        dto.setField43("");
        dto.setField44("");
        dto.setField45("");
        dto.setField46("");
        dto.setField47("");
        dto.setField48("");
        dto.setField49("");
        dto.setField50("");


        String field1 = dto.getField1();
        String field2 = dto.getField2();
        String field3 = dto.getField3();
        String field4 = dto.getField4();
        String field5 = dto.getField5();
        String field6 = dto.getField6();
        String field7 = dto.getField7();
        String field8 = dto.getField8();
        String field9 = dto.getField9();
        String field10 = dto.getField10();
        String field11 = dto.getField11();
        String field12 = dto.getField12();
        String field13 = dto.getField13();
        String field14 = dto.getField14();
        String field15 = dto.getField15();
        String field16 = dto.getField16();
        String field17 = dto.getField17();
        String field18 = dto.getField18();
        String field19 = dto.getField19();
        String field20 = dto.getField20();
        String field21 = dto.getField21();
        String field22 = dto.getField22();
        String field23 = dto.getField23();
        String field24 = dto.getField24();
        String field25 = dto.getField25();
        String field26 = dto.getField26();
        String field27 = dto.getField27();
        String field28 = dto.getField28();
        String field29 = dto.getField29();
        String field30 = dto.getField30();
        String field31 = dto.getField31();
        String field32 = dto.getField32();
        String field33 = dto.getField33();
        String field34 = dto.getField34();
        String field35 = dto.getField35();
        String field36 = dto.getField36();
        String field37 = dto.getField37();
        String field38 = dto.getField38();
        String field39 = dto.getField39();
        String field40 = dto.getField40();
        String field41 = dto.getField41();
        String field42 = dto.getField42();
        String field43 = dto.getField43();
        String field44 = dto.getField44();
        String field45 = dto.getField45();
        String field46 = dto.getField46();
        String field47 = dto.getField47();
        String field48 = dto.getField48();
        String field49 = dto.getField49();
        String field50 = dto.getField50();


    }


    @Benchmark
    public void test_field100_java_baseline() {

        Field100DTO dto = new Field100DTO();


        dto.setField1("");
        dto.setField2("");
        dto.setField3("");
        dto.setField4("");
        dto.setField5("");
        dto.setField6("");
        dto.setField7("");
        dto.setField8("");
        dto.setField9("");
        dto.setField10("");
        dto.setField11("");
        dto.setField12("");
        dto.setField13("");
        dto.setField14("");
        dto.setField15("");
        dto.setField16("");
        dto.setField17("");
        dto.setField18("");
        dto.setField19("");
        dto.setField20("");
        dto.setField21("");
        dto.setField22("");
        dto.setField23("");
        dto.setField24("");
        dto.setField25("");
        dto.setField26("");
        dto.setField27("");
        dto.setField28("");
        dto.setField29("");
        dto.setField30("");
        dto.setField31("");
        dto.setField32("");
        dto.setField33("");
        dto.setField34("");
        dto.setField35("");
        dto.setField36("");
        dto.setField37("");
        dto.setField38("");
        dto.setField39("");
        dto.setField40("");
        dto.setField41("");
        dto.setField42("");
        dto.setField43("");
        dto.setField44("");
        dto.setField45("");
        dto.setField46("");
        dto.setField47("");
        dto.setField48("");
        dto.setField49("");
        dto.setField50("");
        dto.setField51("");
        dto.setField52("");
        dto.setField53("");
        dto.setField54("");
        dto.setField55("");
        dto.setField56("");
        dto.setField57("");
        dto.setField58("");
        dto.setField59("");
        dto.setField60("");
        dto.setField61("");
        dto.setField62("");
        dto.setField63("");
        dto.setField64("");
        dto.setField65("");
        dto.setField66("");
        dto.setField67("");
        dto.setField68("");
        dto.setField69("");
        dto.setField70("");
        dto.setField71("");
        dto.setField72("");
        dto.setField73("");
        dto.setField74("");
        dto.setField75("");
        dto.setField76("");
        dto.setField77("");
        dto.setField78("");
        dto.setField79("");
        dto.setField80("");
        dto.setField81("");
        dto.setField82("");
        dto.setField83("");
        dto.setField84("");
        dto.setField85("");
        dto.setField86("");
        dto.setField87("");
        dto.setField88("");
        dto.setField89("");
        dto.setField90("");
        dto.setField91("");
        dto.setField92("");
        dto.setField93("");
        dto.setField94("");
        dto.setField95("");
        dto.setField96("");
        dto.setField97("");
        dto.setField98("");
        dto.setField99("");
        dto.setField100("");


        String field1 = dto.getField1();
        String field2 = dto.getField2();
        String field3 = dto.getField3();
        String field4 = dto.getField4();
        String field5 = dto.getField5();
        String field6 = dto.getField6();
        String field7 = dto.getField7();
        String field8 = dto.getField8();
        String field9 = dto.getField9();
        String field10 = dto.getField10();
        String field11 = dto.getField11();
        String field12 = dto.getField12();
        String field13 = dto.getField13();
        String field14 = dto.getField14();
        String field15 = dto.getField15();
        String field16 = dto.getField16();
        String field17 = dto.getField17();
        String field18 = dto.getField18();
        String field19 = dto.getField19();
        String field20 = dto.getField20();
        String field21 = dto.getField21();
        String field22 = dto.getField22();
        String field23 = dto.getField23();
        String field24 = dto.getField24();
        String field25 = dto.getField25();
        String field26 = dto.getField26();
        String field27 = dto.getField27();
        String field28 = dto.getField28();
        String field29 = dto.getField29();
        String field30 = dto.getField30();
        String field31 = dto.getField31();
        String field32 = dto.getField32();
        String field33 = dto.getField33();
        String field34 = dto.getField34();
        String field35 = dto.getField35();
        String field36 = dto.getField36();
        String field37 = dto.getField37();
        String field38 = dto.getField38();
        String field39 = dto.getField39();
        String field40 = dto.getField40();
        String field41 = dto.getField41();
        String field42 = dto.getField42();
        String field43 = dto.getField43();
        String field44 = dto.getField44();
        String field45 = dto.getField45();
        String field46 = dto.getField46();
        String field47 = dto.getField47();
        String field48 = dto.getField48();
        String field49 = dto.getField49();
        String field50 = dto.getField50();
        String field51 = dto.getField51();
        String field52 = dto.getField52();
        String field53 = dto.getField53();
        String field54 = dto.getField54();
        String field55 = dto.getField55();
        String field56 = dto.getField56();
        String field57 = dto.getField57();
        String field58 = dto.getField58();
        String field59 = dto.getField59();
        String field60 = dto.getField60();
        String field61 = dto.getField61();
        String field62 = dto.getField62();
        String field63 = dto.getField63();
        String field64 = dto.getField64();
        String field65 = dto.getField65();
        String field66 = dto.getField66();
        String field67 = dto.getField67();
        String field68 = dto.getField68();
        String field69 = dto.getField69();
        String field70 = dto.getField70();
        String field71 = dto.getField71();
        String field72 = dto.getField72();
        String field73 = dto.getField73();
        String field74 = dto.getField74();
        String field75 = dto.getField75();
        String field76 = dto.getField76();
        String field77 = dto.getField77();
        String field78 = dto.getField78();
        String field79 = dto.getField79();
        String field80 = dto.getField80();
        String field81 = dto.getField81();
        String field82 = dto.getField82();
        String field83 = dto.getField83();
        String field84 = dto.getField84();
        String field85 = dto.getField85();
        String field86 = dto.getField86();
        String field87 = dto.getField87();
        String field88 = dto.getField88();
        String field89 = dto.getField89();
        String field90 = dto.getField90();
        String field91 = dto.getField91();
        String field92 = dto.getField92();
        String field93 = dto.getField93();
        String field94 = dto.getField94();
        String field95 = dto.getField95();
        String field96 = dto.getField96();
        String field97 = dto.getField97();
        String field98 = dto.getField98();
        String field99 = dto.getField99();
        String field100 = dto.getField100();


    }


    @Benchmark
    public void test_field10_hutool() {

        Field10DTO dto = new Field10DTO();

        ReflectUtil.setFieldValue(dto, "field1", "");
        ReflectUtil.setFieldValue(dto, "field2", "");
        ReflectUtil.setFieldValue(dto, "field3", "");
        ReflectUtil.setFieldValue(dto, "field4", "");
        ReflectUtil.setFieldValue(dto, "field5", "");
        ReflectUtil.setFieldValue(dto, "field6", "");
        ReflectUtil.setFieldValue(dto, "field7", "");
        ReflectUtil.setFieldValue(dto, "field8", "");
        ReflectUtil.setFieldValue(dto, "field9", "");
        ReflectUtil.setFieldValue(dto, "field10", "");


        String field1 = (String) ReflectUtil.getFieldValue(dto, "field1");
        String field2 = (String) ReflectUtil.getFieldValue(dto, "field2");
        String field3 = (String) ReflectUtil.getFieldValue(dto, "field3");
        String field4 = (String) ReflectUtil.getFieldValue(dto, "field4");
        String field5 = (String) ReflectUtil.getFieldValue(dto, "field5");
        String field6 = (String) ReflectUtil.getFieldValue(dto, "field6");
        String field7 = (String) ReflectUtil.getFieldValue(dto, "field7");
        String field8 = (String) ReflectUtil.getFieldValue(dto, "field8");
        String field9 = (String) ReflectUtil.getFieldValue(dto, "field9");
        String field10 = (String) ReflectUtil.getFieldValue(dto, "field10");

    }



    @Benchmark
    public void test_field50_hutool() {

        Field50DTO dto = new Field50DTO();

        ReflectUtil.setFieldValue(dto, "field1", "");
        ReflectUtil.setFieldValue(dto, "field2", "");
        ReflectUtil.setFieldValue(dto, "field3", "");
        ReflectUtil.setFieldValue(dto, "field4", "");
        ReflectUtil.setFieldValue(dto, "field5", "");
        ReflectUtil.setFieldValue(dto, "field6", "");
        ReflectUtil.setFieldValue(dto, "field7", "");
        ReflectUtil.setFieldValue(dto, "field8", "");
        ReflectUtil.setFieldValue(dto, "field9", "");

        ReflectUtil.setFieldValue(dto, "field10", "");

        ReflectUtil.setFieldValue(dto, "field11", "");
        ReflectUtil.setFieldValue(dto, "field12", "");
        ReflectUtil.setFieldValue(dto, "field13", "");
        ReflectUtil.setFieldValue(dto, "field14", "");
        ReflectUtil.setFieldValue(dto, "field15", "");
        ReflectUtil.setFieldValue(dto, "field16", "");
        ReflectUtil.setFieldValue(dto, "field17", "");
        ReflectUtil.setFieldValue(dto, "field18", "");
        ReflectUtil.setFieldValue(dto, "field19", "");
        ReflectUtil.setFieldValue(dto, "field20", "");

        ReflectUtil.setFieldValue(dto, "field21", "");
        ReflectUtil.setFieldValue(dto, "field22", "");
        ReflectUtil.setFieldValue(dto, "field23", "");
        ReflectUtil.setFieldValue(dto, "field24", "");
        ReflectUtil.setFieldValue(dto, "field25", "");
        ReflectUtil.setFieldValue(dto, "field26", "");
        ReflectUtil.setFieldValue(dto, "field27", "");
        ReflectUtil.setFieldValue(dto, "field28", "");
        ReflectUtil.setFieldValue(dto, "field29", "");
        ReflectUtil.setFieldValue(dto, "field30", "");

        ReflectUtil.setFieldValue(dto, "field31", "");
        ReflectUtil.setFieldValue(dto, "field32", "");
        ReflectUtil.setFieldValue(dto, "field33", "");
        ReflectUtil.setFieldValue(dto, "field34", "");
        ReflectUtil.setFieldValue(dto, "field35", "");
        ReflectUtil.setFieldValue(dto, "field36", "");
        ReflectUtil.setFieldValue(dto, "field37", "");
        ReflectUtil.setFieldValue(dto, "field38", "");
        ReflectUtil.setFieldValue(dto, "field39", "");
        ReflectUtil.setFieldValue(dto, "field40", "");


        ReflectUtil.setFieldValue(dto, "field41", "");
        ReflectUtil.setFieldValue(dto, "field42", "");
        ReflectUtil.setFieldValue(dto, "field43", "");
        ReflectUtil.setFieldValue(dto, "field44", "");
        ReflectUtil.setFieldValue(dto, "field45", "");
        ReflectUtil.setFieldValue(dto, "field46", "");
        ReflectUtil.setFieldValue(dto, "field47", "");
        ReflectUtil.setFieldValue(dto, "field48", "");
        ReflectUtil.setFieldValue(dto, "field49", "");
        ReflectUtil.setFieldValue(dto, "field50", "");




        String field1 = (String) ReflectUtil.getFieldValue(dto, "field1");
        String field2 = (String) ReflectUtil.getFieldValue(dto, "field2");
        String field3 = (String) ReflectUtil.getFieldValue(dto, "field3");
        String field4 = (String) ReflectUtil.getFieldValue(dto, "field4");
        String field5 = (String) ReflectUtil.getFieldValue(dto, "field5");
        String field6 = (String) ReflectUtil.getFieldValue(dto, "field6");
        String field7 = (String) ReflectUtil.getFieldValue(dto, "field7");
        String field8 = (String) ReflectUtil.getFieldValue(dto, "field8");
        String field9 = (String) ReflectUtil.getFieldValue(dto, "field9");
        String field10 = (String) ReflectUtil.getFieldValue(dto, "field10");


        String field11 = (String) ReflectUtil.getFieldValue(dto, "field11");
        String field12 = (String) ReflectUtil.getFieldValue(dto, "field12");
        String field13 = (String) ReflectUtil.getFieldValue(dto, "field13");
        String field14 = (String) ReflectUtil.getFieldValue(dto, "field14");
        String field15 = (String) ReflectUtil.getFieldValue(dto, "field15");
        String field16 = (String) ReflectUtil.getFieldValue(dto, "field16");
        String field17 = (String) ReflectUtil.getFieldValue(dto, "field17");
        String field18 = (String) ReflectUtil.getFieldValue(dto, "field18");
        String field19 = (String) ReflectUtil.getFieldValue(dto, "field19");
        String field20 = (String) ReflectUtil.getFieldValue(dto, "field20");



        String field21 = (String) ReflectUtil.getFieldValue(dto, "field21");
        String field22 = (String) ReflectUtil.getFieldValue(dto, "field22");
        String field23 = (String) ReflectUtil.getFieldValue(dto, "field23");
        String field24 = (String) ReflectUtil.getFieldValue(dto, "field24");
        String field25 = (String) ReflectUtil.getFieldValue(dto, "field25");
        String field26 = (String) ReflectUtil.getFieldValue(dto, "field26");
        String field27 = (String) ReflectUtil.getFieldValue(dto, "field27");
        String field28 = (String) ReflectUtil.getFieldValue(dto, "field28");
        String field29 = (String) ReflectUtil.getFieldValue(dto, "field29");
        String field30 = (String) ReflectUtil.getFieldValue(dto, "field30");



        String field31 = (String) ReflectUtil.getFieldValue(dto, "field31");
        String field32 = (String) ReflectUtil.getFieldValue(dto, "field32");
        String field33 = (String) ReflectUtil.getFieldValue(dto, "field33");
        String field34 = (String) ReflectUtil.getFieldValue(dto, "field34");
        String field35 = (String) ReflectUtil.getFieldValue(dto, "field35");
        String field36 = (String) ReflectUtil.getFieldValue(dto, "field36");
        String field37 = (String) ReflectUtil.getFieldValue(dto, "field37");
        String field38 = (String) ReflectUtil.getFieldValue(dto, "field38");
        String field39 = (String) ReflectUtil.getFieldValue(dto, "field39");
        String field40 = (String) ReflectUtil.getFieldValue(dto, "field40");



        String field41 = (String) ReflectUtil.getFieldValue(dto, "field41");
        String field42 = (String) ReflectUtil.getFieldValue(dto, "field42");
        String field43 = (String) ReflectUtil.getFieldValue(dto, "field43");
        String field44 = (String) ReflectUtil.getFieldValue(dto, "field44");
        String field45 = (String) ReflectUtil.getFieldValue(dto, "field45");
        String field46 = (String) ReflectUtil.getFieldValue(dto, "field46");
        String field47 = (String) ReflectUtil.getFieldValue(dto, "field47");
        String field48 = (String) ReflectUtil.getFieldValue(dto, "field48");
        String field49 = (String) ReflectUtil.getFieldValue(dto, "field49");
        String field50 = (String) ReflectUtil.getFieldValue(dto, "field50");


    }



    @Benchmark
    public void test_field100_hutool() {

        Field100DTO dto = new Field100DTO();

        ReflectUtil.setFieldValue(dto, "field1", "");
        ReflectUtil.setFieldValue(dto, "field2", "");
        ReflectUtil.setFieldValue(dto, "field3", "");
        ReflectUtil.setFieldValue(dto, "field4", "");
        ReflectUtil.setFieldValue(dto, "field5", "");
        ReflectUtil.setFieldValue(dto, "field6", "");
        ReflectUtil.setFieldValue(dto, "field7", "");
        ReflectUtil.setFieldValue(dto, "field8", "");
        ReflectUtil.setFieldValue(dto, "field9", "");

        ReflectUtil.setFieldValue(dto, "field10", "");

        ReflectUtil.setFieldValue(dto, "field11", "");
        ReflectUtil.setFieldValue(dto, "field12", "");
        ReflectUtil.setFieldValue(dto, "field13", "");
        ReflectUtil.setFieldValue(dto, "field14", "");
        ReflectUtil.setFieldValue(dto, "field15", "");
        ReflectUtil.setFieldValue(dto, "field16", "");
        ReflectUtil.setFieldValue(dto, "field17", "");
        ReflectUtil.setFieldValue(dto, "field18", "");
        ReflectUtil.setFieldValue(dto, "field19", "");
        ReflectUtil.setFieldValue(dto, "field20", "");

        ReflectUtil.setFieldValue(dto, "field21", "");
        ReflectUtil.setFieldValue(dto, "field22", "");
        ReflectUtil.setFieldValue(dto, "field23", "");
        ReflectUtil.setFieldValue(dto, "field24", "");
        ReflectUtil.setFieldValue(dto, "field25", "");
        ReflectUtil.setFieldValue(dto, "field26", "");
        ReflectUtil.setFieldValue(dto, "field27", "");
        ReflectUtil.setFieldValue(dto, "field28", "");
        ReflectUtil.setFieldValue(dto, "field29", "");
        ReflectUtil.setFieldValue(dto, "field30", "");

        ReflectUtil.setFieldValue(dto, "field31", "");
        ReflectUtil.setFieldValue(dto, "field32", "");
        ReflectUtil.setFieldValue(dto, "field33", "");
        ReflectUtil.setFieldValue(dto, "field34", "");
        ReflectUtil.setFieldValue(dto, "field35", "");
        ReflectUtil.setFieldValue(dto, "field36", "");
        ReflectUtil.setFieldValue(dto, "field37", "");
        ReflectUtil.setFieldValue(dto, "field38", "");
        ReflectUtil.setFieldValue(dto, "field39", "");
        ReflectUtil.setFieldValue(dto, "field40", "");


        ReflectUtil.setFieldValue(dto, "field41", "");
        ReflectUtil.setFieldValue(dto, "field42", "");
        ReflectUtil.setFieldValue(dto, "field43", "");
        ReflectUtil.setFieldValue(dto, "field44", "");
        ReflectUtil.setFieldValue(dto, "field45", "");
        ReflectUtil.setFieldValue(dto, "field46", "");
        ReflectUtil.setFieldValue(dto, "field47", "");
        ReflectUtil.setFieldValue(dto, "field48", "");
        ReflectUtil.setFieldValue(dto, "field49", "");
        ReflectUtil.setFieldValue(dto, "field50", "");


        ReflectUtil.setFieldValue(dto, "field51", "");
        ReflectUtil.setFieldValue(dto, "field52", "");
        ReflectUtil.setFieldValue(dto, "field53", "");
        ReflectUtil.setFieldValue(dto, "field54", "");
        ReflectUtil.setFieldValue(dto, "field55", "");
        ReflectUtil.setFieldValue(dto, "field56", "");
        ReflectUtil.setFieldValue(dto, "field57", "");
        ReflectUtil.setFieldValue(dto, "field58", "");
        ReflectUtil.setFieldValue(dto, "field59", "");

        ReflectUtil.setFieldValue(dto, "field60", "");

        ReflectUtil.setFieldValue(dto, "field61", "");
        ReflectUtil.setFieldValue(dto, "field62", "");
        ReflectUtil.setFieldValue(dto, "field63", "");
        ReflectUtil.setFieldValue(dto, "field64", "");
        ReflectUtil.setFieldValue(dto, "field65", "");
        ReflectUtil.setFieldValue(dto, "field66", "");
        ReflectUtil.setFieldValue(dto, "field67", "");
        ReflectUtil.setFieldValue(dto, "field68", "");
        ReflectUtil.setFieldValue(dto, "field69", "");
        ReflectUtil.setFieldValue(dto, "field70", "");

        ReflectUtil.setFieldValue(dto, "field71", "");
        ReflectUtil.setFieldValue(dto, "field72", "");
        ReflectUtil.setFieldValue(dto, "field73", "");
        ReflectUtil.setFieldValue(dto, "field74", "");
        ReflectUtil.setFieldValue(dto, "field75", "");
        ReflectUtil.setFieldValue(dto, "field76", "");
        ReflectUtil.setFieldValue(dto, "field77", "");
        ReflectUtil.setFieldValue(dto, "field78", "");
        ReflectUtil.setFieldValue(dto, "field79", "");
        ReflectUtil.setFieldValue(dto, "field80", "");

        ReflectUtil.setFieldValue(dto, "field81", "");
        ReflectUtil.setFieldValue(dto, "field82", "");
        ReflectUtil.setFieldValue(dto, "field83", "");
        ReflectUtil.setFieldValue(dto, "field84", "");
        ReflectUtil.setFieldValue(dto, "field85", "");
        ReflectUtil.setFieldValue(dto, "field86", "");
        ReflectUtil.setFieldValue(dto, "field87", "");
        ReflectUtil.setFieldValue(dto, "field88", "");
        ReflectUtil.setFieldValue(dto, "field89", "");
        ReflectUtil.setFieldValue(dto, "field90", "");


        ReflectUtil.setFieldValue(dto, "field91", "");
        ReflectUtil.setFieldValue(dto, "field92", "");
        ReflectUtil.setFieldValue(dto, "field93", "");
        ReflectUtil.setFieldValue(dto, "field94", "");
        ReflectUtil.setFieldValue(dto, "field95", "");
        ReflectUtil.setFieldValue(dto, "field96", "");
        ReflectUtil.setFieldValue(dto, "field97", "");
        ReflectUtil.setFieldValue(dto, "field98", "");
        ReflectUtil.setFieldValue(dto, "field99", "");
        ReflectUtil.setFieldValue(dto, "field100", "");





        String field1 = (String) ReflectUtil.getFieldValue(dto, "field1");
        String field2 = (String) ReflectUtil.getFieldValue(dto, "field2");
        String field3 = (String) ReflectUtil.getFieldValue(dto, "field3");
        String field4 = (String) ReflectUtil.getFieldValue(dto, "field4");
        String field5 = (String) ReflectUtil.getFieldValue(dto, "field5");
        String field6 = (String) ReflectUtil.getFieldValue(dto, "field6");
        String field7 = (String) ReflectUtil.getFieldValue(dto, "field7");
        String field8 = (String) ReflectUtil.getFieldValue(dto, "field8");
        String field9 = (String) ReflectUtil.getFieldValue(dto, "field9");
        String field10 = (String) ReflectUtil.getFieldValue(dto, "field10");


        String field11 = (String) ReflectUtil.getFieldValue(dto, "field11");
        String field12 = (String) ReflectUtil.getFieldValue(dto, "field12");
        String field13 = (String) ReflectUtil.getFieldValue(dto, "field13");
        String field14 = (String) ReflectUtil.getFieldValue(dto, "field14");
        String field15 = (String) ReflectUtil.getFieldValue(dto, "field15");
        String field16 = (String) ReflectUtil.getFieldValue(dto, "field16");
        String field17 = (String) ReflectUtil.getFieldValue(dto, "field17");
        String field18 = (String) ReflectUtil.getFieldValue(dto, "field18");
        String field19 = (String) ReflectUtil.getFieldValue(dto, "field19");
        String field20 = (String) ReflectUtil.getFieldValue(dto, "field20");



        String field21 = (String) ReflectUtil.getFieldValue(dto, "field21");
        String field22 = (String) ReflectUtil.getFieldValue(dto, "field22");
        String field23 = (String) ReflectUtil.getFieldValue(dto, "field23");
        String field24 = (String) ReflectUtil.getFieldValue(dto, "field24");
        String field25 = (String) ReflectUtil.getFieldValue(dto, "field25");
        String field26 = (String) ReflectUtil.getFieldValue(dto, "field26");
        String field27 = (String) ReflectUtil.getFieldValue(dto, "field27");
        String field28 = (String) ReflectUtil.getFieldValue(dto, "field28");
        String field29 = (String) ReflectUtil.getFieldValue(dto, "field29");
        String field30 = (String) ReflectUtil.getFieldValue(dto, "field30");



        String field31 = (String) ReflectUtil.getFieldValue(dto, "field31");
        String field32 = (String) ReflectUtil.getFieldValue(dto, "field32");
        String field33 = (String) ReflectUtil.getFieldValue(dto, "field33");
        String field34 = (String) ReflectUtil.getFieldValue(dto, "field34");
        String field35 = (String) ReflectUtil.getFieldValue(dto, "field35");
        String field36 = (String) ReflectUtil.getFieldValue(dto, "field36");
        String field37 = (String) ReflectUtil.getFieldValue(dto, "field37");
        String field38 = (String) ReflectUtil.getFieldValue(dto, "field38");
        String field39 = (String) ReflectUtil.getFieldValue(dto, "field39");
        String field40 = (String) ReflectUtil.getFieldValue(dto, "field40");



        String field41 = (String) ReflectUtil.getFieldValue(dto, "field41");
        String field42 = (String) ReflectUtil.getFieldValue(dto, "field42");
        String field43 = (String) ReflectUtil.getFieldValue(dto, "field43");
        String field44 = (String) ReflectUtil.getFieldValue(dto, "field44");
        String field45 = (String) ReflectUtil.getFieldValue(dto, "field45");
        String field46 = (String) ReflectUtil.getFieldValue(dto, "field46");
        String field47 = (String) ReflectUtil.getFieldValue(dto, "field47");
        String field48 = (String) ReflectUtil.getFieldValue(dto, "field48");
        String field49 = (String) ReflectUtil.getFieldValue(dto, "field49");
        String field50 = (String) ReflectUtil.getFieldValue(dto, "field50");




        String field51 = (String) ReflectUtil.getFieldValue(dto, "field51");
        String field52 = (String) ReflectUtil.getFieldValue(dto, "field52");
        String field53 = (String) ReflectUtil.getFieldValue(dto, "field53");
        String field54 = (String) ReflectUtil.getFieldValue(dto, "field54");
        String field55 = (String) ReflectUtil.getFieldValue(dto, "field55");
        String field56 = (String) ReflectUtil.getFieldValue(dto, "field56");
        String field57 = (String) ReflectUtil.getFieldValue(dto, "field57");
        String field58 = (String) ReflectUtil.getFieldValue(dto, "field58");
        String field59 = (String) ReflectUtil.getFieldValue(dto, "field59");
        String field60 = (String) ReflectUtil.getFieldValue(dto, "field60");


        String field61 = (String) ReflectUtil.getFieldValue(dto, "field61");
        String field62 = (String) ReflectUtil.getFieldValue(dto, "field62");
        String field63 = (String) ReflectUtil.getFieldValue(dto, "field63");
        String field64 = (String) ReflectUtil.getFieldValue(dto, "field64");
        String field65 = (String) ReflectUtil.getFieldValue(dto, "field65");
        String field66 = (String) ReflectUtil.getFieldValue(dto, "field66");
        String field67 = (String) ReflectUtil.getFieldValue(dto, "field67");
        String field68 = (String) ReflectUtil.getFieldValue(dto, "field68");
        String field69 = (String) ReflectUtil.getFieldValue(dto, "field69");
        String field70 = (String) ReflectUtil.getFieldValue(dto, "field70");



        String field71 = (String) ReflectUtil.getFieldValue(dto, "field71");
        String field72 = (String) ReflectUtil.getFieldValue(dto, "field72");
        String field73 = (String) ReflectUtil.getFieldValue(dto, "field73");
        String field74 = (String) ReflectUtil.getFieldValue(dto, "field74");
        String field75 = (String) ReflectUtil.getFieldValue(dto, "field75");
        String field76 = (String) ReflectUtil.getFieldValue(dto, "field76");
        String field77 = (String) ReflectUtil.getFieldValue(dto, "field77");
        String field78 = (String) ReflectUtil.getFieldValue(dto, "field78");
        String field79 = (String) ReflectUtil.getFieldValue(dto, "field79");
        String field80 = (String) ReflectUtil.getFieldValue(dto, "field80");



        String field81 = (String) ReflectUtil.getFieldValue(dto, "field81");
        String field82 = (String) ReflectUtil.getFieldValue(dto, "field82");
        String field83 = (String) ReflectUtil.getFieldValue(dto, "field83");
        String field84 = (String) ReflectUtil.getFieldValue(dto, "field84");
        String field85 = (String) ReflectUtil.getFieldValue(dto, "field85");
        String field86 = (String) ReflectUtil.getFieldValue(dto, "field86");
        String field87 = (String) ReflectUtil.getFieldValue(dto, "field87");
        String field88 = (String) ReflectUtil.getFieldValue(dto, "field88");
        String field89 = (String) ReflectUtil.getFieldValue(dto, "field89");
        String field90 = (String) ReflectUtil.getFieldValue(dto, "field90");



        String field91 = (String) ReflectUtil.getFieldValue(dto, "field91");
        String field92 = (String) ReflectUtil.getFieldValue(dto, "field92");
        String field93 = (String) ReflectUtil.getFieldValue(dto, "field93");
        String field94 = (String) ReflectUtil.getFieldValue(dto, "field94");
        String field95 = (String) ReflectUtil.getFieldValue(dto, "field95");
        String field96 = (String) ReflectUtil.getFieldValue(dto, "field96");
        String field97 = (String) ReflectUtil.getFieldValue(dto, "field97");
        String field98 = (String) ReflectUtil.getFieldValue(dto, "field98");
        String field99 = (String) ReflectUtil.getFieldValue(dto, "field99");
        String field100 = (String) ReflectUtil.getFieldValue(dto, "field100");


    }



    @Benchmark
    public void test_field10_hutool_field_map() {

        Field10DTO dto = new Field10DTO();

        Map<String, Field> fieldMap = ReflectUtil.getFieldMap(dto.getClass());
        ReflectUtil.setFieldValue(dto, fieldMap.get("field1"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field2"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field3"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field4"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field5"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field6"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field7"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field8"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field9"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field10"), "");


        String field1 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field1"));
        String field2 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field2"));
        String field3 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field3"));
        String field4 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field4"));
        String field5 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field5"));
        String field6 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field6"));
        String field7 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field7"));
        String field8 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field8"));
        String field9 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field9"));
        String field10 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field10"));

    }



    @Benchmark
    public void test_field50_hutool_field_map() {

        Field50DTO dto = new Field50DTO();
        Map<String, Field> fieldMap = ReflectUtil.getFieldMap(dto.getClass());
        ReflectUtil.setFieldValue(dto, fieldMap.get("field1"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field2"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field3"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field4"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field5"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field6"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field7"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field8"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field9"), "");

        ReflectUtil.setFieldValue(dto, fieldMap.get("field10"), "");

        ReflectUtil.setFieldValue(dto, fieldMap.get("field11"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field12"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field13"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field14"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field15"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field16"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field17"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field18"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field19"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field20"), "");

        ReflectUtil.setFieldValue(dto, fieldMap.get("field21"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field22"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field23"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field24"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field25"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field26"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field27"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field28"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field29"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field30"), "");

        ReflectUtil.setFieldValue(dto, fieldMap.get("field31"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field32"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field33"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field34"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field35"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field36"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field37"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field38"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field39"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field40"), "");


        ReflectUtil.setFieldValue(dto, fieldMap.get("field41"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field42"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field43"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field44"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field45"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field46"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field47"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field48"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field49"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field50"), "");


        String field1 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field1"));
        String field2 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field2"));

        String field3 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field3"));
        String field4 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field4"));

        String field5 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field5"));
        String field6 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field6"));

        String field7 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field7"));
        String field8 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field8"));

        String field9 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field9"));
        String field10 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field10"));


        String field11 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field11"));
        String field12 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field12"));
        String field13 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field13"));
        String field14 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field14"));
        String field15 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field15"));
        String field16 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field16"));
        String field17 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field17"));
        String field18 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field18"));
        String field19 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field19"));
        String field20 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field20"));


        String field21 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field21"));
        String field22 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field22"));
        String field23 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field23"));
        String field24 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field24"));
        String field25 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field25"));
        String field26 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field26"));
        String field27 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field27"));
        String field28 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field28"));
        String field29 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field29"));
        String field30 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field30"));


        String field31 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field31"));
        String field32 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field32"));
        String field33 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field33"));
        String field34 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field34"));
        String field35 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field35"));
        String field36 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field36"));
        String field37 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field37"));
        String field38 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field38"));
        String field39 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field39"));
        String field40 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field40"));


        String field41 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field41"));
        String field42 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field42"));
        String field43 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field43"));
        String field44 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field44"));
        String field45 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field45"));
        String field46 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field46"));
        String field47 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field47"));
        String field48 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field48"));
        String field49 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field49"));
        String field50 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field50"));


    }



    @Benchmark
    public void test_field100_hutool_field_map() {

        Field100DTO dto = new Field100DTO();

        Map<String, Field> fieldMap = ReflectUtil.getFieldMap(dto.getClass());

        ReflectUtil.setFieldValue(dto, fieldMap.get("field1"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field2"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field3"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field4"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field5"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field6"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field7"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field8"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field9"), "");

        ReflectUtil.setFieldValue(dto, fieldMap.get("field10"), "");

        ReflectUtil.setFieldValue(dto, fieldMap.get("field11"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field12"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field13"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field14"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field15"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field16"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field17"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field18"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field19"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field20"), "");

        ReflectUtil.setFieldValue(dto, fieldMap.get("field21"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field22"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field23"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field24"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field25"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field26"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field27"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field28"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field29"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field30"), "");

        ReflectUtil.setFieldValue(dto, fieldMap.get("field31"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field32"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field33"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field34"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field35"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field36"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field37"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field38"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field39"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field40"), "");


        ReflectUtil.setFieldValue(dto, fieldMap.get("field41"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field42"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field43"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field44"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field45"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field46"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field47"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field48"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field49"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field50"), "");


        ReflectUtil.setFieldValue(dto, fieldMap.get("field51"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field52"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field53"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field54"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field55"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field56"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field57"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field58"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field59"), "");

        ReflectUtil.setFieldValue(dto, fieldMap.get("field60"), "");

        ReflectUtil.setFieldValue(dto, fieldMap.get("field61"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field62"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field63"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field64"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field65"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field66"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field67"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field68"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field69"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field70"), "");

        ReflectUtil.setFieldValue(dto, fieldMap.get("field71"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field72"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field73"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field74"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field75"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field76"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field77"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field78"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field79"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field80"), "");

        ReflectUtil.setFieldValue(dto, fieldMap.get("field81"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field82"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field83"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field84"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field85"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field86"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field87"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field88"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field89"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field90"), "");


        ReflectUtil.setFieldValue(dto, fieldMap.get("field91"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field92"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field93"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field94"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field95"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field96"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field97"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field98"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field99"), "");
        ReflectUtil.setFieldValue(dto, fieldMap.get("field100"), "");


        String field1 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field1"));
        String field2 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field2"));
        String field3 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field3"));
        String field4 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field4"));
        String field5 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field5"));
        String field6 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field6"));
        String field7 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field7"));
        String field8 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field8"));
        String field9 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field9"));
        String field10 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field10"));


        String field11 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field11"));
        String field12 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field12"));
        String field13 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field13"));
        String field14 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field14"));
        String field15 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field15"));
        String field16 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field16"));
        String field17 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field17"));
        String field18 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field18"));
        String field19 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field19"));
        String field20 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field20"));


        String field21 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field21"));
        String field22 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field22"));
        String field23 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field23"));
        String field24 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field24"));
        String field25 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field25"));
        String field26 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field26"));
        String field27 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field27"));
        String field28 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field28"));
        String field29 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field29"));
        String field30 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field30"));


        String field31 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field31"));
        String field32 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field32"));
        String field33 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field33"));
        String field34 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field34"));
        String field35 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field35"));
        String field36 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field36"));
        String field37 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field37"));
        String field38 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field38"));
        String field39 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field39"));
        String field40 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field40"));


        String field41 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field41"));
        String field42 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field42"));
        String field43 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field43"));
        String field44 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field44"));
        String field45 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field45"));
        String field46 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field46"));
        String field47 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field47"));
        String field48 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field48"));
        String field49 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field49"));
        String field50 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field50"));


        String field51 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field51"));
        String field52 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field52"));
        String field53 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field53"));
        String field54 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field54"));
        String field55 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field55"));
        String field56 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field56"));
        String field57 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field57"));
        String field58 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field58"));
        String field59 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field59"));
        String field60 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field60"));


        String field61 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field61"));
        String field62 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field62"));
        String field63 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field63"));
        String field64 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field64"));
        String field65 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field65"));
        String field66 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field66"));
        String field67 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field67"));
        String field68 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field68"));
        String field69 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field69"));
        String field70 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field70"));


        String field71 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field71"));
        String field72 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field72"));
        String field73 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field73"));
        String field74 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field74"));
        String field75 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field75"));
        String field76 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field76"));
        String field77 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field77"));
        String field78 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field78"));
        String field79 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field79"));
        String field80 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field80"));


        String field81 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field81"));
        String field82 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field82"));
        String field83 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field83"));
        String field84 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field84"));
        String field85 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field85"));
        String field86 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field86"));
        String field87 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field87"));
        String field88 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field88"));
        String field89 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field89"));
        String field90 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field90"));


        String field91 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field91"));
        String field92 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field92"));
        String field93 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field93"));
        String field94 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field94"));
        String field95 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field95"));
        String field96 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field96"));
        String field97 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field97"));
        String field98 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field98"));
        String field99 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field99"));
        String field100 = (String) ReflectUtil.getFieldValue(dto, fieldMap.get("field100"));


    }


    @SneakyThrows
    @Benchmark
    public void test_field10_apache() {

        Field10DTO dto = new Field10DTO();

        PropertyUtils.setSimpleProperty(dto, "field1", "");
        PropertyUtils.setSimpleProperty(dto, "field2", "");
        PropertyUtils.setSimpleProperty(dto, "field3", "");
        PropertyUtils.setSimpleProperty(dto, "field4", "");
        PropertyUtils.setSimpleProperty(dto, "field5", "");
        PropertyUtils.setSimpleProperty(dto, "field6", "");
        PropertyUtils.setSimpleProperty(dto, "field7", "");
        PropertyUtils.setSimpleProperty(dto, "field8", "");
        PropertyUtils.setSimpleProperty(dto, "field9", "");
        PropertyUtils.setSimpleProperty(dto, "field10", "");


        String field1 = (String) PropertyUtils.getSimpleProperty(dto, "field1");
        String field2 = (String) PropertyUtils.getSimpleProperty(dto, "field2");
        String field3 = (String) PropertyUtils.getSimpleProperty(dto, "field3");
        String field4 = (String) PropertyUtils.getSimpleProperty(dto, "field4");
        String field5 = (String) PropertyUtils.getSimpleProperty(dto, "field5");
        String field6 = (String) PropertyUtils.getSimpleProperty(dto, "field6");
        String field7 = (String) PropertyUtils.getSimpleProperty(dto, "field7");
        String field8 = (String) PropertyUtils.getSimpleProperty(dto, "field8");
        String field9 = (String) PropertyUtils.getSimpleProperty(dto, "field9");
        String field10 = (String) PropertyUtils.getSimpleProperty(dto, "field10");

    }



    @SneakyThrows
    @Benchmark
    public void test_field50_apache() {

        Field50DTO dto = new Field50DTO();

        PropertyUtils.setSimpleProperty(dto, "field1", "");
        PropertyUtils.setSimpleProperty(dto, "field2", "");
        PropertyUtils.setSimpleProperty(dto, "field3", "");
        PropertyUtils.setSimpleProperty(dto, "field4", "");
        PropertyUtils.setSimpleProperty(dto, "field5", "");
        PropertyUtils.setSimpleProperty(dto, "field6", "");
        PropertyUtils.setSimpleProperty(dto, "field7", "");
        PropertyUtils.setSimpleProperty(dto, "field8", "");
        PropertyUtils.setSimpleProperty(dto, "field9", "");

        PropertyUtils.setSimpleProperty(dto, "field10", "");

        PropertyUtils.setSimpleProperty(dto, "field11", "");
        PropertyUtils.setSimpleProperty(dto, "field12", "");
        PropertyUtils.setSimpleProperty(dto, "field13", "");
        PropertyUtils.setSimpleProperty(dto, "field14", "");
        PropertyUtils.setSimpleProperty(dto, "field15", "");
        PropertyUtils.setSimpleProperty(dto, "field16", "");
        PropertyUtils.setSimpleProperty(dto, "field17", "");
        PropertyUtils.setSimpleProperty(dto, "field18", "");
        PropertyUtils.setSimpleProperty(dto, "field19", "");
        PropertyUtils.setSimpleProperty(dto, "field20", "");

        PropertyUtils.setSimpleProperty(dto, "field21", "");
        PropertyUtils.setSimpleProperty(dto, "field22", "");
        PropertyUtils.setSimpleProperty(dto, "field23", "");
        PropertyUtils.setSimpleProperty(dto, "field24", "");
        PropertyUtils.setSimpleProperty(dto, "field25", "");
        PropertyUtils.setSimpleProperty(dto, "field26", "");
        PropertyUtils.setSimpleProperty(dto, "field27", "");
        PropertyUtils.setSimpleProperty(dto, "field28", "");
        PropertyUtils.setSimpleProperty(dto, "field29", "");
        PropertyUtils.setSimpleProperty(dto, "field30", "");

        PropertyUtils.setSimpleProperty(dto, "field31", "");
        PropertyUtils.setSimpleProperty(dto, "field32", "");
        PropertyUtils.setSimpleProperty(dto, "field33", "");
        PropertyUtils.setSimpleProperty(dto, "field34", "");
        PropertyUtils.setSimpleProperty(dto, "field35", "");
        PropertyUtils.setSimpleProperty(dto, "field36", "");
        PropertyUtils.setSimpleProperty(dto, "field37", "");
        PropertyUtils.setSimpleProperty(dto, "field38", "");
        PropertyUtils.setSimpleProperty(dto, "field39", "");
        PropertyUtils.setSimpleProperty(dto, "field40", "");


        PropertyUtils.setSimpleProperty(dto, "field41", "");
        PropertyUtils.setSimpleProperty(dto, "field42", "");
        PropertyUtils.setSimpleProperty(dto, "field43", "");
        PropertyUtils.setSimpleProperty(dto, "field44", "");
        PropertyUtils.setSimpleProperty(dto, "field45", "");
        PropertyUtils.setSimpleProperty(dto, "field46", "");
        PropertyUtils.setSimpleProperty(dto, "field47", "");
        PropertyUtils.setSimpleProperty(dto, "field48", "");
        PropertyUtils.setSimpleProperty(dto, "field49", "");
        PropertyUtils.setSimpleProperty(dto, "field50", "");




        String field1 = (String) PropertyUtils.getSimpleProperty(dto, "field1");
        String field2 = (String) PropertyUtils.getSimpleProperty(dto, "field2");
        String field3 = (String) PropertyUtils.getSimpleProperty(dto, "field3");
        String field4 = (String) PropertyUtils.getSimpleProperty(dto, "field4");
        String field5 = (String) PropertyUtils.getSimpleProperty(dto, "field5");
        String field6 = (String) PropertyUtils.getSimpleProperty(dto, "field6");
        String field7 = (String) PropertyUtils.getSimpleProperty(dto, "field7");
        String field8 = (String) PropertyUtils.getSimpleProperty(dto, "field8");
        String field9 = (String) PropertyUtils.getSimpleProperty(dto, "field9");
        String field10 = (String) PropertyUtils.getSimpleProperty(dto, "field10");


        String field11 = (String) PropertyUtils.getSimpleProperty(dto, "field11");
        String field12 = (String) PropertyUtils.getSimpleProperty(dto, "field12");
        String field13 = (String) PropertyUtils.getSimpleProperty(dto, "field13");
        String field14 = (String) PropertyUtils.getSimpleProperty(dto, "field14");
        String field15 = (String) PropertyUtils.getSimpleProperty(dto, "field15");
        String field16 = (String) PropertyUtils.getSimpleProperty(dto, "field16");
        String field17 = (String) PropertyUtils.getSimpleProperty(dto, "field17");
        String field18 = (String) PropertyUtils.getSimpleProperty(dto, "field18");
        String field19 = (String) PropertyUtils.getSimpleProperty(dto, "field19");
        String field20 = (String) PropertyUtils.getSimpleProperty(dto, "field20");



        String field21 = (String) PropertyUtils.getSimpleProperty(dto, "field21");
        String field22 = (String) PropertyUtils.getSimpleProperty(dto, "field22");
        String field23 = (String) PropertyUtils.getSimpleProperty(dto, "field23");
        String field24 = (String) PropertyUtils.getSimpleProperty(dto, "field24");
        String field25 = (String) PropertyUtils.getSimpleProperty(dto, "field25");
        String field26 = (String) PropertyUtils.getSimpleProperty(dto, "field26");
        String field27 = (String) PropertyUtils.getSimpleProperty(dto, "field27");
        String field28 = (String) PropertyUtils.getSimpleProperty(dto, "field28");
        String field29 = (String) PropertyUtils.getSimpleProperty(dto, "field29");
        String field30 = (String) PropertyUtils.getSimpleProperty(dto, "field30");



        String field31 = (String) PropertyUtils.getSimpleProperty(dto, "field31");
        String field32 = (String) PropertyUtils.getSimpleProperty(dto, "field32");
        String field33 = (String) PropertyUtils.getSimpleProperty(dto, "field33");
        String field34 = (String) PropertyUtils.getSimpleProperty(dto, "field34");
        String field35 = (String) PropertyUtils.getSimpleProperty(dto, "field35");
        String field36 = (String) PropertyUtils.getSimpleProperty(dto, "field36");
        String field37 = (String) PropertyUtils.getSimpleProperty(dto, "field37");
        String field38 = (String) PropertyUtils.getSimpleProperty(dto, "field38");
        String field39 = (String) PropertyUtils.getSimpleProperty(dto, "field39");
        String field40 = (String) PropertyUtils.getSimpleProperty(dto, "field40");



        String field41 = (String) PropertyUtils.getSimpleProperty(dto, "field41");
        String field42 = (String) PropertyUtils.getSimpleProperty(dto, "field42");
        String field43 = (String) PropertyUtils.getSimpleProperty(dto, "field43");
        String field44 = (String) PropertyUtils.getSimpleProperty(dto, "field44");
        String field45 = (String) PropertyUtils.getSimpleProperty(dto, "field45");
        String field46 = (String) PropertyUtils.getSimpleProperty(dto, "field46");
        String field47 = (String) PropertyUtils.getSimpleProperty(dto, "field47");
        String field48 = (String) PropertyUtils.getSimpleProperty(dto, "field48");
        String field49 = (String) PropertyUtils.getSimpleProperty(dto, "field49");
        String field50 = (String) PropertyUtils.getSimpleProperty(dto, "field50");


    }



    @SneakyThrows
    @Benchmark
    public void test_field100_apache() {

        Field100DTO dto = new Field100DTO();

        PropertyUtils.setSimpleProperty(dto, "field1", "");
        PropertyUtils.setSimpleProperty(dto, "field2", "");
        PropertyUtils.setSimpleProperty(dto, "field3", "");
        PropertyUtils.setSimpleProperty(dto, "field4", "");
        PropertyUtils.setSimpleProperty(dto, "field5", "");
        PropertyUtils.setSimpleProperty(dto, "field6", "");
        PropertyUtils.setSimpleProperty(dto, "field7", "");
        PropertyUtils.setSimpleProperty(dto, "field8", "");
        PropertyUtils.setSimpleProperty(dto, "field9", "");

        PropertyUtils.setSimpleProperty(dto, "field10", "");

        PropertyUtils.setSimpleProperty(dto, "field11", "");
        PropertyUtils.setSimpleProperty(dto, "field12", "");
        PropertyUtils.setSimpleProperty(dto, "field13", "");
        PropertyUtils.setSimpleProperty(dto, "field14", "");
        PropertyUtils.setSimpleProperty(dto, "field15", "");
        PropertyUtils.setSimpleProperty(dto, "field16", "");
        PropertyUtils.setSimpleProperty(dto, "field17", "");
        PropertyUtils.setSimpleProperty(dto, "field18", "");
        PropertyUtils.setSimpleProperty(dto, "field19", "");
        PropertyUtils.setSimpleProperty(dto, "field20", "");

        PropertyUtils.setSimpleProperty(dto, "field21", "");
        PropertyUtils.setSimpleProperty(dto, "field22", "");
        PropertyUtils.setSimpleProperty(dto, "field23", "");
        PropertyUtils.setSimpleProperty(dto, "field24", "");
        PropertyUtils.setSimpleProperty(dto, "field25", "");
        PropertyUtils.setSimpleProperty(dto, "field26", "");
        PropertyUtils.setSimpleProperty(dto, "field27", "");
        PropertyUtils.setSimpleProperty(dto, "field28", "");
        PropertyUtils.setSimpleProperty(dto, "field29", "");
        PropertyUtils.setSimpleProperty(dto, "field30", "");

        PropertyUtils.setSimpleProperty(dto, "field31", "");
        PropertyUtils.setSimpleProperty(dto, "field32", "");
        PropertyUtils.setSimpleProperty(dto, "field33", "");
        PropertyUtils.setSimpleProperty(dto, "field34", "");
        PropertyUtils.setSimpleProperty(dto, "field35", "");
        PropertyUtils.setSimpleProperty(dto, "field36", "");
        PropertyUtils.setSimpleProperty(dto, "field37", "");
        PropertyUtils.setSimpleProperty(dto, "field38", "");
        PropertyUtils.setSimpleProperty(dto, "field39", "");
        PropertyUtils.setSimpleProperty(dto, "field40", "");


        PropertyUtils.setSimpleProperty(dto, "field41", "");
        PropertyUtils.setSimpleProperty(dto, "field42", "");
        PropertyUtils.setSimpleProperty(dto, "field43", "");
        PropertyUtils.setSimpleProperty(dto, "field44", "");
        PropertyUtils.setSimpleProperty(dto, "field45", "");
        PropertyUtils.setSimpleProperty(dto, "field46", "");
        PropertyUtils.setSimpleProperty(dto, "field47", "");
        PropertyUtils.setSimpleProperty(dto, "field48", "");
        PropertyUtils.setSimpleProperty(dto, "field49", "");
        PropertyUtils.setSimpleProperty(dto, "field50", "");


        PropertyUtils.setSimpleProperty(dto, "field51", "");
        PropertyUtils.setSimpleProperty(dto, "field52", "");
        PropertyUtils.setSimpleProperty(dto, "field53", "");
        PropertyUtils.setSimpleProperty(dto, "field54", "");
        PropertyUtils.setSimpleProperty(dto, "field55", "");
        PropertyUtils.setSimpleProperty(dto, "field56", "");
        PropertyUtils.setSimpleProperty(dto, "field57", "");
        PropertyUtils.setSimpleProperty(dto, "field58", "");
        PropertyUtils.setSimpleProperty(dto, "field59", "");

        PropertyUtils.setSimpleProperty(dto, "field60", "");

        PropertyUtils.setSimpleProperty(dto, "field61", "");
        PropertyUtils.setSimpleProperty(dto, "field62", "");
        PropertyUtils.setSimpleProperty(dto, "field63", "");
        PropertyUtils.setSimpleProperty(dto, "field64", "");
        PropertyUtils.setSimpleProperty(dto, "field65", "");
        PropertyUtils.setSimpleProperty(dto, "field66", "");
        PropertyUtils.setSimpleProperty(dto, "field67", "");
        PropertyUtils.setSimpleProperty(dto, "field68", "");
        PropertyUtils.setSimpleProperty(dto, "field69", "");
        PropertyUtils.setSimpleProperty(dto, "field70", "");

        PropertyUtils.setSimpleProperty(dto, "field71", "");
        PropertyUtils.setSimpleProperty(dto, "field72", "");
        PropertyUtils.setSimpleProperty(dto, "field73", "");
        PropertyUtils.setSimpleProperty(dto, "field74", "");
        PropertyUtils.setSimpleProperty(dto, "field75", "");
        PropertyUtils.setSimpleProperty(dto, "field76", "");
        PropertyUtils.setSimpleProperty(dto, "field77", "");
        PropertyUtils.setSimpleProperty(dto, "field78", "");
        PropertyUtils.setSimpleProperty(dto, "field79", "");
        PropertyUtils.setSimpleProperty(dto, "field80", "");

        PropertyUtils.setSimpleProperty(dto, "field81", "");
        PropertyUtils.setSimpleProperty(dto, "field82", "");
        PropertyUtils.setSimpleProperty(dto, "field83", "");
        PropertyUtils.setSimpleProperty(dto, "field84", "");
        PropertyUtils.setSimpleProperty(dto, "field85", "");
        PropertyUtils.setSimpleProperty(dto, "field86", "");
        PropertyUtils.setSimpleProperty(dto, "field87", "");
        PropertyUtils.setSimpleProperty(dto, "field88", "");
        PropertyUtils.setSimpleProperty(dto, "field89", "");
        PropertyUtils.setSimpleProperty(dto, "field90", "");


        PropertyUtils.setSimpleProperty(dto, "field91", "");
        PropertyUtils.setSimpleProperty(dto, "field92", "");
        PropertyUtils.setSimpleProperty(dto, "field93", "");
        PropertyUtils.setSimpleProperty(dto, "field94", "");
        PropertyUtils.setSimpleProperty(dto, "field95", "");
        PropertyUtils.setSimpleProperty(dto, "field96", "");
        PropertyUtils.setSimpleProperty(dto, "field97", "");
        PropertyUtils.setSimpleProperty(dto, "field98", "");
        PropertyUtils.setSimpleProperty(dto, "field99", "");
        PropertyUtils.setSimpleProperty(dto, "field100", "");





        String field1 = (String) PropertyUtils.getSimpleProperty(dto, "field1");
        String field2 = (String) PropertyUtils.getSimpleProperty(dto, "field2");
        String field3 = (String) PropertyUtils.getSimpleProperty(dto, "field3");
        String field4 = (String) PropertyUtils.getSimpleProperty(dto, "field4");
        String field5 = (String) PropertyUtils.getSimpleProperty(dto, "field5");
        String field6 = (String) PropertyUtils.getSimpleProperty(dto, "field6");
        String field7 = (String) PropertyUtils.getSimpleProperty(dto, "field7");
        String field8 = (String) PropertyUtils.getSimpleProperty(dto, "field8");
        String field9 = (String) PropertyUtils.getSimpleProperty(dto, "field9");
        String field10 = (String) PropertyUtils.getSimpleProperty(dto, "field10");


        String field11 = (String) PropertyUtils.getSimpleProperty(dto, "field11");
        String field12 = (String) PropertyUtils.getSimpleProperty(dto, "field12");
        String field13 = (String) PropertyUtils.getSimpleProperty(dto, "field13");
        String field14 = (String) PropertyUtils.getSimpleProperty(dto, "field14");
        String field15 = (String) PropertyUtils.getSimpleProperty(dto, "field15");
        String field16 = (String) PropertyUtils.getSimpleProperty(dto, "field16");
        String field17 = (String) PropertyUtils.getSimpleProperty(dto, "field17");
        String field18 = (String) PropertyUtils.getSimpleProperty(dto, "field18");
        String field19 = (String) PropertyUtils.getSimpleProperty(dto, "field19");
        String field20 = (String) PropertyUtils.getSimpleProperty(dto, "field20");



        String field21 = (String) PropertyUtils.getSimpleProperty(dto, "field21");
        String field22 = (String) PropertyUtils.getSimpleProperty(dto, "field22");
        String field23 = (String) PropertyUtils.getSimpleProperty(dto, "field23");
        String field24 = (String) PropertyUtils.getSimpleProperty(dto, "field24");
        String field25 = (String) PropertyUtils.getSimpleProperty(dto, "field25");
        String field26 = (String) PropertyUtils.getSimpleProperty(dto, "field26");
        String field27 = (String) PropertyUtils.getSimpleProperty(dto, "field27");
        String field28 = (String) PropertyUtils.getSimpleProperty(dto, "field28");
        String field29 = (String) PropertyUtils.getSimpleProperty(dto, "field29");
        String field30 = (String) PropertyUtils.getSimpleProperty(dto, "field30");



        String field31 = (String) PropertyUtils.getSimpleProperty(dto, "field31");
        String field32 = (String) PropertyUtils.getSimpleProperty(dto, "field32");
        String field33 = (String) PropertyUtils.getSimpleProperty(dto, "field33");
        String field34 = (String) PropertyUtils.getSimpleProperty(dto, "field34");
        String field35 = (String) PropertyUtils.getSimpleProperty(dto, "field35");
        String field36 = (String) PropertyUtils.getSimpleProperty(dto, "field36");
        String field37 = (String) PropertyUtils.getSimpleProperty(dto, "field37");
        String field38 = (String) PropertyUtils.getSimpleProperty(dto, "field38");
        String field39 = (String) PropertyUtils.getSimpleProperty(dto, "field39");
        String field40 = (String) PropertyUtils.getSimpleProperty(dto, "field40");



        String field41 = (String) PropertyUtils.getSimpleProperty(dto, "field41");
        String field42 = (String) PropertyUtils.getSimpleProperty(dto, "field42");
        String field43 = (String) PropertyUtils.getSimpleProperty(dto, "field43");
        String field44 = (String) PropertyUtils.getSimpleProperty(dto, "field44");
        String field45 = (String) PropertyUtils.getSimpleProperty(dto, "field45");
        String field46 = (String) PropertyUtils.getSimpleProperty(dto, "field46");
        String field47 = (String) PropertyUtils.getSimpleProperty(dto, "field47");
        String field48 = (String) PropertyUtils.getSimpleProperty(dto, "field48");
        String field49 = (String) PropertyUtils.getSimpleProperty(dto, "field49");
        String field50 = (String) PropertyUtils.getSimpleProperty(dto, "field50");




        String field51 = (String) PropertyUtils.getSimpleProperty(dto, "field51");
        String field52 = (String) PropertyUtils.getSimpleProperty(dto, "field52");
        String field53 = (String) PropertyUtils.getSimpleProperty(dto, "field53");
        String field54 = (String) PropertyUtils.getSimpleProperty(dto, "field54");
        String field55 = (String) PropertyUtils.getSimpleProperty(dto, "field55");
        String field56 = (String) PropertyUtils.getSimpleProperty(dto, "field56");
        String field57 = (String) PropertyUtils.getSimpleProperty(dto, "field57");
        String field58 = (String) PropertyUtils.getSimpleProperty(dto, "field58");
        String field59 = (String) PropertyUtils.getSimpleProperty(dto, "field59");
        String field60 = (String) PropertyUtils.getSimpleProperty(dto, "field60");


        String field61 = (String) PropertyUtils.getSimpleProperty(dto, "field61");
        String field62 = (String) PropertyUtils.getSimpleProperty(dto, "field62");
        String field63 = (String) PropertyUtils.getSimpleProperty(dto, "field63");
        String field64 = (String) PropertyUtils.getSimpleProperty(dto, "field64");
        String field65 = (String) PropertyUtils.getSimpleProperty(dto, "field65");
        String field66 = (String) PropertyUtils.getSimpleProperty(dto, "field66");
        String field67 = (String) PropertyUtils.getSimpleProperty(dto, "field67");
        String field68 = (String) PropertyUtils.getSimpleProperty(dto, "field68");
        String field69 = (String) PropertyUtils.getSimpleProperty(dto, "field69");
        String field70 = (String) PropertyUtils.getSimpleProperty(dto, "field70");



        String field71 = (String) PropertyUtils.getSimpleProperty(dto, "field71");
        String field72 = (String) PropertyUtils.getSimpleProperty(dto, "field72");
        String field73 = (String) PropertyUtils.getSimpleProperty(dto, "field73");
        String field74 = (String) PropertyUtils.getSimpleProperty(dto, "field74");
        String field75 = (String) PropertyUtils.getSimpleProperty(dto, "field75");
        String field76 = (String) PropertyUtils.getSimpleProperty(dto, "field76");
        String field77 = (String) PropertyUtils.getSimpleProperty(dto, "field77");
        String field78 = (String) PropertyUtils.getSimpleProperty(dto, "field78");
        String field79 = (String) PropertyUtils.getSimpleProperty(dto, "field79");
        String field80 = (String) PropertyUtils.getSimpleProperty(dto, "field80");



        String field81 = (String) PropertyUtils.getSimpleProperty(dto, "field81");
        String field82 = (String) PropertyUtils.getSimpleProperty(dto, "field82");
        String field83 = (String) PropertyUtils.getSimpleProperty(dto, "field83");
        String field84 = (String) PropertyUtils.getSimpleProperty(dto, "field84");
        String field85 = (String) PropertyUtils.getSimpleProperty(dto, "field85");
        String field86 = (String) PropertyUtils.getSimpleProperty(dto, "field86");
        String field87 = (String) PropertyUtils.getSimpleProperty(dto, "field87");
        String field88 = (String) PropertyUtils.getSimpleProperty(dto, "field88");
        String field89 = (String) PropertyUtils.getSimpleProperty(dto, "field89");
        String field90 = (String) PropertyUtils.getSimpleProperty(dto, "field90");



        String field91 = (String) PropertyUtils.getSimpleProperty(dto, "field91");
        String field92 = (String) PropertyUtils.getSimpleProperty(dto, "field92");
        String field93 = (String) PropertyUtils.getSimpleProperty(dto, "field93");
        String field94 = (String) PropertyUtils.getSimpleProperty(dto, "field94");
        String field95 = (String) PropertyUtils.getSimpleProperty(dto, "field95");
        String field96 = (String) PropertyUtils.getSimpleProperty(dto, "field96");
        String field97 = (String) PropertyUtils.getSimpleProperty(dto, "field97");
        String field98 = (String) PropertyUtils.getSimpleProperty(dto, "field98");
        String field99 = (String) PropertyUtils.getSimpleProperty(dto, "field99");
        String field100 = (String) PropertyUtils.getSimpleProperty(dto, "field100");


    }

    @Benchmark
    public void test_field10_asm() {

        Field10DTO dto = new Field10DTO();

        access10.invoke(dto, "setField1", "");
        access10.invoke(dto, "setField2", "");
        access10.invoke(dto, "setField3", "");
        access10.invoke(dto, "setField4", "");
        access10.invoke(dto, "setField5", "");
        access10.invoke(dto, "setField6", "");
        access10.invoke(dto, "setField7", "");
        access10.invoke(dto, "setField8", "");
        access10.invoke(dto, "setField9", "");
        access10.invoke(dto, "setField10", "");


        String field1 = (String) access10.invoke(dto, "getField1");
        String field2 = (String) access10.invoke(dto, "getField2");
        String field3 = (String) access10.invoke(dto, "getField3");
        String field4 = (String) access10.invoke(dto, "getField4");
        String field5 = (String) access10.invoke(dto, "getField5");
        String field6 = (String) access10.invoke(dto, "getField6");
        String field7 = (String) access10.invoke(dto, "getField7");
        String field8 = (String) access10.invoke(dto, "getField8");
        String field9 = (String) access10.invoke(dto, "getField9");
        String field10 = (String) access10.invoke(dto, "getField10");

    }



    @Benchmark
    public void test_field50_asm() {

        Field50DTO dto = new Field50DTO();

        access50.invoke(dto, "setField1", "");
        access50.invoke(dto, "setField2", "");
        access50.invoke(dto, "setField3", "");
        access50.invoke(dto, "setField4", "");
        access50.invoke(dto, "setField5", "");
        access50.invoke(dto, "setField6", "");
        access50.invoke(dto, "setField7", "");
        access50.invoke(dto, "setField8", "");
        access50.invoke(dto, "setField9", "");

        access50.invoke(dto, "setField10", "");

        access50.invoke(dto, "setField11", "");
        access50.invoke(dto, "setField12", "");
        access50.invoke(dto, "setField13", "");
        access50.invoke(dto, "setField14", "");
        access50.invoke(dto, "setField15", "");
        access50.invoke(dto, "setField16", "");
        access50.invoke(dto, "setField17", "");
        access50.invoke(dto, "setField18", "");
        access50.invoke(dto, "setField19", "");
        access50.invoke(dto, "setField20", "");

        access50.invoke(dto, "setField21", "");
        access50.invoke(dto, "setField22", "");
        access50.invoke(dto, "setField23", "");
        access50.invoke(dto, "setField24", "");
        access50.invoke(dto, "setField25", "");
        access50.invoke(dto, "setField26", "");
        access50.invoke(dto, "setField27", "");
        access50.invoke(dto, "setField28", "");
        access50.invoke(dto, "setField29", "");
        access50.invoke(dto, "setField30", "");

        access50.invoke(dto, "setField31", "");
        access50.invoke(dto, "setField32", "");
        access50.invoke(dto, "setField33", "");
        access50.invoke(dto, "setField34", "");
        access50.invoke(dto, "setField35", "");
        access50.invoke(dto, "setField36", "");
        access50.invoke(dto, "setField37", "");
        access50.invoke(dto, "setField38", "");
        access50.invoke(dto, "setField39", "");
        access50.invoke(dto, "setField40", "");


        access50.invoke(dto, "setField41", "");
        access50.invoke(dto, "setField42", "");
        access50.invoke(dto, "setField43", "");
        access50.invoke(dto, "setField44", "");
        access50.invoke(dto, "setField45", "");
        access50.invoke(dto, "setField46", "");
        access50.invoke(dto, "setField47", "");
        access50.invoke(dto, "setField48", "");
        access50.invoke(dto, "setField49", "");
        access50.invoke(dto, "setField50", "");




        String field1 = (String) access50.invoke(dto, "getField1");
        String field2 = (String) access50.invoke(dto, "getField2");
        String field3 = (String) access50.invoke(dto, "getField3");
        String field4 = (String) access50.invoke(dto, "getField4");
        String field5 = (String) access50.invoke(dto, "getField5");
        String field6 = (String) access50.invoke(dto, "getField6");
        String field7 = (String) access50.invoke(dto, "getField7");
        String field8 = (String) access50.invoke(dto, "getField8");
        String field9 = (String) access50.invoke(dto, "getField9");
        String field10 = (String) access50.invoke(dto, "getField10");


        String field11 = (String) access50.invoke(dto, "getField11");
        String field12 = (String) access50.invoke(dto, "getField12");
        String field13 = (String) access50.invoke(dto, "getField13");
        String field14 = (String) access50.invoke(dto, "getField14");
        String field15 = (String) access50.invoke(dto, "getField15");
        String field16 = (String) access50.invoke(dto, "getField16");
        String field17 = (String) access50.invoke(dto, "getField17");
        String field18 = (String) access50.invoke(dto, "getField18");
        String field19 = (String) access50.invoke(dto, "getField19");
        String field20 = (String) access50.invoke(dto, "getField20");



        String field21 = (String) access50.invoke(dto, "getField21");
        String field22 = (String) access50.invoke(dto, "getField22");
        String field23 = (String) access50.invoke(dto, "getField23");
        String field24 = (String) access50.invoke(dto, "getField24");
        String field25 = (String) access50.invoke(dto, "getField25");
        String field26 = (String) access50.invoke(dto, "getField26");
        String field27 = (String) access50.invoke(dto, "getField27");
        String field28 = (String) access50.invoke(dto, "getField28");
        String field29 = (String) access50.invoke(dto, "getField29");
        String field30 = (String) access50.invoke(dto, "getField30");



        String field31 = (String) access50.invoke(dto, "getField31");
        String field32 = (String) access50.invoke(dto, "getField32");
        String field33 = (String) access50.invoke(dto, "getField33");
        String field34 = (String) access50.invoke(dto, "getField34");
        String field35 = (String) access50.invoke(dto, "getField35");
        String field36 = (String) access50.invoke(dto, "getField36");
        String field37 = (String) access50.invoke(dto, "getField37");
        String field38 = (String) access50.invoke(dto, "getField38");
        String field39 = (String) access50.invoke(dto, "getField39");
        String field40 = (String) access50.invoke(dto, "getField40");



        String field41 = (String) access50.invoke(dto, "getField41");
        String field42 = (String) access50.invoke(dto, "getField42");
        String field43 = (String) access50.invoke(dto, "getField43");
        String field44 = (String) access50.invoke(dto, "getField44");
        String field45 = (String) access50.invoke(dto, "getField45");
        String field46 = (String) access50.invoke(dto, "getField46");
        String field47 = (String) access50.invoke(dto, "getField47");
        String field48 = (String) access50.invoke(dto, "getField48");
        String field49 = (String) access50.invoke(dto, "getField49");
        String field50 = (String) access50.invoke(dto, "getField50");


    }



    @Benchmark
    public void test_field100_asm() {

        Field100DTO dto = new Field100DTO();

        access100.invoke(dto, "setField1", "");
        access100.invoke(dto, "setField2", "");
        access100.invoke(dto, "setField3", "");
        access100.invoke(dto, "setField4", "");
        access100.invoke(dto, "setField5", "");
        access100.invoke(dto, "setField6", "");
        access100.invoke(dto, "setField7", "");
        access100.invoke(dto, "setField8", "");
        access100.invoke(dto, "setField9", "");

        access100.invoke(dto, "setField10", "");

        access100.invoke(dto, "setField11", "");
        access100.invoke(dto, "setField12", "");
        access100.invoke(dto, "setField13", "");
        access100.invoke(dto, "setField14", "");
        access100.invoke(dto, "setField15", "");
        access100.invoke(dto, "setField16", "");
        access100.invoke(dto, "setField17", "");
        access100.invoke(dto, "setField18", "");
        access100.invoke(dto, "setField19", "");
        access100.invoke(dto, "setField20", "");

        access100.invoke(dto, "setField21", "");
        access100.invoke(dto, "setField22", "");
        access100.invoke(dto, "setField23", "");
        access100.invoke(dto, "setField24", "");
        access100.invoke(dto, "setField25", "");
        access100.invoke(dto, "setField26", "");
        access100.invoke(dto, "setField27", "");
        access100.invoke(dto, "setField28", "");
        access100.invoke(dto, "setField29", "");
        access100.invoke(dto, "setField30", "");

        access100.invoke(dto, "setField31", "");
        access100.invoke(dto, "setField32", "");
        access100.invoke(dto, "setField33", "");
        access100.invoke(dto, "setField34", "");
        access100.invoke(dto, "setField35", "");
        access100.invoke(dto, "setField36", "");
        access100.invoke(dto, "setField37", "");
        access100.invoke(dto, "setField38", "");
        access100.invoke(dto, "setField39", "");
        access100.invoke(dto, "setField40", "");


        access100.invoke(dto, "setField41", "");
        access100.invoke(dto, "setField42", "");
        access100.invoke(dto, "setField43", "");
        access100.invoke(dto, "setField44", "");
        access100.invoke(dto, "setField45", "");
        access100.invoke(dto, "setField46", "");
        access100.invoke(dto, "setField47", "");
        access100.invoke(dto, "setField48", "");
        access100.invoke(dto, "setField49", "");
        access100.invoke(dto, "setField50", "");


        access100.invoke(dto, "setField51", "");
        access100.invoke(dto, "setField52", "");
        access100.invoke(dto, "setField53", "");
        access100.invoke(dto, "setField54", "");
        access100.invoke(dto, "setField55", "");
        access100.invoke(dto, "setField56", "");
        access100.invoke(dto, "setField57", "");
        access100.invoke(dto, "setField58", "");
        access100.invoke(dto, "setField59", "");

        access100.invoke(dto, "setField60", "");

        access100.invoke(dto, "setField61", "");
        access100.invoke(dto, "setField62", "");
        access100.invoke(dto, "setField63", "");
        access100.invoke(dto, "setField64", "");
        access100.invoke(dto, "setField65", "");
        access100.invoke(dto, "setField66", "");
        access100.invoke(dto, "setField67", "");
        access100.invoke(dto, "setField68", "");
        access100.invoke(dto, "setField69", "");
        access100.invoke(dto, "setField70", "");

        access100.invoke(dto, "setField71", "");
        access100.invoke(dto, "setField72", "");
        access100.invoke(dto, "setField73", "");
        access100.invoke(dto, "setField74", "");
        access100.invoke(dto, "setField75", "");
        access100.invoke(dto, "setField76", "");
        access100.invoke(dto, "setField77", "");
        access100.invoke(dto, "setField78", "");
        access100.invoke(dto, "setField79", "");
        access100.invoke(dto, "setField80", "");

        access100.invoke(dto, "setField81", "");
        access100.invoke(dto, "setField82", "");
        access100.invoke(dto, "setField83", "");
        access100.invoke(dto, "setField84", "");
        access100.invoke(dto, "setField85", "");
        access100.invoke(dto, "setField86", "");
        access100.invoke(dto, "setField87", "");
        access100.invoke(dto, "setField88", "");
        access100.invoke(dto, "setField89", "");
        access100.invoke(dto, "setField90", "");


        access100.invoke(dto, "setField91", "");
        access100.invoke(dto, "setField92", "");
        access100.invoke(dto, "setField93", "");
        access100.invoke(dto, "setField94", "");
        access100.invoke(dto, "setField95", "");
        access100.invoke(dto, "setField96", "");
        access100.invoke(dto, "setField97", "");
        access100.invoke(dto, "setField98", "");
        access100.invoke(dto, "setField99", "");
        access100.invoke(dto, "setField100", "");





        String field1 = (String) access100.invoke(dto, "getField1");
        String field2 = (String) access100.invoke(dto, "getField2");
        String field3 = (String) access100.invoke(dto, "getField3");
        String field4 = (String) access100.invoke(dto, "getField4");
        String field5 = (String) access100.invoke(dto, "getField5");
        String field6 = (String) access100.invoke(dto, "getField6");
        String field7 = (String) access100.invoke(dto, "getField7");
        String field8 = (String) access100.invoke(dto, "getField8");
        String field9 = (String) access100.invoke(dto, "getField9");
        String field10 = (String) access100.invoke(dto, "getField10");


        String field11 = (String) access100.invoke(dto, "getField11");
        String field12 = (String) access100.invoke(dto, "getField12");
        String field13 = (String) access100.invoke(dto, "getField13");
        String field14 = (String) access100.invoke(dto, "getField14");
        String field15 = (String) access100.invoke(dto, "getField15");
        String field16 = (String) access100.invoke(dto, "getField16");
        String field17 = (String) access100.invoke(dto, "getField17");
        String field18 = (String) access100.invoke(dto, "getField18");
        String field19 = (String) access100.invoke(dto, "getField19");
        String field20 = (String) access100.invoke(dto, "getField20");



        String field21 = (String) access100.invoke(dto, "getField21");
        String field22 = (String) access100.invoke(dto, "getField22");
        String field23 = (String) access100.invoke(dto, "getField23");
        String field24 = (String) access100.invoke(dto, "getField24");
        String field25 = (String) access100.invoke(dto, "getField25");
        String field26 = (String) access100.invoke(dto, "getField26");
        String field27 = (String) access100.invoke(dto, "getField27");
        String field28 = (String) access100.invoke(dto, "getField28");
        String field29 = (String) access100.invoke(dto, "getField29");
        String field30 = (String) access100.invoke(dto, "getField30");



        String field31 = (String) access100.invoke(dto, "getField31");
        String field32 = (String) access100.invoke(dto, "getField32");
        String field33 = (String) access100.invoke(dto, "getField33");
        String field34 = (String) access100.invoke(dto, "getField34");
        String field35 = (String) access100.invoke(dto, "getField35");
        String field36 = (String) access100.invoke(dto, "getField36");
        String field37 = (String) access100.invoke(dto, "getField37");
        String field38 = (String) access100.invoke(dto, "getField38");
        String field39 = (String) access100.invoke(dto, "getField39");
        String field40 = (String) access100.invoke(dto, "getField40");



        String field41 = (String) access100.invoke(dto, "getField41");
        String field42 = (String) access100.invoke(dto, "getField42");
        String field43 = (String) access100.invoke(dto, "getField43");
        String field44 = (String) access100.invoke(dto, "getField44");
        String field45 = (String) access100.invoke(dto, "getField45");
        String field46 = (String) access100.invoke(dto, "getField46");
        String field47 = (String) access100.invoke(dto, "getField47");
        String field48 = (String) access100.invoke(dto, "getField48");
        String field49 = (String) access100.invoke(dto, "getField49");
        String field50 = (String) access100.invoke(dto, "getField50");




        String field51 = (String) access100.invoke(dto, "getField51");
        String field52 = (String) access100.invoke(dto, "getField52");
        String field53 = (String) access100.invoke(dto, "getField53");
        String field54 = (String) access100.invoke(dto, "getField54");
        String field55 = (String) access100.invoke(dto, "getField55");
        String field56 = (String) access100.invoke(dto, "getField56");
        String field57 = (String) access100.invoke(dto, "getField57");
        String field58 = (String) access100.invoke(dto, "getField58");
        String field59 = (String) access100.invoke(dto, "getField59");
        String field60 = (String) access100.invoke(dto, "getField60");


        String field61 = (String) access100.invoke(dto, "getField61");
        String field62 = (String) access100.invoke(dto, "getField62");
        String field63 = (String) access100.invoke(dto, "getField63");
        String field64 = (String) access100.invoke(dto, "getField64");
        String field65 = (String) access100.invoke(dto, "getField65");
        String field66 = (String) access100.invoke(dto, "getField66");
        String field67 = (String) access100.invoke(dto, "getField67");
        String field68 = (String) access100.invoke(dto, "getField68");
        String field69 = (String) access100.invoke(dto, "getField69");
        String field70 = (String) access100.invoke(dto, "getField70");



        String field71 = (String) access100.invoke(dto, "getField71");
        String field72 = (String) access100.invoke(dto, "getField72");
        String field73 = (String) access100.invoke(dto, "getField73");
        String field74 = (String) access100.invoke(dto, "getField74");
        String field75 = (String) access100.invoke(dto, "getField75");
        String field76 = (String) access100.invoke(dto, "getField76");
        String field77 = (String) access100.invoke(dto, "getField77");
        String field78 = (String) access100.invoke(dto, "getField78");
        String field79 = (String) access100.invoke(dto, "getField79");
        String field80 = (String) access100.invoke(dto, "getField80");



        String field81 = (String) access100.invoke(dto, "getField81");
        String field82 = (String) access100.invoke(dto, "getField82");
        String field83 = (String) access100.invoke(dto, "getField83");
        String field84 = (String) access100.invoke(dto, "getField84");
        String field85 = (String) access100.invoke(dto, "getField85");
        String field86 = (String) access100.invoke(dto, "getField86");
        String field87 = (String) access100.invoke(dto, "getField87");
        String field88 = (String) access100.invoke(dto, "getField88");
        String field89 = (String) access100.invoke(dto, "getField89");
        String field90 = (String) access100.invoke(dto, "getField90");



        String field91 = (String) access100.invoke(dto, "getField91");
        String field92 = (String) access100.invoke(dto, "getField92");
        String field93 = (String) access100.invoke(dto, "getField93");
        String field94 = (String) access100.invoke(dto, "getField94");
        String field95 = (String) access100.invoke(dto, "getField95");
        String field96 = (String) access100.invoke(dto, "getField96");
        String field97 = (String) access100.invoke(dto, "getField97");
        String field98 = (String) access100.invoke(dto, "getField98");
        String field99 = (String) access100.invoke(dto, "getField99");
        String field100 = (String) access100.invoke(dto, "getField100");


    }

}
