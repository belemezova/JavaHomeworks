package Lec_17_Knowedge;

import java.util.Scanner;

public class PrimeNum {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberX = Integer.parseInt(scanner.nextLine());
    boolean isTrue = true;
    if (numberX < 2) {
      isTrue = false;
    } else {
      for (int i = 2; i < Math.sqrt(numberX); i++) {
        if (numberX % i == 0) {
          isTrue = false;
          break;
        }
      }
      System.out.println(isTrue);
    }
  }
}
/*Направете програма, която очаква от потребителя да въведе число.
След това проверява дали числото е просто и отпечатва true, ако е, false, ако не е.

Простото число може да се дели само на 1 и на себе си. Ако се дели на което и да е друго цяло число, тогава не е просто.

Подсказка: ако имате числото 77, тогава то определено няма как да се дели на числото 38 (= 77 / 2) или по-голямо.*/