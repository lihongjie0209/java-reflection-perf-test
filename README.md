## 背景
### <font style="color:rgb(6, 6, 7);">Java反射机制概述</font>
<font style="color:rgb(6, 6, 7);">Java反射机制是Java语言的一个重要特性，它允许程序在运行时访问、检查和修改它自己的结构，特别是类的成员（属性和方法）。这种动态性使得Java能够灵活地处理各种情况，尤其是在框架开发和动态代理中。</font>

#### <font style="color:rgb(6, 6, 7);">反射的定义</font>
<font style="color:rgb(6, 6, 7);">反射是计算机编程中的一种能力，允许程序在运行时访问、检查和修改它自己的结构和行为。在Java中，这通过</font>`java.lang.reflect`<font style="color:rgb(6, 6, 7);">包实现，提供了动态创建和操作对象、捕获类型信息、调用方法和访问字段的能力。</font>

#### <font style="color:rgb(6, 6, 7);">反射的应用场景</font>
<font style="color:rgb(6, 6, 7);">反射在Java编程中有着广泛的应用，以下是一些常见的应用场景：</font>

+ **<font style="color:rgb(6, 6, 7);">动态代理</font>**<font style="color:rgb(6, 6, 7);">：在不修改源代码的情况下，动态地为对象添加额外的功能。</font>
+ **<font style="color:rgb(6, 6, 7);">框架开发</font>**<font style="color:rgb(6, 6, 7);">：许多框架（如Spring）使用反射来实现依赖注入和AOP（面向切面编程）。</font>
+ **<font style="color:rgb(6, 6, 7);">序列化和反序列化</font>**<font style="color:rgb(6, 6, 7);">：在对象序列化和反序列化过程中，反射用于动态访问对象的属性。</font>
+ **<font style="color:rgb(6, 6, 7);">ORM框架</font>**<font style="color:rgb(6, 6, 7);">: 如Mybatis中使用反射数据库行映射到Java对象</font>
+ **<font style="color:rgb(6, 6, 7);">对象之间转化</font>**<font style="color:rgb(6, 6, 7);">:  如各种DTO,VO, DO 之间的相互转换</font>

### <font style="color:rgb(6, 6, 7);">反射的性能问题</font>
<font style="color:rgb(6, 6, 7);">尽管反射提供了极大的灵活性，但它也带来了性能上的开销。以下是反射可能导致性能问题的几个方面：</font>

#### <font style="color:rgb(6, 6, 7);">反射与Java字节码</font>
<font style="color:rgb(6, 6, 7);">反射操作通常涉及到动态解析类和方法，这需要JVM在运行时解析字节码，增加了额外的处理步骤。</font>

#### <font style="color:rgb(6, 6, 7);">反射的性能开销</font>
+ **<font style="color:rgb(6, 6, 7);">动态解析类和方法</font>**<font style="color:rgb(6, 6, 7);">：每次反射调用都可能涉及到查找类和方法的元数据，这是一个相对耗时的过程。</font>
+ **<font style="color:rgb(6, 6, 7);">安全检查</font>**<font style="color:rgb(6, 6, 7);">：反射调用通常需要绕过Java的安全机制，这需要进行额外的安全检查。</font>
+ **<font style="color:rgb(6, 6, 7);">缓存机制的缺失</font>**<font style="color:rgb(6, 6, 7);">：与直接的方法调用相比，反射调用通常没有编译器优化和缓存机制，导致每次调用都可能重复上述开销。</font>

<font style="color:rgb(6, 6, 7);"></font>

## <font style="color:rgb(6, 6, 7);">常用的反射类库</font>
### <font style="color:rgb(6, 6, 7);">使用 Apache BeanUtils</font>
<font style="color:rgb(6, 6, 7);">获取字段值：</font>

```java
Field10DTO dto = new Field10DTO();

PropertyUtils.setSimpleProperty(dto, "field1", "");
```

