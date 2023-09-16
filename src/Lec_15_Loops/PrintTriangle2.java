package Lec_15_Loops;

import java.util.Scanner;

public class PrintTriangle2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int edge = Integer.parseInt(scanner.nextLine());
    for (int i = 1; i <= edge; i++) {
      for (int j = 1; j <= i - 1; j++) {
        System.out.print("  ");
      }
      for (int m = i; m <= edge; m++) {
        System.out.print("# ");
      }
      System.out.println();
    }
  }
}
/*Направете програма, която очаква от потребителя да
въведе размер на триъгълник (0, 30] и го печата на екрана така:

# # # # # #
  # # # # #
    # # # #
      # # #
        # #
          #*/