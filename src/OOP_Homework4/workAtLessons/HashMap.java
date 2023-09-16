package OOP_Homework4.workAtLessons;



import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap {

  public static void main(String[] args) {
    Map<String, String > map=createMap();
    System.out.println("Method 1: Classic Iterator method");
    Iterator<Map.Entry<String ,String>> itr= map.entrySet().iterator();
    while (itr.hasNext()){
      Map.Entry<String, String> entry = itr.next();
      System.out.println(entry.getKey()+"|"+entry.getValue());
    }
    System.out.println();
    System.out.println("Method 2: for each method");
    for (Map.Entry<String, String >entry: map.entrySet()) {
      System.out.println(entry.getKey()+"|"+entry.getValue());
    }
    System.out.println();
    System.out.println("Method 3: Java 8 forEach method");
    map.forEach((k,v)-> System.out.println(k+"|"+v));
    System.out.println();
    System.out.println("Method 4: iterate through key or values");
    for (String key:map.keySet()) {
      System.out.println("Key: " +key);
    }
    System.out.println();
    for (String value: map.values()) {
      System.out.println("Value:" +value);
    }
    System.out.println();
    System.out.println("Method 5: Iterate trough key and get values");
    for (String key:
    map.keySet()) {
      System.out.println(key+"|"+map.get(key));
    }
  }

  private static Map<String, String> createMap() {
    return Map.of("Frank", "Diveloper", "Robert", "Senior developer",
        "Julie", "tester", "James", "Boss");
  }
}
