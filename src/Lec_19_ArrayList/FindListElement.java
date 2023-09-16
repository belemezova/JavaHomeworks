package Lec_19_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindListElement {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> myList=new ArrayList<>(Arrays.asList(1, 4, 6, 2, 10, 5));
    int usersNumber=Integer.parseInt(scanner.nextLine());
    System.out.println(myList.indexOf(usersNumber));

  }
}
/*Направете променлива, която е списък от цели числа.
Инициализирайте списъка със следните елементи: 1, 4, 6, 2, 10, 5.

Напишете програма, която очаква потребителя да въведе число
и след това намира на кой индекс се намира това число в даденият масив.

Ако числото не е в списъка, нека програмата отпечата -1.

Вижте метода ArrayList.indexOf()

Помните ли задачата FindElementIndex ? Сравнете леснотата на работа с масиви спрямо списъци.*/