<font style="color:rgb(6, 6, 7);">设置字段值：</font>

```java
String field1 = (String) PropertyUtils.getSimpleProperty(dto, "field1");
```

### <font style="color:rgb(6, 6, 7);">使用 Hutool ReflectionUtil</font>
<font style="color:rgb(6, 6, 7);">获取字段值：</font>

```plain
java

Object nameValue = ReflectUtil.getFieldValue(person, "name");
```

<font style="color:rgb(6, 6, 7);">设置字段值：</font>

```java
ReflectUtil.setFieldValue(person, "name", "New Name");
```

### <font style="color:rgb(6, 6, 7);">使用 ReflectASM</font>
+ **<font style="color:rgb(6, 6, 7);">基本信息</font>**<font style="color:rgb(6, 6, 7);">：ReflectASM 是一个使用字节码生成来加强反射性能的库。它通过创建特定的访问类来设置/获取字段、调用方法或实例化对象，避免了传统 Java 反射的性能开销</font><font style="color:rgb(6, 6, 7);">。</font>
+ **<font style="color:rgb(6, 6, 7);">优势</font>**<font style="color:rgb(6, 6, 7);">：相较于传统 Java 反射，ReflectASM 在字段访问、方法调用和构造函数调用方面展现出卓越的执行速度，特别是对于原始类型的访问，避免了不必要的装箱拆箱过程，进一步提升了效率</font>

<font style="color:rgb(6, 6, 7);">获取字段访问器：</font>

```java
FieldAccess fieldAccess = FieldAccess.get(User.class);
```

<font style="color:rgb(6, 6, 7);">设置字段值：</font>

```java
fieldAccess.set(user, "name", "New Name");
```

<font style="color:rgb(6, 6, 7);">获取字段值：</font>

```java
Object nameValue = fieldAccess.get(user, "name");
```

<font style="color:rgb(6, 6, 7);"></font>

<font style="color:rgb(6, 6, 7);"></font>

<font style="color:rgb(6, 6, 7);"></font>

## <font style="color:rgb(6, 6, 7);">性能测试</font>
### 测试内容
测试对象分为三种, 分别为 Field10DTO, Field50DTO, Field100DTO 分别表示有 10个, 50个, 100个字段的Java对象,

分别使用每个工具对上述对象进行字段的读取和设置,以Java代码直接访问为基准.

```java
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
```



### 测试工具
<font style="color:rgb(6, 6, 7);">JMH（Java Microbenchmark Harness）是一个用于Java代码基准测试的框架，它提供了一种简单的方式来编写和运行基准测试。以下是本次测试的配置:</font>

1. `@BenchmarkMode(Mode.AverageTime)`<font style="color:rgb(6, 6, 7);">：</font>
    - <font style="color:rgb(6, 6, 7);">这个注解指定了基准测试的性能指标。</font>`Mode.AverageTime`<font style="color:rgb(6, 6, 7);">表示测试结果将报告操作的平均执行时间（以纳秒为单位）。</font>
2. `@OutputTimeUnit(TimeUnit.NANOSECONDS)`<font style="color:rgb(6, 6, 7);">：</font>
    - <font style="color:rgb(6, 6, 7);">这个注解设置了基准测试结果的时间单位。</font>`TimeUnit.NANOSECONDS`<font style="color:rgb(6, 6, 7);">意味着所有的测试结果都将以纳秒为单位输出。</font>
3. `@Warmup(iterations = 5, time = 1)`<font style="color:rgb(6, 6, 7);">：</font>
    - `@Warmup`<font style="color:rgb(6, 6, 7);">注解用于配置测试前的热身阶段。</font>`iterations = 5`<font style="color:rgb(6, 6, 7);">表示热身阶段将执行5次迭代，</font>`time = 1`<font style="color:rgb(6, 6, 7);">表示每次迭代的时间为1秒。热身阶段的目的是让JVM的即时编译器（JIT）有足够的时间对代码进行优化，以减少测试结果的偏差。</font>
