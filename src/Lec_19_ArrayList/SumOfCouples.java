package Lec_19_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfCouples {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean stillAdd = true;
    ArrayList<Integer> numbersYouAdd = new ArrayList<>();
    while (stillAdd) {
      int nextNumber = Integer.parseInt(scanner.nextLine());
      numbersYouAdd.add(nextNumber);
      if (nextNumber == 0) {
        stillAdd = false;
        break;
      }
    }
    int sum = Integer.parseInt(scanner.nextLine());
    for (int i=0; i< numbersYouAdd.size(); i++) {
      for (int j=i+1; j< numbersYouAdd.size(); j++) {
        if (numbersYouAdd.get(i) + numbersYouAdd.get(j) == sum) {
          System.out.printf("%d %d%n", numbersYouAdd.get(i), numbersYouAdd.get(j));
        }
      }

    }

  }

}

/*Напишете програма, която изисква от потребителя да въвежда цели числа от конзолата
 и въвеждането продължава, докато въведе 0.
 (Игнорирайте нулата и не я слагайте в масива/списъка)
2 4
5 1

След това потребителят трябва да въведе още едно число sum.

Отпечатайте всички двойки числа от въведените преди това, чиято сума е равна на sum.

Например, ако потребителят въведе числата [2, 3, 4, 5, 1]
и след това въведе сумата 6, тогава трябва да отпечата:

2 + 4 = 6
5 + 1 = 6
*/