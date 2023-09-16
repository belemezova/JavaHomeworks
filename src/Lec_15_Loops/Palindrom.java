package Lec_15_Loops;

import java.util.Scanner;

public class Palindrom {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String word = scanner.nextLine().toLowerCase();
    boolean isPalindrom = true;
    for (int i = 0; i < word.length() / 2; i++) {
      int a = word.length() - 1 - i;
      if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
        isPalindrom = false;
        break;
      }
    }
    System.out.println(isPalindrom);

  }
}

 /*Направете програма, която прочита дума от конзолата и проверява дали е палиндром.

Игнорирайте малки-големи букви.

Ако думата е палиндром, да отпечата true, в противен случай false.

Палиндром е дума, която се чете еднакво отпред и отзад. Например следните думи са палиндроми: mom, radar, nikokin

Тази задача е една от най-често срещаните при технически интервюта.*/