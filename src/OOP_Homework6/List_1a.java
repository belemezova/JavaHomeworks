package OOP_Homework6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class List_1a {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of elements in a list ");
    int numbers = Integer.parseInt(scanner.nextLine());
    List<Integer> sequence1 = new ArrayList<>();
    for (int i = 0; i < numbers; i++) {
      System.out.println("Please enter the number in a list:");
      sequence1.add(scanner.nextInt());
    }

    System.out.println("List length is: " + sequence1.size());
    Iterator<Integer> iterator1 = sequence1.iterator();
    System.out.println("The elements of a list are: ");
    while (iterator1.hasNext()) {
      System.out.print(iterator1.next() + ", ");
    }
    System.out.println();
    System.out.println("List: " + sequence1.toString());
    sequence1.sort(null);
    System.out.println(sequence1.toString());
    sequence1.sort(Collections.reverseOrder());

    System.out.println();

    System.out.println("Please enter the list of double numbers separated by comma:");
    String input = scanner.nextLine();
    String[] list = input.split(", ");
    List<Integer> sequence2 = new ArrayList<>();
    for (int i = 0; i < list.length; i++) {
      sequence2.add(Integer.valueOf(list[i]));
    }

    System.out.println("List length is: " + sequence2.size());
    System.out.println("List: " + sequence2.toString());

    for (int i = 0; i < sequence1.size(); i++) {
      for (int j = 0; j < sequence2.size(); j++) {

        String sign = "";
        if (sequence1.get(i) > sequence2.get(j)) {
          sign="larger";
        }else if(sequence1.get(i)<sequence2.get(j)){
          sign="smaller";
        }else {
          sign="equals";
        }
        System.out.printf("Елемент %d от списък 1 е %s от елемент %d от списък 2.\n", i, sign, j);
      }

    }


  }

}
/*Напишете пограма която:

Чете от конзолата числа които са елементи на List
Извежда следната информация за списъка: дължина, всички елементи
Сортира списъка и извежда резултата
Обръща елементите на списъка (1 2 3 -> 3 2 1)
Чете елементите на втори списък.
Сравнява двата списъка елемент по елемент и
на всяка итерация извежда следното съобщение
 “Елемент N от списък 1 е по-малък/по-голям от елемент X от списък 2.”*/