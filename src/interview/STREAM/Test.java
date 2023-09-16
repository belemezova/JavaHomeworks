package interview.STREAM;

import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("Please enter the word: ");
      String input = scanner.nextLine();
      boolean check = true;
      int k = 0;
      for (int i = input.length() - 1; i >= input.length() / 2; i--) {
        if (input.charAt(i) != input.charAt(k)) {
          check = false;
          break;
        }
        k += 1;
      }

      if (check) {
        System.out.println("This is palindrome");
      } else {
        System.out.println("This is not a palindrome word");
      }
      if (input.equals("Stop")) {
        break;
      }
    }
  }

}
