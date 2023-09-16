package interview.basic.lesson_1;

import java.util.Scanner;

public class GreetingByName {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String name=sc.nextLine();
    System.out.println("Hello, "+name+"!");
  }
}
/*Да се напише програма, която чете от конзолата текст
(име на човек) и отпечатва "Hello, <name>!",
където <name> е въведеното име от конзолата.*/