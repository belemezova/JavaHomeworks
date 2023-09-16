package Lec_15_Loops;

import java.util.Scanner;

public class SumOfPositives {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Въведете положително число: ");
    double firstNumber = Double.parseDouble(scanner.nextLine());
    System.out.print("Въведете положително число: ");
    double nextNumber = Double.parseDouble(scanner.nextLine());
    double sum = firstNumber;
    double max = firstNumber;
    double min = firstNumber;
    while (nextNumber > 0) {
      sum = sum + nextNumber;
      max = Math.max(nextNumber, max);
      min = Math.min(nextNumber, min);
      firstNumber = nextNumber;
      System.out.print("Въведете положително число: ");
      nextNumber = Double.parseDouble(scanner.nextLine());
    }
    System.out.printf("%.2f%n", sum);
    System.out.println(max);
    System.out.println(min);
  }
}
/*Напишете програма, която събира въведените от потребителя числа, докато въведе 0 или отрицателно число.

Нека всеки път преди потребителяt въведе число, да се отпечатва подканващ стринг
"Въведете положително число: ". Потребителят трябва да може да въведе числото на същият ред, а не на следващ.

Отпечатайте :

Сумата с точност до вторият знак след десетичната запетая.
Кое е най-голямото въведено число
Кое е най-малкото въведено число
Помислете кой цикъл е най-добре да използвате? while, do-while или for?

Въведете положително число: 10
Въведете положително число: 4.5424
Въведете положително число: -1

14.54
10.0
4.5424*/