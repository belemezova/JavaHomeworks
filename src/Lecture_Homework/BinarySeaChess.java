package Lecture_Homework;

import java.util.Scanner;

public class BinarySeaChess {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please choose number between 1 and 9:");
    printBoard();
    int nextChoice = Integer.parseInt(scanner.nextLine());
    int numberToBeCheck = 0b1 << (8 - nextChoice + 1);
    int counter = 1;
    int player = 0b0;

    int player1 = 0b0;
    int player2 = 0b0;
    while (player != 0b111111111) {
      if (counter % 2 != 0) {
        player1 += numberToBeCheck;
      } else {
        player2 += numberToBeCheck;
      }
      fillBoard(player1, player2);
      if (isRowChess(player1) || isColumnChess(player1) || isDiagonalChess(player1)) {
        System.out.println("The player1 wins!");
        break;
      } else if (isRowChess(player2) || isColumnChess(player2) || isDiagonalChess(player2)) {
        System.out.println("The player2 wins!");
        break;
      }
      player += numberToBeCheck;
      if (player == 0b111111111) {
        break;
      }
      System.out.printf("Please choose next number:");
      nextChoice = Integer.parseInt(scanner.nextLine());
      numberToBeCheck = 0b1 << (8 - nextChoice + 1);
      if ((player & numberToBeCheck) == numberToBeCheck) {

        while (((player & numberToBeCheck) == numberToBeCheck) && (player != 0b111111111)) {
          System.out.println("Please make new choice. The place isn't empty");
          nextChoice = Integer.parseInt(scanner.nextLine());
          numberToBeCheck = 0b1 << (8 - nextChoice + 1);
        }
      }
      counter += 1;
    }
  }

  private static void printBoard() {
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        if ((i % 2 == 1) && (j % 2 == 1)) {
          System.out.print(" ");
        } else if ((i % 2 == 1) && (j % 2 == 0)) {
          System.out.print("|");
        } else if ((i % 2 == 0) && (j % 2 == 1)) {
          System.out.print("-");
        } else if ((i % 2 == 0) && (j % 2 == 0)) {
          System.out.print("+");
        }
      }
      System.out.println();
    }
  }

  private static void fillBoard(int n1, int n2) {
    char ch = ' ';
    for (int i = 1; i <= 5; i++) {

      int index = 9;
      for (int j = 1; index >= 6 && j <= 5; j++) {
        if ((i % 2 == 1) && (j % 2 == 1)) {
          index--;
          switch (i) {
            case 1:
              if ((n1 & (1 << (index - i + 1))) != 0) {
                ch = 'x';
              } else if ((n2 & (1 << (index - i + 1))) != 0) {
                ch = 'o';
              } else {
                ch = ' ';
              }
              break;
            case 3:
              if ((n1 & (1 << (index - i))) != 0) {
                ch = 'x';
              } else if ((n2 & (1 << (index - i))) != 0) {
                ch = 'o';
              } else {
                ch = ' ';
              }
              break;
            case 5:
              if ((n1 & (1 << (index - i - 1))) != 0) {
                ch = 'x';
              } else if ((n2 & (1 << (index - i - 1))) != 0) {
                ch = 'o';
              } else {
                ch = ' ';
              }
              break;
          }
          System.out.printf("%c", ch);
        } else if ((i % 2 == 1) && (j % 2 == 0)) {
          System.out.print("|");
        } else if ((i % 2 == 0) && (j % 2 == 1)) {
          System.out.print("-");
        } else if ((i % 2 == 0) && (j % 2 == 0)) {
          System.out.print("+");
        }
      }
      System.out.println();
    }
  }


  private static boolean isDiagonalChess(int player) {
    if ((player & 0b100010001) == 0b100010001 || (player & 0b001010100) == 0b001010100) {
      return true;
    }
    return false;
  }

  private static boolean isColumnChess(int player) {
    for (int i = 0; i < 3; i += 1) {
      int b = 0b100100100 >> i;
      int num1 = player & (b);
      if (num1 - b == 0) {
        return true;
      }
    }
    return false;
  }

  private static boolean isRowChess(int player) {
    for (int i = 0; i < 9; i += 3) {
      int b = 0b111 << i;
      int num1 = player & (b);
      if (num1 - b == 0) {
        return true;
      }
    }
    return false;
  }
}




      /*switch (count) {
        case 0b111000000:448
        case 0b000111000:56
        case 0b000000111:7
        case 0b100100100:292
        case 0b010010010:146
        case 0b001001001:73
        case 0b100010001:273
        case 0b001010100:84
        */