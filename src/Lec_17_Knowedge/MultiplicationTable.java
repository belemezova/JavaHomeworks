package Lec_17_Knowedge;

import java.util.Scanner;

public class MultiplicationTable {

  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int number=Integer.parseInt(scanner.nextLine());
    for (int i = 1; i <=10; i++) {
      System.out.printf("%d * %d = %d%n", number, i,i*number);
    }
  }

}
/*Вашата програма очаква от потребителя да въведе число.
 След това отпечатва таблица за умножението на това число със всички числа от 1 до 10.

Изхода на екрана трябва да е подобен на този даден в примера.*/