package interview.basic.lesson_1;

import java.util.Scanner;

public class RectangleArea {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=Integer.parseInt(sc.nextLine());
    int b=Integer.parseInt(sc.nextLine());
    int area=a*b;
    System.out.println(area);
  }
}
/*Да се напише конзолна програма, която въвежда две цели числа
 (страните на правоъгълника a и b)
 и пресмята лицето на правоъгълник с тези страни.*/