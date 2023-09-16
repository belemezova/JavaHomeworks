package bg.startit.java.oop.homework1.stack.browserHistory;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class BrowserHistory {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayDeque<String> history = new ArrayDeque<>();
    String input = scanner.nextLine();
    String current = "";
    boolean error = false;

    while (!input.equals("Home")) {

      if (!input.equals("back")) {
        if (!current.equals("")) {
          history.push(current);
        }
        current = input;

      } else if (input.equals("back")) {
        if (history.isEmpty()) {
          System.out.println("no previous URLs");
          input = scanner.nextLine();
          continue;
        } else {
          current = history.pop();
        }
      }

      System.out.println(current);

      input = scanner.nextLine();
    }
  }
}
/*Write a program, which takes 2 types of browser instructions:
•	Normal navigation: a URL is set, given by a string;
•	The string "back" sets the current URL to the last set URL
After each instruction, the program should print the current URL.
If the back instruction can’t be executed, print
"no previous URLs". The input ends with the "Home" command and
 then simply you have to stop the program.


•	Use ArrayDeque<>.
•	Use String to keep the current page.
•	Use push(), when moving to the next page.
•	Use pop(), when going back.

https//softuni.bg/
back
https//softuni.bg/trainings/courses
back
https//softuni.bg/trainings/2056
back
https//softuni.bg/trainings/live
https//softuni.bg/trainings/live/details
Home


output
	https//softuni.bg/
no previous URLs
https//softuni.bg/trainings/courses
https//softuni.bg/
https//softuni.bg/trainings/2056
https//softuni.bg/
https//softuni.bg/trainings/live
https//softuni.bg/trainings/live/details

*/