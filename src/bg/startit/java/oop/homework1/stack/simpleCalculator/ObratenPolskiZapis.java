package bg.startit.java.oop.homework1.stack.simpleCalculator;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ObratenPolskiZapis {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayDeque<Integer> expression = new ArrayDeque<>();
    String[] input = scanner.nextLine().split(" ");
    for (int firstNumber, secondNumber, i = 0; i < input.length; i++) {
      if (Character.isDigit(input[i].charAt(0))) {
        expression.push(Integer.parseInt(input[i]));
      } else {
        secondNumber = expression.pop();
        firstNumber = expression.pop();
        switch (input[i].charAt(0)) {
          case '+':
            expression.push(firstNumber + secondNumber);
            break;
          case '-':
            expression.push(firstNumber - secondNumber);
            break;
          case '*':
            expression.push(firstNumber * secondNumber);
            break;
          case '/':
            expression.push(firstNumber / secondNumber);
            break;
        }
      }
    }System.out.println(expression.peek());
  }
}

