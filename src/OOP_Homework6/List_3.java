package OOP_Homework6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class List_3 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    List<Double> firstList = new ArrayList<>();
    List<Double> secondList = new LinkedList<>();

    System.out.println("Please enter the numbers for first list, separated by comma: ");
    String input1 = scanner.nextLine();
    String[] list1 = input1.replaceAll(" ", "").split(",");
    for (int i = 0; i < list1.length; i++) {
      firstList.add(Double.valueOf(list1[i]));
    }
    System.out.println("First list:" + firstList.toString());
    System.out.println();

    System.out.println("Please enter the numbers for second list, separated by comma: ");
    String input2 = scanner.nextLine();
    String[] list2 = input2.replaceAll(" ", "").split(",");
    for (int i = 0; i < list2.length; i++) {
      secondList.add(Double.valueOf(list2[i]));
    }
    System.out.println("Second list:" + secondList.toString());
    System.out.println();

    Set<Double> sumSet = new HashSet<>();
    sumSet.addAll(firstList);
    sumSet.addAll(secondList);
    System.out.println("List sum set:" + sumSet.toString());
    System.out.println();



  }


}
/*Напишете програма която:

Чете два списъка от конзолата
Сортира ги
Обединява ги в един нов трети списък.
Трие дублицираните елементи
(за да се премахнат дублицираните елементи
 може елементите от списъка да се добавят в един Set)*/