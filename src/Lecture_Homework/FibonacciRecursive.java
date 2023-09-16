/*


package Lecture_Homework;

import java.util.Scanner;

public class FibonacciRecursive {
  public static int numberSequence;
  public static long[] memory;

  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    numberSequence=Integer.parseInt(scanner.nextLine());
    //F(n)=F(n-1)+F(n-2);
    memory=new long[numberSequence];



  }
  public static long[] setFibonacciSequence(int numberSequence, int index ){

    if (numberSequence<=1){

     return numberSequence;

    }
    memory[numberSequence, index]=setFibonacciSequence(numberSequence-1)+setFibonacciSequence(numberSequence-2);
  return


  }

  private static void printArr() {

    for (int i = 0; i < numberSequence; i++) {
      System.out.print(setFibonacciSequence(numberSequence));
    }
  }
}


*/
