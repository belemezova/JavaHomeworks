package JustToMakeTests;

import java.util.Random;

public class GeneratedPrimenumbers {

  public static void main(String[] args) {

    Random generator = new Random();
    int counter = 0;
    int randomNumber = generator.nextInt(2000000000);
    while (counter <= 10) {

      boolean isPrime = true;
      for (int i = 2; i <= Math.sqrt(randomNumber); i++) {
        if (randomNumber % i == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        System.out.println(randomNumber);
        counter += 1;
      }
      randomNumber = generator.nextInt(2000000000);
    }
    /*2. Изведете 10 случайно генерирани числа, които са прости.*/

  }
}

