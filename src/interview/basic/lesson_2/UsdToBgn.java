package interview.basic.lesson_2;

import java.util.Scanner;

public class UsdToBgn {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double usd= Double.parseDouble(sc.nextLine());
    double rate=1.79549;
    double bgn= usd*rate;
    System.out.println(bgn);

  }
}
/*Напишете програма за конвертиране на щатски долари (USD) в български лева (BGN).
 Използвайте фиксиран курс между долар и лев: 1 USD = 1.79549 BGN.*/