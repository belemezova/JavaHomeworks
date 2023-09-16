package Lec_21_Methods;

import java.util.Scanner;

public class NumberOfDigits {
  public static int calculateNumberOfDigits(int num){
    int counter=0;
    String numberToString=""+num;
    numberToString.trim();
    counter=numberToString.length();
    return counter;
  }

  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int userNumber=Integer.parseInt(scanner.nextLine());
    System.out.println(calculateNumberOfDigits(userNumber));

  }
}
/*Направете метод, който отпечатва броя на цифри в дадено число.

Направете програма, която очаква от потребителя да въведе цяло число
 и след това извиква горният метод, за да отпечата броят на цифрите във веведеното число.*/