4. `@Measurement(iterations = 5, time = 1)`<font style="color:rgb(6, 6, 7);">：</font>
    - `@Measurement`<font style="color:rgb(6, 6, 7);">注解用于配置实际测试阶段。</font>`iterations = 5`<font style="color:rgb(6, 6, 7);">表示实际测试将执行5次迭代，</font>`time = 1`<font style="color:rgb(6, 6, 7);">表示每次迭代的时间为1秒。这个阶段的结果将被用于计算基准测试的性能指标。</font>
5. `@Fork(1)`<font style="color:rgb(6, 6, 7);">：</font>
    - `@Fork`<font style="color:rgb(6, 6, 7);">注解用于配置测试的分叉数。</font>`1`<font style="color:rgb(6, 6, 7);">表示测试将在当前JVM进程中运行，不进行分叉。分叉可以减少测试结果受到JVM状态的影响，但会增加测试的运行时间。</font>
6. `@State(Scope.Thread)`<font style="color:rgb(6, 6, 7);">：</font>
    - `@State`<font style="color:rgb(6, 6, 7);">注解用于定义测试状态，它指示JMH如何为每个测试线程提供测试实例。</font>`Scope.Thread`<font style="color:rgb(6, 6, 7);">表示每个测试线程都将有自己的测试实例，这样可以确保测试的线程安全性，避免测试状态在多个线程间共享。</font>

<font style="color:rgb(6, 6, 7);"></font>

### <font style="color:rgb(6, 6, 7);">测试结果</font>
### Java21
```java
Benchmark                                Mode  Cnt      Score      Error  Units
PerfTest.test_field100_apache            avgt    5  46713.820 ± 8098.511  ns/op
PerfTest.test_field100_asm               avgt    5  38908.780 ± 6243.990  ns/op
PerfTest.test_field100_hutool            avgt    5  30001.510 ± 2226.685  ns/op
PerfTest.test_field100_hutool_field_map  avgt    5   6097.583 ±  366.168  ns/op
PerfTest.test_field100_java_baseline     avgt    5      1.336 ±    0.047  ns/op
PerfTest.test_field10_apache             avgt    5   1277.222 ±  100.232  ns/op
PerfTest.test_field10_asm                avgt    5    627.314 ±  154.954  ns/op
PerfTest.test_field10_hutool             avgt    5    506.545 ±   51.587  ns/op
PerfTest.test_field10_hutool_field_map   avgt    5    268.589 ±   12.779  ns/op
PerfTest.test_field10_java_baseline      avgt    5      0.267 ±    0.039  ns/op
PerfTest.test_field50_apache             avgt    5  12964.471 ±  725.788  ns/op
PerfTest.test_field50_asm                avgt    5   9276.174 ±  986.597  ns/op
PerfTest.test_field50_hutool             avgt    5   8632.140 ±  539.293  ns/op
PerfTest.test_field50_hutool_field_map   avgt    5   2563.290 ±  273.353  ns/op
PerfTest.test_field50_java_baseline      avgt    5      0.266 ±    0.024  ns/op
```



### Java8
```java
PerfTest.test_field100_apache            avgt    5  40734.036 ±  3085.585  ns/op
PerfTest.test_field100_asm               avgt    5  46672.139 ± 11594.689  ns/op
PerfTest.test_field100_hutool            avgt    5  27084.951 ±   720.609  ns/op
PerfTest.test_field100_hutool_field_map  avgt    5   2695.010 ±   209.449  ns/op
PerfTest.test_field100_java_baseline     avgt    5      1.113 ±     0.077  ns/op
PerfTest.test_field10_apache             avgt    5   1612.054 ±    58.736  ns/op
PerfTest.test_field10_asm                avgt    5    671.457 ±   101.610  ns/op
PerfTest.test_field10_hutool             avgt    5    555.103 ±    83.472  ns/op
PerfTest.test_field10_hutool_field_map   avgt    5    230.514 ±    26.822  ns/op
PerfTest.test_field10_java_baseline      avgt    5      0.219 ±     0.022  ns/op
PerfTest.test_field50_apache             avgt    5  14367.713 ±   737.758  ns/op
PerfTest.test_field50_asm                avgt    5   9788.138 ±   478.383  ns/op
PerfTest.test_field50_hutool             avgt    5   7666.620 ±   295.480  ns/op
PerfTest.test_field50_hutool_field_map   avgt    5   1321.486 ±   234.233  ns/op
PerfTest.test_field50_java_baseline      avgt    5      0.217 ±     0.009  ns/op
```



