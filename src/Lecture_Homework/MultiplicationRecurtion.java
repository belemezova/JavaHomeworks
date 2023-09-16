package Lecture_Homework;

import java.util.Scanner;

public class MultiplicationRecurtion {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter the first number:");
    int number1 = Integer.parseInt(scanner.nextLine());
    System.out.print("Please enter the second number:");
    int number2 = Integer.parseInt(scanner.nextLine());
    int result = multiplyRecursivly(number1, number2);
    System.out.println(result);
  }

  ///M(n*m)=m(times)(n+n+n+n..);
  public static int multiplyRecursivly(int num1, int num2) {
    if (num2 == 0) {
      return 0;
    }
    return num1 + multiplyRecursivly(num1, num2 - 1);
  }
}
