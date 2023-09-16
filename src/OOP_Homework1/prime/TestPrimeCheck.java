package OOP_Homework1.prime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestPrimeCheck {

  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter how many numbers to check: ");
    int N= Integer.parseInt(scanner.nextLine());
    List<Integer> primeNumbers=new ArrayList<>();
    for (int i = 0; i < N; i++) {
      System.out.print("Enter number "+(i+1)+":");
      int number=Integer.parseInt(scanner.nextLine());
      PrimeChecker check=new PrimeChecker();
      if (check.checkPrime(number)==true){
        primeNumbers.add(number);
      }
    }
    System.out.print("Prime numbers are: ");
    System.out.println(primeNumbers.toString().replace("[","").replace("]",""));
  }
}
/*Напишете програма която чете от входа N nа брой числа и извежда в конзолата само простите.
(N може да бъде първото въведено число)
Примерен вход: 3 (N) 5 (number 1) 6 (number 2) 7 (number 3)
Примерен изход: 5, 7*/