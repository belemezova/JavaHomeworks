package OOP_Homework6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Set_2b {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the numbers for firs set, separated by comma: ");
    String input1 = scanner.nextLine();
    String[] str1 = input1.replaceAll(" ", "").split(",");
    Set<Integer> set1 = new HashSet<>();
    for (int i = 0; i < str1.length; i++) {
      set1.add(Integer.valueOf(str1[i]));
    }
    System.out.println();

    System.out.println("Please enter the numbers for second list, separated by comma: ");
    String input2 = scanner.nextLine();
    String[] str2 = input2.replaceAll(" ", "").split(",");
    Set<Integer> set2 = new HashSet<>();
    for (int i = 0; i < str2.length; i++) {
      set2.add(Integer.valueOf(str2[i]));
    }
    System.out.println();

    Set<Integer> unionSet = new HashSet<>(set1);
    unionSet.addAll(set2);
    System.out.println("Union is: " + unionSet);
    System.out.println();

    Set<Integer> intersection_Set = new HashSet<>(set1);
    intersection_Set.retainAll(set2);
    System.out.println("Interesection is: " + intersection_Set);
    System.out.println();
  }
}
/*Напишете програма която:
1, 5, 7, 9, 19, 37, 75, 149, 299
3, 7, 11, 19, 25, 31, 69, 149, 287
Чете два Set-a от конзолата
Извежда в конзолата тяхното обединение и сечение.*/