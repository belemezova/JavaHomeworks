package Lec_18_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Score {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.printf("Моля въведете брой на играчите: ");
    int numberPlayers = Integer.parseInt(scanner.nextLine());
    double[] playersResults = new double[numberPlayers];
    double sum = 0;
    double stdDev1 = 0;
    for (int i = 0; i < numberPlayers; i++) {
      System.out.printf("Въведете резултат №%d: ", i);
      playersResults[i] = Double.parseDouble(scanner.nextLine());
      sum += playersResults[i];
    }
    Arrays.sort(playersResults);
    double theSlower = playersResults[0];
    double theFastest = playersResults[numberPlayers - 1];
    double average = sum / numberPlayers;
    for (int j = 0; j < numberPlayers; j++) {
      stdDev1 += Math.pow((playersResults[j] - average), 2);
    }
    double stdDev = Math.sqrt(stdDev1 / numberPlayers);
    System.out.println();
    System.out.printf("Min      = %-5.3f%n", theSlower);
    System.out.printf("Max      = %-5.3f%n", theFastest);
    System.out.printf("Average  = %-5.3f%n", average);
    System.out.printf("StdDev   = %-5.3f%n", stdDev);
  }
}



/*Напишете програма, която подканва потребителя да въведе
брой на състезателите и след това да въведе техния резултат в секунди и се записват в масив.

Отпечатва:

Всички резултати
Най-бързия
Най-бавния
Средно аритметично (avg)
Стандартно отклонение (standard deviation). За помощ:
сд1 = сумата от всички ( (елемент - avg) на квадрат)
сд = корен квадратен ( сд1 / броя на елементите)
Изкараният резултат трябва да е подобен на този в даденият пример!


Моля въведете брой на играчите: 4
Min      = 2.340
Max      = 6.000
Average  = 4.320
StdDev   = 1.562
Въведете резултат №0: 2.5
Въведете резултат №1: 6
Въведете резултат №2: 3.75
Въведете резултат №3: 5.50

Въведете резултат №0: 3.25
Въведете резултат №1: 2.34
Въведете резултат №2: 5.69
Въведете резултат №3: 6


Min      = 2.500
Max      = 6.000
Average  = 4.438
StdDev   = 1.396*/