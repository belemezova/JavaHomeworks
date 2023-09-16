package OOP_Homework6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayDeque;

public class Set_1b {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter elements of set1: ");
    String input1 = scanner.nextLine();
    String[] str1 = input1.replaceAll(" ", "").split(",");
    Set<Integer> set1 = new HashSet<>();

    for (int i = 0; i < str1.length; i++) {
      set1.add(Integer.valueOf(str1[i]));
    }
    System.out.println("Set length is: " + set1.size());
    System.out.println("Set1:" + set1.toString());
    Set<Integer> sortedSet = new TreeSet<>(set1);
    System.out.println("Set1 sorted: " + sortedSet.toString());
    System.out.println();

    System.out.println("Enter an element to be added to the set: ");
    Integer nextElement = Integer.parseInt(scanner.nextLine());
    if (set1.add(nextElement) == false) {
      System.out.println("The element already exist and it can not be inserted again");
    } else {
      set1.add(nextElement);
    }
    Set<Integer> reversedSet = new TreeSet<>(set1);
    ArrayDeque<Integer> reversStack = new ArrayDeque<>(reversedSet.size());
    reversStack.addAll(reversedSet);
    for (Integer elem : reversStack) {
      reversedSet.add(elem);
    }
    System.out.println("Set1 in reversed order: " + reversedSet.toString());
    System.out.println();

    String input2 = scanner.nextLine();
    String[] str2 = input2.replaceAll(" ", "").split(",");
    Set<Integer> set2 = new HashSet<>();

    for (int i = 0; i < str2.length; i++) {
      set2.add(Integer.valueOf(str2[i]));
    }
    int i = 0;
    int j = 0;
    for (Integer int1 : set1) {
      for (Integer int2 : set2) {
        String sign = "";
        if (int1 > int2) {
          sign = "larger";
        } else if (int1 < int2) {
          sign = "smaller";
        } else {
          sign = "equals";
        }
        System.out.printf("Element %d от списък 1 е %s от елемент %d от списък 2.\n", i, sign, j);
        j++;
      }
      i++;
    }


  }

}
/*Напишете пограма която:
1, 19, 37, 75, 149, 299, 1, 5, 7, 9, 19, 37, 75, 149, 299
Чете от конзолата числа които са елементи на Set
Извежда следната информация за Set-a: дължина, всички елементи несортирани, всички елементи сортирани
Чете друго число от конзолата и го добавя към Set-a.
Ако в Set-a има такова число вече
(ползвайте факта, че методът за добавяне на елемент към Set-a връща false
ако елементът не може да бъде добавен.)
извежда съобщение “Такъв запис вече съществуваи не може да бъде добавен повторно.”
Повторете стъпките 4, 5, 6 от задача 1.

Обръща елементите на списъка (1 2 3 -> 3 2 1)
Чете елементите на втори списък.
Сравнява двата списъка елемент по елемент и
на всяка итерация извежда следното съобщение
“Елемент N от списък 1 е по-малък/по-голям от елемент X от списък 2.”*/