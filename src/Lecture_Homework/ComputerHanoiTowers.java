package Lecture_Homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class ComputerHanoiTowers {

  public static void main(String[] args) throws InterruptedException {
    Scanner scanner = new Scanner(System.in);
    int numberOfDisks = Integer.parseInt(scanner.nextLine());

    int move = 0b1;
    int turnNumber = 0b1;
    int currentRod;

    int currentDisk = 1;

    for (int i = 0; i < numberOfDisks; i++) {
      turnNumber += (1 << i);
    }

    int[] gameMatrix = new int[numberOfDisks + 1];
    for (int i = 0; i <= numberOfDisks; i++) {
      if (i == 0) {
        gameMatrix[0] = 0;
      } else {
        gameMatrix[i] = 1;
      }

    }

    for (int i = 1; i <= numberOfDisks; i++) {
      addDiskPassition(gameMatrix, i, 1);
    }

    currentRod = gameMatrix[1];

    // 5 disks=  2*15+1 =31 moves;
    while (move != turnNumber) {
      currentDisk = returningNumberOfDisk(move);
      currentRod = gameMatrix[currentDisk];
      boolean currentBool = checkDecreasingOfRods(currentDisk, numberOfDisks);
      int possition = rollingRodPossitin(currentDisk, currentBool, currentRod);
    System.out.printf("Move disk %d to the rod %d\n", returningNumberOfDisk(move), possition);
      printTowers(setMatrix(gameMatrix, numberOfDisks));
      addDiskPassition(gameMatrix, currentDisk, possition);
      move++;
    }

    printTowers(setMatrix(gameMatrix, numberOfDisks));

  }

  public static int returningNumberOfDisk(int move) {
    int disk = 1;

    String moveLast = Integer.toBinaryString(move);
    String movePrev = Integer.toBinaryString(move - 1);
    if (moveLast.length() > movePrev.length()) {
      disk = moveLast.length();
    } else {
      for (int i = moveLast.length() - 1, j = 1; i > 0; i--) {
        if (moveLast.charAt(i) != movePrev.charAt(i) && moveLast.charAt(i) == '1') {
          disk = j;
        }
        j++;
      }
    }
    return disk;
  }

  public static boolean checkDecreasingOfRods(int diskNumber, int numberOfDisks) {
    boolean decrease = true;
    if ((diskNumber % 2 == 0 && numberOfDisks % 2 == 1) || (diskNumber % 2 == 1
        && numberOfDisks % 2 == 0)) {
      decrease = false;
    }
    return decrease;
  }

  public static int rollingRodPossitin(int currentDisk, boolean decrease, int currentRod) {
    int to;
    if (decrease == true) {
      to = currentRod;
      for (int i = currentRod; to >= 1; i--) {
        if (to == 1) {
          to = 3;
          break;
        } else {
          to = to - 1;
          break;
        }
      }
    } else {
      to = currentRod;
      for (int i = currentRod; to <= 3; i++) {
        if (to == 3) {
          to = 1;
          break;
        } else {
          to = to + 1;
          break;
        }
      }
    }
    return to;
  }

  public static int[] addDiskPassition(int[] gameMatrix, int disk, int possition) {

    switch (disk) {
      case 1:
        gameMatrix[disk] = possition;
        break;
      case 2:
        gameMatrix[disk] = possition;
        break;
      case 3:
        gameMatrix[disk] = possition;
        break;
      case 4:
        gameMatrix[disk] = possition;
        break;
      case 5:
        gameMatrix[disk] = possition;
        break;
      default:
        break;
    }

    return gameMatrix;
  }

  public static String[][] setMatrix(int[] gameMatrix, int numberOfDisks) {
    String[] symbols = {"", "\u001B[93m      #        ", "\u001B[92m     ###       ",
        "\u001B[96m    #####      ",
        "\u001B[95m   #######     ",
        "\u001B[94m  #########    ", "\u001B[94m      |       "};
    String[][] tower = new String[numberOfDisks][3];

    for (int i = 0; i < tower.length; i++) {
      for (int j = 0; j < tower[i].length; j++) {
        tower[i][j] = "\u001B[94m      |        ";
      }
    }
    for (int i = 0; i < gameMatrix.length - 1; i++) {
      tower[i][gameMatrix[i + 1] - 1] = symbols[i + 1];
    }
    return tower;
  }

  public static void printTowers(String[][] tower) throws InterruptedException {
   for (String[] row : tower) {
      for (String element : row) {
        System.out.print(element);
      }
      System.out.println();
    }
    System.out.println("\u001B[93m****************************************");
    TimeUnit.SECONDS.sleep(1);
  }

}


/*
 for (int i = 0; i < numberOfDisks; i++) {
      for (int j = 0; j < 3; j++) {
        if (j == 0) {
          gameMatrix[i][j] = 1 << i;
        } else {
          gameMatrix[i][j] = 0b0;
        }

      }
    }*/

     /* TimeUnit.SECONDS.sleep(7);   */

