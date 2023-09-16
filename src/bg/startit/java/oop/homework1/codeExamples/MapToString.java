package bg.startit.java.oop.homework1.codeExamples;

public class MapToString {

}
/*Using Java8:

private static Map<String, String> prepareMap() {
    Map<String, String> map = new LinkedHashMap<>();
    map.put("key1", "val1");
    map.put("key2", "val2");
    return map;
}

@Test
public void toStr() {
    assertEquals("key1_val1|key2_val2", prepareMap().entrySet().stream()
            .map(e -> e.getKey() + "_" + e.getValue())
            .collect(Collectors.joining("|")));
}

@Test
public void toStrFunction() {
    assertEquals("key1_val1|key2_val2", joiner("|", "_").apply(prepareMap()));
}

private static Function<Map<String, String>, String> joiner(String entrySeparator, String valueSeparator) {
    return m -> m.entrySet().stream()
            .map(e -> e.getKey() + valueSeparator + e.getValue())
            .collect(Collectors.joining(entrySeparator));
}

@Test
public void toMap() {
    assertEquals("{key1=val1, key2=val2}", Stream.of("key1_val1|key2_val2".split("\\|"))
            .map(e -> e.split("_", 2))
            .collect(Collectors.toMap(e -> e[0], e -> e.length > 1 ? e[1] : null)).toString());
}

@Test
public void toMapFunction() {
    assertEquals("{key1=val1, key2=val2}", splitter("\\|", "_").apply("key1_val1|key2_val2").toString());
}

private static Function<String, Map<String, String>> splitter(String entrySeparator, String valueSeparator) {
    return s -> Stream.of(s.split(entrySeparator))
            .map(e -> e.split(valueSeparator, 2))
            .collect(Collectors.toMap(e -> e[0], e -> e.length > 1 ? e[1] : null));
}*/