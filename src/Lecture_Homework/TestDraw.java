package Lecture_Homework;

import static java.util.Arrays.*;

import java.util.Arrays;

public class TestDraw {

  public static void main(String[] args) {
    int[] arr = changeDiskPassition(setGameMatrix(5), 1, 3);

    String[][] tower = printMatrix(arr, 5);

    for (String[] row : tower) {
      for (String element : row) {
        System.out.print(element);
      }
      System.out.println();
    }
    System.out.println("\u001B[93m****************************************");
  }

  public static boolean checkDecreasingOfRods(int diskNumber, int numberOfDisks) {
    boolean decrease = true;
    if ((diskNumber % 2 == 0 && numberOfDisks % 2 == 1) || (diskNumber % 2 == 1
        && numberOfDisks % 2 == 0)) {
      decrease = false;
    }
    return decrease;
  }


  public static String[][] printMatrix(int[] gameMatrix, int numberOfDisks) {
    String[] symbols = {"", "\u001B[93m      #       ", "\u001B[92m     ###       ",
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

  public static int[] changeDiskPassition(int[] gameMatrix, int disk, int possition) {

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

  public static int[] setGameMatrix(int numberOfDisks) {
    int[] gameMatrix = new int[numberOfDisks + 1];
    for (int i = 0; i <= numberOfDisks; i++) {
      if (i == 0) {
        gameMatrix[0] = 0;
      } else {
        gameMatrix[i] = 1;
      }

    }

    return gameMatrix;

  }
/*  public static int[][] setGameMatrix(int numberOfDisks) {
    int[][] gameMatrix = new int[numberOfDisks][3];
    for (int i = 0; i < numberOfDisks; i++) {
      for (int j = 0; j < 3; j++) {
        if (j == 0) {
          gameMatrix[i][j] = 1 + i;
        } else {
          gameMatrix[i][j] = 0;
        }

      }
    }
    return gameMatrix;

  }*/


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
}



/*
    System.out.println(checkDecreasingOfRods(2,2,4));


    }
  public static boolean checkDecreasingOfRods(int diskNumber, int finishRod, int numberOfDisks) {
    boolean decrease=true;


    if (((diskNumber % 2 == 1) && (finishRod % 2 == 1)) && (numberOfDisks % 2 == 1)) {
      decrease = true;
    }else if(((diskNumber % 2 == 1) || (finishRod % 2 == 1)) && (numberOfDisks % 2 == 1)){
      decrease=false;
    }else if (((diskNumber % 2 == 1) || (finishRod % 2 == 1))|| (numberOfDisks % 2 == 1)){
      decrease=true;
    }else if (((diskNumber % 2 != 1) || (finishRod % 2 != 1))|| (numberOfDisks % 2 != 1)){decrease=false;}
    return decrease;
  }




}
*/




 /*public static String nameDisk(int num) {
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
      return disk;*/