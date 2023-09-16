package OOP_Homework3.iteratorLec_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorListsAndSets {

  public static void main(String[] args) {
    List<String> listNames = new ArrayList<>(Arrays.asList("Ivan", "Petar",
        "Dimitar", "Ivan", "Georgi", "Dimitar"));
    List<String>listBold=List.of("Ivan", "Petar",
        "Dimitar", "Ivan", "Georgi", "Dimitar");
    Iterator<String> iteratorList = listNames.listIterator();

    Set<String> setNames = new HashSet<>();
    setNames.add("Ivan");
    setNames.add("Petar");
    setNames.add("Dimitar");
    setNames.add("Ivan");
    setNames.add("Georgi");
    setNames.add("Dimitar");
    Iterator<String> setIterator = setNames.iterator();

    printForI(listNames, setNames);

    System.out.println();

    printEnhancedFor(listNames, setNames);
    System.out.println();

    System.out.print("Print names on list with iterator: ");
    while (iteratorList.hasNext()) {
      String nameList = iteratorList.next();
      System.out.print(nameList + ", ");
    }
    System.out.println();

    System.out.print("Print names in set with iterator: ");
    while (setIterator.hasNext()) {
      String nameSet = setIterator.next();
      System.out.print(nameSet + ", ");
    }
    System.out.println();

    printUniqueNames(listNames);
    System.out.println();


    printUniqueNamesSorted(listNames);
    System.out.println();


    listNames.remove("Ivan");
    System.out.println(listNames);

    System.out.println();
    removeNames(listNames, "Dimitar");
    System.out.println(listNames);

    System.out.printf("The name \"Dimitar\" is met %d times\n",timesNameIsMet(listBold, "Dimitar") );
    System.out.println("First index of Ivan is: "+listBold.indexOf("Ivan"));
    System.out.println("Last index of Ivan is: "+listBold.lastIndexOf("Ivan"));
    listNames.removeAll(Collections.singleton("Georgi"));
   // listNames.add("Marijka");
    //listBold.set(2, null);

  }

  public static void printForI(List<String> list, Set<String> set) {
    System.out.print("Print names on list: ");
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + ", ");
    }
    System.out.println();
    System.out.println("Print set: " + set.toString());
  }

  public static void printEnhancedFor(List<String> list, Set<String> set) {
    System.out.print("Print names on list again: ");
    for (String name : list) {
      System.out.print(name + ", ");
    }
    System.out.println();
    System.out.println("Print set again: " + set.toString());
  }

  public static void printUniqueNames(List<String> list) {
    List<String> unique = new ArrayList<>();
    unique.add(list.get(0));
    for (int j = 1, i = 1; i < list.size(); i++) {
      if (!unique.contains(list.get(i))) {
        unique.add(list.get(i));
        j++;
      }
    }
    for (String name : unique) {
      System.out.print(name + ", ");
    }
    System.out.println();

  }

  public static void printUniqueNamesSorted(List<String> list) {
    Collections.sort(list);
    System.out.println(list);
  }

  public static void removeNames(List<String> list, String name) {
    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      if (name.equals(iterator.next())) {
        iterator.remove();
      }
    }
  }
  public static int timesNameIsMet(List<String> list, String name) {
    int counter=0;
    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      if (name.equals(iterator.next())) {
      counter++;
      }
    }return counter;
  }



}

/*Създайте програма ListsAndSets, която създава List
 с елементите “Иван”, “Петър”, “Димитър”, “Иван”, “Георги”, “Димитър”.
 Направете и използвайте следните функции за отпечатване на списъка:
printForI - който използва for(;;)
printEnhancedFor - който използва for( : )
printIterator - който използва Iterator

Отпечатайте само уникалните елементи в списъка:
printUniqueNames()
printUniqueNamesSorted() - първо сортира и после принтира уникалните имена.
Използвайте List.remove(Object) да премахнeте “Иван” от списъка. Какво се получи?
Направете функция static void removeNames(List<String> list, String name),
която премахва всички копия на името, използвайки Iterator


Използвайте List.removeAll(Object) да премахнeте “Иван” от списъка.
Използвайте indexOf() и lastIndexOf() да отпечатата позицията на “Иван” в списъка.
Използвайте функция за да намерите колко пъти се среща “Иван” в списъка.
Можете ли да добавите “Марийка” в списъка?
А да вмъкнете null на 2ра позиция?*/