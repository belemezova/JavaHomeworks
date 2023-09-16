


package Lecture_Homework;

import java.util.Scanner;

public class HanoiTowers {

  public static String nameDisk(int num) {
    String disk = "";
    switch (num) {
      case 1:
        disk = "\u001B[94m #####################";
        break;
      case 2:
        disk = "\u001B[95m   #################";
        break;
      case 3:
        disk = "\u001B[96m     #############";
        break;
      case 4:
        disk = "\u001B[92m       #########";
        break;
      case 5:
        disk = "\u001B[93m         #####";
        break;
      default:
        disk = "           |            ";
    }
    return disk;
  }


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.printf("\n\t\t\t\t\t\u001B[96m%S", "Welcome to TOWERS OF HANOI!");
    System.out.println();
    System.out.printf("\n\t\t\t\u001B[39;49m%s\n", "How to play");
    System.out.printf(
        "\n\t*There is tree towers -A, B, C, and only one disk can be moved at a time\n\t*No larger disk can appears on a smaller disk.\n"
            + "\t*Only one top most disk can be moved from one tower and it can appear only at the top most position of another tower.\n"
            + "\t*You are to transfer all disk to the right hand tower - C- in the fewest possible.\n"
            + "\t*You can choose between tree levels of difficulty\n");
    System.out.println("\nPlease choose a level (number between 1 and 3): ");
    int level = Integer.parseInt(scanner.nextLine());
    int disks = level + 2;
    int[][] matrixRings = new int[disks][3];
    for (int i = 0; i < disks; i++) {
      for (int j = 0; j < 3; j++) {
        matrixRings[i][0] = 1;
        if (j != 0) {
          matrixRings[i][j] = 0;
        }

      }
    }
    //print matrix

  }


  public static String[][] printMatrix(int[][] matrix, int disks) {
    String[][] toDraw = new String[disks][];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 1; j <= matrix[i].length; j++) {
        if (matrix[i][j] == 0) {
          toDraw[i][j] = nameDisk(0);
        }
        toDraw[i][j] = nameDisk(matrix[i][j] - i);

      }
    }

    return toDraw;
  }

  public static String namedTower(int column) {
    String nameT = "";
    switch (column) {
      case 1:
        nameT = "A";
        break;
      case 2:
        nameT = "B";
        break;
      case 3:
        nameT = "C";
        break;
    }
    return nameT;
  }


}




/*"%s\u001B[92m"*/

