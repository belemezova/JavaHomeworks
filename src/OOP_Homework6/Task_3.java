package OOP_Homework6;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Task_3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter elements of set1: ");
    String input1 = scanner.nextLine();
    String[] str1 = input1.replaceAll(" ", "").split(",");
    List<Integer> list1 = new ArrayList<>();

    for (int i = 0; i < str1.length; i++) {
      list1.add(Integer.valueOf(str1[i]));
    }
    int max = Collections.max(list1);

    for (int i = 0; i < list1.size() ; i++) {
      for (int j = i + 1; j < list1.size(); j++) {
        if (list1.get(i) * list1.get(j) <= max) {
          System.out.printf("(" + (Integer)(i+1) + ", " + (Integer)(j+1) + "); ");
        }
      }

    }


  }
}
/*Напишете програма която:

Чете елементите на един списък от конзолата
Извежда в конзолата двойките индекси (i, j)
 на елементите които удовлетворяват следното условие:
  Ai*Aj<=max(Ai, Ai+1, … Aj), i<j
Например ако имаме списък с елементи 1 1 2 4 2 тогава очакваният изход
е (1, 2), (1, 3), (1, 4), (1, 5), (2, 3), (2, 4), (2, 5), (3, 5)*/