package OOP_Homework1.prime;

public class PrimeChecker {

  public boolean checkPrime(int number) {
    if (number < 2) {
      return false;
    } else {
      for (int i = 2; i < Math.sqrt(number); i++) {
        if (number % i == 0) {
          return false;
        }
      }return  true;
    }
  }
}


/*Напишете клас PrimeChecker който има метод checkPrime.
*/