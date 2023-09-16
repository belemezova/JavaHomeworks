package OOP_Homework3.mapping;

import java.util.Comparator;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;


public class Maps {

  public static void main(String[] args) {

    Map<String, Integer> students = new HashMap<>();
    students.put("Marijka", 6);
    students.put("Ivancho", 2);
    students.put("Petarcho", 5);
    printTable(students);
    System.out.println();

    Map<String, Integer> studentsTree = new TreeMap<>();
    studentsTree.putAll(students);

    printTable(studentsTree);
    System.out.println();

    Map<String, Integer> treeMapStudents = new TreeMap<>(new Comparator<String>() {
      @Override
      public int compare(String key1, String key2) {
        return key2.compareTo(key1);
      }
    });
    treeMapStudents.putAll(studentsTree);
    printTable(treeMapStudents);
    System.out.println();
    System.out.println(treeMapStudents.keySet());

    if (!treeMapStudents.containsKey("Misho") ){
      System.out.println(2);
    } else {
      System.out.println(treeMapStudents.get("Misho"));
    }
  }

  public static void printTable(Map<String, Integer> map) {
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.printf("%8s%3s%4d\n", entry.getKey(), "=", entry.getValue());
    }
  }
}
/*Направете програма Maps. Дефинирайте променлива от тип Map,
 наречена students. Запазете оценките на следните ученици:
Марийка - 6
Иванчо - 2
Петърчо - 5
Направете функция printTable(Map),
където изпозвайте enhanced for цикъл,
 за да отпечатате оценките в табличен вид.

 А как бихте отпечатали таблицата, като сортирате имената по азбучен ред?
Използвайте Comparator.reverseOrder() за да отпечатате таблицата в азбучен ред, но в обратен ред.
Отпечатайте само имената на учениците.
А само оценката на Марийка?
А каква ли оценката на Мишо?
Как ще отпечатаме 2, ако оценката липсва?


  Map<K, V> treeMap = new TreeMap<>(new Comparator<K>() {
            @Override
            public int compare(K a, K b) {
                return b.compareTo(a);
            }
        });
        treeMap.putAll(map);
        return treeMap;
    }*/