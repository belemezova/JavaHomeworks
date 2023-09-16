package bg.startit.java.oop.homework1.stack.simpleCalculator;

import java.util.ArrayDeque;
import java.util.Scanner;


public class SimpleCalculator {


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayDeque<Integer> digits = new ArrayDeque<>();
    String[] input = scanner.nextLine().split(" ");
    for (int  firstNumber, secondNumber, i= 0; i < input.length; i++) {

      if (Character.isDigit(input[i].charAt(0))) {
        digits.push(Integer.parseInt(input[i]));
      } else {
        firstNumber=digits.pop();
        secondNumber=Integer.parseInt(input[i+1]);
        switch (input[i].charAt(0)){
          case '+':
          digits.push(firstNumber+secondNumber);
          i++;
            break;
          case '-':
            digits.push(firstNumber-secondNumber);
            i++;
            break;
        }
      }
    }
    System.out.println(digits.peek());
  }
}
/*2.	Simple Calculator
Create a simple calculator that can evaluate simple expressions
that will not hold any operator different from addition and subtraction.
There will not be parentheses or operator precedence.
Solve the problem using a Stack.
Examples
Input	Output
2 + 5 + 10 - 2 - 1	14
2 - 2 + 5	5
Hints
•	Use an ArrayDeque<>.
•	Consider using the add() method.
•	You can either
o	add the elements and then pop them out
o	or push them and reverse the stack
*/