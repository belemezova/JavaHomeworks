package Lec_17_Knowedge;

import java.util.Scanner;

public class MultNotPow {

  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int numberX=Integer.parseInt(scanner.nextLine());
    int numberY=Integer.parseInt(scanner.nextLine());
    int result=1;
    for (int i = 1; i <=numberY ; i++) {
      result*=numberX;
    }
    System.out.println(result);
  }
}
/*Сметнете x^y , като използвате умножение в цикъл, вместо съответната операция от Math класа.

Потребителят трябва да въведе 2 int числа, а вие да отпечатате резултата от повдигането на степен.

Първото въведено число е x, a второто - y.*/