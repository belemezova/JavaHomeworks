package OOP_Homework6;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class List_2a {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    System.out.println("Please enter the numbers for first list, separated by comma: ");
    String input1 = scanner.nextLine();
    String[] str1 = input1.replaceAll(" ", "").split(",");
    for (int i = 0; i < str1.length; i++) {
      list1.add(Integer.valueOf(str1[i]));
    }
    System.out.println("First list:" + list1.toString());
    System.out.println();

    System.out.println("Please enter the numbers for second list, separated by comma: ");
    String input2 = scanner.nextLine();
    String[] str2 = input2.replaceAll(" ", "").split(",");
    for (int i = 0; i < str2.length; i++) {
      list2.add(Integer.valueOf(str2[i]));
    }
    System.out.println("Second list:" + list2.toString());
    System.out.println();



   System.out.println("Variant with Sets: ");
    Set<Integer> set1 = new HashSet<>(list1);
    Set<Integer> set2 = new HashSet<>(list2);

    Set<Integer> unionSet = new HashSet<>(set1);
    unionSet.addAll(set2);
    System.out.println("Union is: " + unionSet);
    System.out.println();

    Set<Integer> intersection_Set = new HashSet<>(set1);
    intersection_Set.retainAll(set2);
    System.out.println("Interesection is: " + intersection_Set);
    System.out.println();


    System.out.println("Variant 1: ");
    List<Integer>union1 =new ArrayList<>(list1);
    List<Integer> intersection_List1= new ArrayList<>(list1);
    intersection_List1.retainAll(list2);
    System.out.println("Interesection is: " + intersection_List1);
    union1.removeAll(intersection_List1);
    union1.addAll(list2);
    System.out.println("Union is: " +union1);


    System.out.println("Variant 2: ");

    List<Integer> unique = new ArrayList<>(list1);
    unique.addAll(list2);
    System.out.println(   "Unique is: " + new HashSet<>(unique));
    System.out.println();


    List<Integer> intersection_List = new ArrayList<>(list1);
    intersection_List.retainAll(list2);
    System.out.println("Interesection is: " + intersection_List);
  }
}
/*Напишете програма която:
1, 5, 7, 9, 19, 37, 75, 149, 299
3, 7, 11, 19, 25, 31, 69, 149, 287
Чете два списъка от конзолата
Извежда в конзолата тяхното обидинение и сечение.
Ползвайте ArrayList или LinkedList.*/