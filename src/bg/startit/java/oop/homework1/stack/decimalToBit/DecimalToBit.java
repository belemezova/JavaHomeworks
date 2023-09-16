package bg.startit.java.oop.homework1.stack.decimalToBit;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBit {

  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    ArrayDeque<Integer> bits= new ArrayDeque<>();
    int number=Integer.parseInt(scanner.nextLine());
    if (number==0){
      System.out.println(0);
    }
    while(number>0){
      int leftover=number%2;
      bits.push(leftover);
      number=number/2;
    }
    int size= bits.size();
    for (int i = 0; i < size; i++) {

      System.out.print(bits.pop());
    }
    /*while(!bits.isEmpty()){
      System.out.print(bits.pop());
    }*/

  }
}
