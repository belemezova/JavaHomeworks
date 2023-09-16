package Lecture_Homework;

import java.util.Scanner;

public class NAPMachine {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int countDesk1 = 0;
    int countDesk2 = 0;
    int countDesk3 = 0;
    int message = 0;
    System.out.println("Please enter the number you reached: ");
    int customerNumber = Integer.parseInt(scanner.nextLine());
    for (int i = 1; i <= customerNumber; i++) {
      switch (i % 3) {
        case 1:
          countDesk1 += 1;
          message = 2;
          break;
        case 2:
          countDesk2 += 1;
          message = 3;
          break;
        case 0:
          countDesk3 += 1;
          message = 1;
          break;
      }
    }
    System.out.printf("The client should go to the %d desk!\n", message);
    System.out.printf("There was %d customers at the first desk\n", countDesk1);
    System.out.printf("There was %d customers at the second desk\n", countDesk2);
    System.out.printf("There was %d customers at the third desk\n", countDesk3);
  }
}

