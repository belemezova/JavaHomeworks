package Lecture_Homework;

import java.util.Scanner;

public class PriceDifferences {

  public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);
    System.out.println("Please eneter the old price of a product");
    double oldPrice= scanner.nextDouble();
    System.out.println("Please eneter the new price of a product");
    double newPrice= scanner.nextDouble();
    double difference=((newPrice-oldPrice)/oldPrice)*100;
    if (newPrice > oldPrice) {
      System.out.printf("The price is risen with: %.2f%%", difference);
    } else {
      System.out.printf("The price is reduced with: %.2f%%", difference);
    }

  }

}
