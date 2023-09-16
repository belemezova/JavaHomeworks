package Lec_17_Knowedge;

import java.util.Scanner;

public class ToBinary {

  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int numToBinary=Integer.parseInt(scanner.nextLine());
    if (numToBinary<0){return;}
    String convertedNumber="";
    while(numToBinary>0){

      convertedNumber+=numToBinary%2;
      numToBinary=numToBinary/2;

    }
    System.out.println(convertedNumber);
  }
}
/*Нека потребителят въведе цяло положително число.

Тогава, използвайки цикъл, преобразувайте числото
в двоичен вид и го разпечатайте на екрана, започвайки отзад напред.

Например: числото 10 в двоичен вид е 1010. Вие обаче трябва да отпечатате 0101.*/