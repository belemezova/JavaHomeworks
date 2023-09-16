package interview.basic.lesson_while;

import java.util.Scanner;

public class OldBook {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String bookAniLooksFor = sc.nextLine();
    int count=0;
    String bookAniFound = sc.nextLine();
    boolean thisIsTheBook = false;
    while (!thisIsTheBook) {
      if ("No More Books".equals(bookAniFound)) {
        System.out.println("The book you search is not here!");
        System.out.println("You checked "+count+" books.");
        break;
      }
      if (bookAniLooksFor.equals(bookAniFound)) {
        System.out.println("You checked "+count+" books and found it.");
        thisIsTheBook = true;
      }
      count+=1;
      bookAniFound = sc.nextLine();
    }
   }
}
