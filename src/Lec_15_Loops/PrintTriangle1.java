package Lec_15_Loops;

import java.util.Scanner;

public class PrintTriangle1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int edge = Integer.parseInt(scanner.nextLine());
    for (int i = 0; i < edge; i++) {
      for (int j = 1; j <= edge-i; j++) {

        System.out.print((j) + " ");
      }
      System.out.println();
    }
  }
    /*Направете програма, която очаква от потребителя да
    въведе размер на триъгълник (0, 30] и го печата на екрана така:

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1*/
}

