package interview.basic.lesson_2;

import java.util.Scanner;

public class DepositCalculator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double sum=Double.parseDouble(sc.nextLine());
    int months=Integer.parseInt(sc.nextLine());
    double interest=Double.parseDouble(sc.nextLine());
    interest/=100;
    double fineSum=sum+months*((sum*interest)/12);
    System.out.printf("%.2f", fineSum);

  }

}
/*Напишете програма, която изчислява каква
сума ще получите в края на депозитния период при определен лихвен процент.
Използвайте следната формула:
сума = депозирана сума  + срок на депозита *
((депозирана сума * годишен лихвен процент ) / 12)
Вход
От конзолата се четат 3 реда:
1.	Депозирана сума – реално число в интервала [100.00 … 10000.00]
2.	Срок на депозита (в месеци) – цяло число в интервала [1…12]
3.	Годишен лихвен процент – реално число в интервала [0.00 …100.00]
Изход
Да се отпечата на конзолата сумата в края на срока.
*/