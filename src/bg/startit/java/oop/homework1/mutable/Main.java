package bg.startit.java.oop.homework1.mutable;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    String[] extra1=new String[5];
    String[] extra2=new String[5];

      System.out.print("Please enter at least two premiums separated by comma: ");
     extra1 = scanner.nextLine().split(", ");

      System.out.print("Please enter all premiums separated by comma. If there is no extra, just press enter: ");

      extra2=scanner.nextLine().replaceAll("\n", "").split(", ");
    System.out.println(Arrays.toString(extra1));
    System.out.println(Arrays.toString(extra2));
    }
  }

