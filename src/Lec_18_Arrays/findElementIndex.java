package Lec_18_Arrays;

import java.util.Scanner;

public class findElementIndex {

  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    //double userNumber=Double.parseDouble(scanner.nextLine());
    int userNumber=Integer.parseInt(scanner.nextLine());
    int[] myArray = {1,4,6,2,10,5};
    for (int i = 0; i < myArray.length; i++) {
      if (myArray[i]==userNumber){
        System.out.println(i);
        return;
      }
    }
    System.out.println(-1);
  }
}
/*Нека имаме следният масив:

int[] myArray = { 1, 4, 6, 2, 10, 5 };
Напишете програма, която очаква потребителят
 да въведе число и след това намира на кой индекс
  се намира това число в дадения масив.

Ако числото не е в масива, нека програмата отпечата -1.*/