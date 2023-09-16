package Lec_17_Knowedge;

import java.util.Scanner;

public class SumotMult {

  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int numberX=Integer.parseInt(scanner.nextLine());
    int numberY=Integer.parseInt(scanner.nextLine());
    int result=0;
    for (int i = 1; i <=numberY ; i++) {
      result+=numberX;
    }
    System.out.println(result);
  }
}
/*Пресметнете х*y като използвате операцията събиране в цикъл, а не умножение.

Потребителят трябва да въведе 2 int числа, а вие да отпечатате резултата от умножението.

Първото въведено число е x, a второто - y.*/