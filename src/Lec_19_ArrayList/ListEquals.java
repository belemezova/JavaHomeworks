package Lec_19_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ListEquals {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> myNumbers = new ArrayList<>(Arrays.asList(1, 10, 15));
    ArrayList<Integer> yourNumbers = new ArrayList<>();
    for (int i = 0; i < myNumbers.size(); i++) {
      yourNumbers.add(i, Integer.parseInt(scanner.nextLine()));
    }
    Collections.sort(yourNumbers);
    if (myNumbers.equals(yourNumbers)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }
}

/*Създайте списък от цели числа със следните елементи: { 1, 10, 15 }

Напишете програма, която очаква потребителя да въведе 3 числа, които съхранявате в друг списък.

Сверете дали елементите на въведения списък са същите като в първия и ако са,
отпечатайте “true”, в противен случай - “false”.*/