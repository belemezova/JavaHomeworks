package JustToMakeTests;

import java.util.Scanner;

public class NewMethods {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Please enter two numbers: ");
  }

  public static double max(double firstNumber, double secondNumber) {
 return (firstNumber>=secondNumber)?firstNumber:secondNumber;

  }
}