### Java21 比 Java8 性能差?


参考 JEP 416: Reimplement Core Reflection with Method Handles([https://openjdk.org/jeps/416](https://openjdk.org/jeps/416)), 在Java 18 之后

<font style="color:rgb(6, 6, 7);">“使用 Method Handles 重新实现核心反射”。这个 JEP 的主要目标是将 </font>`<font style="color:rgb(6, 6, 7);">java.lang.reflect.Method</font>`<font style="color:rgb(6, 6, 7);">、</font>`<font style="color:rgb(6, 6, 7);">Constructor</font>`<font style="color:rgb(6, 6, 7);"> 和 </font>`<font style="color:rgb(6, 6, 7);">Field</font>`<font style="color:rgb(6, 6, 7);"> 重新实现在 </font>`<font style="color:rgb(6, 6, 7);">java.lang.invoke</font>`<font style="color:rgb(6, 6, 7);"> 的 Method Handles 之上，以减少 </font>`<font style="color:rgb(6, 6, 7);">java.lang.reflect</font>`<font style="color:rgb(6, 6, 7);"> 和 </font>`<font style="color:rgb(6, 6, 7);">java.lang.invoke</font>`<font style="color:rgb(6, 6, 7);"> API 的维护和开发成本。</font>

1. **<font style="color:rgb(6, 6, 7);">性能提升</font>**<font style="color:rgb(6, 6, 7);">：</font>
    - <font style="color:rgb(6, 6, 7);">JEP 416 通过直接使用 Method Handles 进行方法句柄的调用，而不是生成字节码，可以减少反射操作的开销。在微基准测试中，当</font><font style="color:rgb(6, 6, 7);"> </font>`Method`<font style="color:rgb(6, 6, 7);">、</font>`Constructor`<font style="color:rgb(6, 6, 7);"> </font><font style="color:rgb(6, 6, 7);">和</font><font style="color:rgb(6, 6, 7);"> </font>`Field`<font style="color:rgb(6, 6, 7);"> </font><font style="color:rgb(6, 6, 7);">实例被存储在</font><font style="color:rgb(6, 6, 7);"> </font>`static final`<font style="color:rgb(6, 6, 7);"> </font><font style="color:rgb(6, 6, 7);">字段中时，新实现的性能比旧实现快了 43-57%。</font>
2. **<font style="color:rgb(6, 6, 7);">性能退化</font>**<font style="color:rgb(6, 6, 7);">：</font>
    - <font style="color:rgb(6, 6, 7);">当 </font>`Method`<font style="color:rgb(6, 6, 7);">、</font>`Constructor`<font style="color:rgb(6, 6, 7);"> 和 </font>`Field`<font style="color:rgb(6, 6, 7);"> 实例被存储在非常量字段（例如，非 </font>`final`<font style="color:rgb(6, 6, 7);"> 字段或数组元素）中时，性能可能会有所下降。在这种情况下，字段访问的性能比旧实现慢了 51-77%。</font>

<font style="color:rgb(6, 6, 7);">而我们使用的类库中应该是遇到了性能退化的场景,毕竟反射类库不会把</font>`Method`<font style="color:rgb(6, 6, 7);">、</font>`Constructor`<font style="color:rgb(6, 6, 7);"> 和 </font>`Field`<font style="color:rgb(6, 6, 7);"> 实例被存储在 </font>`static final`<font style="color:rgb(6, 6, 7);"> 字段中.</font>

<font style="color:rgb(6, 6, 7);"></font>

<font style="color:rgb(6, 6, 7);">作为对照我们使用Java 17 执行性能测试代码, 性能基本与 Java 8 一致, 也验证了我们的结论.</font>

```java
Benchmark                                Mode  Cnt      Score      Error  Units
PerfTest.test_field100_apache            avgt    5  39973.814 ± 1706.545  ns/op
PerfTest.test_field100_asm               avgt    5  36169.080 ± 3398.909  ns/op
PerfTest.test_field100_hutool            avgt    5  25893.004 ± 1811.389  ns/op
PerfTest.test_field100_hutool_field_map  avgt    5   2247.484 ±   49.914  ns/op
PerfTest.test_field100_java_baseline     avgt    5      1.077 ±    0.036  ns/op
PerfTest.test_field10_apache             avgt    5   1309.511 ±  704.898  ns/op
PerfTest.test_field10_asm                avgt    5    605.407 ±   15.117  ns/op
PerfTest.test_field10_hutool             avgt    5    460.895 ±   16.592  ns/op
PerfTest.test_field10_hutool_field_map   avgt    5    208.574 ±    6.166  ns/op
PerfTest.test_field10_java_baseline      avgt    5      0.254 ±    0.015  ns/op
PerfTest.test_field50_apache             avgt    5  11800.921 ±  851.484  ns/op
PerfTest.test_field50_asm                avgt    5   8967.307 ±  315.570  ns/op
PerfTest.test_field50_hutool             avgt    5   6996.358 ±  109.598  ns/op
PerfTest.test_field50_hutool_field_map   avgt    5   1119.316 ±   17.108  ns/op
PerfTest.test_field50_java_baseline      avgt    5      0.255 ±    0.012  ns/op
```







## 结果分析


### 基本结论
| **<font style="color:rgb(6, 6, 7);">Field Size</font>** | **<font style="color:rgb(6, 6, 7);">java_baseline</font>** | **<font style="color:rgb(6, 6, 7);">hutool_field_map</font>** | **<font style="color:rgb(6, 6, 7);">hutool</font>** | **<font style="color:rgb(6, 6, 7);">asm</font>** | **<font style="color:rgb(6, 6, 7);">apache</font>** |
| :--- | :--- | :--- | :--- | :--- | :--- |
| <font style="color:rgb(6, 6, 7);">field10</font> | <font style="color:rgb(6, 6, 7);">0.219</font> | <font style="color:rgb(6, 6, 7);">230.514</font> | <font style="color:rgb(6, 6, 7);">555.103</font> | <font style="color:rgb(6, 6, 7);">671.457</font> | <font style="color:rgb(6, 6, 7);">1612.054</font> |
| <font style="color:rgb(6, 6, 7);">field50</font> | <font style="color:rgb(6, 6, 7);">0.217</font> | <font style="color:rgb(6, 6, 7);">1321.486</font> | <font style="color:rgb(6, 6, 7);">7666.620</font> | <font style="color:rgb(6, 6, 7);">9788.138</font> | <font style="color:rgb(6, 6, 7);">14367.713</font> |
| <font style="color:rgb(6, 6, 7);">field100</font> | <font style="color:rgb(6, 6, 7);">1.113</font> | <font style="color:rgb(6, 6, 7);">2695.010</font> | <font style="color:rgb(6, 6, 7);">27084.951</font> | <font style="color:rgb(6, 6, 7);">46672.139</font> | <font style="color:rgb(6, 6, 7);">40734.036</font> |




初步分析:

1. 反射性能和java代码的执行效率能差3个数量级
2. asm代码生成性能提升不明显(有高级的用法, 并且取决于代码生成的质量), 不推荐使用
3. apache BeanUtils 中的 org.apache.commons.beanutils.PropertyUtils#getSimpleProperty 支持一些高级特性,性能最差.



### hutool使用性能优化


```java
public static Object getFieldValue(Object obj, String fieldName) throws UtilException {
		if (null == obj || StrUtil.isBlank(fieldName)) {
			return null;
		}
		return getFieldValue(obj, getField(obj instanceof Class ? (Class<?>) obj : obj.getClass(), fieldName));
	}

	public static Field getField(Class<?> beanClass, String name) throws SecurityException {
		final Field[] fields = getFields(beanClass);
		return ArrayUtil.firstMatch((field) -> name.equals(getFieldName(field)), fields);
	}

	public static Field[] getFields(Class<?> beanClass) throws SecurityException {
		Assert.notNull(beanClass);
		return FIELDS_CACHE.computeIfAbsent(beanClass, () -> getFieldsDirectly(beanClass, true));
	}
```

以 getFieldValue 为例, 优点是使用了 FIELDS_CACHE 对字段进行了缓存, 缺点是通过字段名称进行查找的时候使用循环进行查找.



优化之后使用Map存储字段映射



```java
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
```

| **<font style="color:rgb(6, 6, 7);">Field Size</font>** | **<font style="color:rgb(6, 6, 7);">java_baseline</font>** | **<font style="color:rgb(6, 6, 7);">hutool_field_map</font>** | **<font style="color:rgb(6, 6, 7);">hutool</font>** |
| :--- | :--- | :--- | :--- |
| <font style="color:rgb(6, 6, 7);">field10</font> | <font style="color:rgb(6, 6, 7);">0.219</font> | <font style="color:rgb(6, 6, 7);">230.514</font> | <font style="color:rgb(6, 6, 7);">555.103</font> |
| <font style="color:rgb(6, 6, 7);">field50</font> | <font style="color:rgb(6, 6, 7);">0.217</font> | <font style="color:rgb(6, 6, 7);">1321.486</font> | <font style="color:rgb(6, 6, 7);">7666.620</font> |
| <font style="color:rgb(6, 6, 7);">field100</font> | <font style="color:rgb(6, 6, 7);">1.113</font> | <font style="color:rgb(6, 6, 7);">2695.010</font> | <font style="color:rgb(6, 6, 7);">27084.951</font> |


通过这种方式之后在50个字段的对象中反射性能提高了6倍, 100个字段的对象中反射性能提高了一个数量级.

## 
## 结论
1. 热点代码避免使用反射, 会有3个数量级的性能影响.
2. 使用反射时需要建立合适的缓存,避免嵌套循环
3. 如果只是简单的反射需求, 不建议使用 Apache BeanUtils, 功能太多, 性能较差.





## 延伸 - <font style="color:rgb(37, 41, 51);">MapStruct(性能最好的DTO转换工具)</font>


<font style="color:rgb(37, 41, 51);">MapStruct是一个开源的基于Java的代码生成器，用于创建实现Java Bean之间转换的扩展映射器。使用MapStruct，我们只需要创建接口，而该库会通过注解在编译过程中自动创建具体的映射实现，大大减少了通常需要手工编写的样板代码的数量。</font>

<font style="color:rgb(37, 41, 51);"></font>

我们先从一些基本的映射开始。我们会创建一个Doctor对象和一个DoctorDto。为了方便起见，它们的属性字段都使用相同的名称：

```java
public class Doctor {
    private int id;
    private String name;
    // getters and setters or builder
}
```

```java
public class DoctorDto {
    private int id;
    private String name;
    // getters and setters or builder
}
```

<font style="color:rgb(37, 41, 51);">现在，为了在这两者之间进行映射，我们要创建一个</font>`<font style="color:rgb(37, 41, 51);">DoctorMapper</font>`<font style="color:rgb(37, 41, 51);">接口。对该接口使用</font>`<font style="color:rgb(37, 41, 51);">@Mapper</font>`<font style="color:rgb(37, 41, 51);">注解，MapStruct就会知道这是两个类之间的映射器。</font>

```java
@Mapper
public interface DoctorMapper {
    DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);
    DoctorDto toDto(Doctor doctor);
}
```

<font style="color:rgb(37, 41, 51);">这段代码中创建了一个</font>`<font style="color:rgb(37, 41, 51);">DoctorMapper</font>`<font style="color:rgb(37, 41, 51);">类型的实例</font>`<font style="color:rgb(37, 41, 51);">INSTANCE</font>`<font style="color:rgb(37, 41, 51);">，在生成对应的实现代码后，这就是我们调用的“入口”。</font>

<font style="color:rgb(37, 41, 51);">我们在接口中定义了</font>`<font style="color:rgb(37, 41, 51);">toDto()</font>`<font style="color:rgb(37, 41, 51);">方法，该方法接收一个</font>`<font style="color:rgb(37, 41, 51);">Doctor</font>`<font style="color:rgb(37, 41, 51);">实例为参数，并返回一个</font>`<font style="color:rgb(37, 41, 51);">DoctorDto</font>`<font style="color:rgb(37, 41, 51);">实例。这足以让MapStruct知道我们想把一个</font>`<font style="color:rgb(37, 41, 51);">Doctor</font>`<font style="color:rgb(37, 41, 51);">实例映射到一个</font>`<font style="color:rgb(37, 41, 51);">DoctorDto</font>`<font style="color:rgb(37, 41, 51);">实例。</font>

**<font style="color:rgb(37, 41, 51);">当我们构建/编译应用程序时，MapStruct注解处理器插件会识别出DoctorMapper接口并为其生成一个实现类。</font>**

```java
public class DoctorMapperImpl implements DoctorMapper {
    @Override
    public DoctorDto toDto(Doctor doctor) {
        if ( doctor == null ) {
            return null;
        }
        DoctorDtoBuilder doctorDto = DoctorDto.builder();

        doctorDto.id(doctor.getId());
        doctorDto.name(doctor.getName());

        return doctorDto.build();
    }
}
```

`<font style="color:rgb(37, 41, 51);">DoctorMapperImpl</font>`<font style="color:rgb(37, 41, 51);">类中包含一个</font>`<font style="color:rgb(37, 41, 51);">toDto()</font>`<font style="color:rgb(37, 41, 51);">方法，将我们的</font>`<font style="color:rgb(37, 41, 51);">Doctor</font>`<font style="color:rgb(37, 41, 51);">属性值映射到</font>`<font style="color:rgb(37, 41, 51);">DoctorDto</font>`<font style="color:rgb(37, 41, 51);">的属性字段中。如果要将</font>`<font style="color:rgb(37, 41, 51);">Doctor</font>`<font style="color:rgb(37, 41, 51);">实例映射到一个</font>`<font style="color:rgb(37, 41, 51);">DoctorDto</font>`<font style="color:rgb(37, 41, 51);">实例，可以这样写：</font>

```plain
DoctorDto doctorDto = DoctorMapper.INSTANCE.toDto(doctor);
```

**注意**<font style="color:rgb(37, 41, 51);">：你可能也注意到了上面实现代码中的</font>`<font style="color:rgb(37, 41, 51);">DoctorDtoBuilder</font>`<font style="color:rgb(37, 41, 51);">。因为builder代码往往比较长，为了简洁起见，这里省略了builder模式的实现代码。如果你的类中包含Builder，MapStruct会尝试使用它来创建实例；如果没有的话，MapStruct将通过</font>`<font style="color:rgb(37, 41, 51);">new</font>`<font style="color:rgb(37, 41, 51);">关键字进行实例化。</font>

<font style="color:rgb(37, 41, 51);">  
</font>

<font style="color:rgb(37, 41, 51);"></font>









