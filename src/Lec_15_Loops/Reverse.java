package Lec_15_Loops;

import java.util.Scanner;

public class Reverse {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String edge = scanner.nextLine();
    int num = Math.abs(Integer.parseInt(edge));
    for (int i = 0; i < edge.length() ; i++) {

      System.out.print(num % 10);
      num = num/10;
    }
  }
}
/*Направете програма, която печата цифрите на въведено от конзолата цяло число в обратен ред.

Ако числото е отрицателно - просто игнорирайте знака.

Подсказка: Нека имаме числото 456.

Ако вземем остатъка от делене на числото 456 на 10, ще получим 6
Ако вземем остатъка от делене на числото 45 на 10, ще получим 5
Ако вземем остатъка от делене на числото 4 на 10, ще получим 4
Ако отпечатваме с print, вместо print всяка цифра, която отпечатваме, ще е на същият ред.*/