package OOP_Homework3.iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestListSetMap {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Jane");
    list.add("Smith");
    list.add("Sara");

    Iterator<String> iterator1 = list.iterator();
    while (iterator1.hasNext()) {
      String nextName = iterator1.next();
    }
    while (iterator1.hasNext()) {
      System.out.println(iterator1.next());
    }
    System.out.println();
    list.remove(list.size() - 1);

    Iterator<String> iteratorR = list.iterator();
    while (iteratorR.hasNext()) {
      String nextName = iteratorR.next();
      System.out.println(nextName);
    }
    while (iteratorR.hasNext()) {
      String nextName = iteratorR.next();
      System.out.println(nextName);
      iteratorR.remove();
    }



    System.out.println();

    Set<String> set = new HashSet<>();
    set.add("Jane");
    set.add("Smith");
    set.add("Sara");
    set.add("Marta");
    set.add("Tamara");

    Iterator<String> iterator2 = set.iterator();
    while (iterator2.hasNext()) {
      String nextName = iterator2.next();
      System.out.println(nextName);

    }
    System.out.println();


    Map<String, String> map = new HashMap<>();
    map.put("first", "Jane");
    map.put("second", "Smith");
    map.put("third", "Sara");
    map.put("fourth", "Marta");
    map.put("fifth", "Tamara");

    Iterator<String> keyIterator = map.keySet().iterator();
    Iterator<String> valueIterator = map.values().iterator();

    Iterator<Entry<String, String>> entryIterator = map.entrySet().iterator();
    while (keyIterator.hasNext()) {
      String mapKey = keyIterator.next();
      System.out.println(mapKey);

    }
    while (valueIterator.hasNext()) {
      String mapValue = valueIterator.next();
      System.out.println(mapValue);

    }
    while (entryIterator.hasNext()) {

      System.out.println(entryIterator.next());
    }
    System.out.println();
    for (Map.Entry<String, String> entry : map.entrySet()) {
      String currentKey = entry.getKey();
      String currentValue = entry.getValue();
      System.out.println(currentKey + "=" + currentValue);


    }

  }
}
