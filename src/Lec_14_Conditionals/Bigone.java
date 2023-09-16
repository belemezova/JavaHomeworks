package Lec_14_Conditionals;

import java.util.Scanner;

public class Bigone {

  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    double firstNumber= Double.parseDouble(scanner.nextLine());
    double secondNumber= Double.parseDouble(scanner.nextLine());

    System.out.println(Math.max(firstNumber,secondNumber));
    /*Напишете програма, която прочита 2 числа със запетая от конзолата и печата кое е по-голямото.

Отпечатаният резултат трябва да съдържа само числото без никакви допълнителни пояснения.

Например: “резултатът е 10” e невалидно.

10
45.43

rezultat 45.43*/
  }
}
