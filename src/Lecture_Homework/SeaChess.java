package Lecture_Homework;

import java.util.Scanner;

public class SeaChess {

  public static int isPossible(int chosenNumber, StringBuilder allPossibleMoves) {
     String symbol = String.valueOf(chosenNumber);
    return (allPossibleMoves.indexOf(symbol));

  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int field = 0b111111111;
    //predetermined winning models
    int row1 = 0b111000000;
    int row2 = 0b000111000;
    int row3 = 0b000000111;
    int columnA = 0b100100100;
    int columnB = 0b010010010;
    int columnC = 0b001001001;
    int diagonalD1 = 0b100010001;
    int diagonalD2 = 0b001010100;
    System.out.println("Please enter number between 1 and 9: ");
    int player1 = Integer.parseInt(scanner.nextLine());
    int n = player1 - 1;
    int player2 = 0;
    int counter1 = 0;
    int counter2 = 0;
    boolean end = false;
    int countRounds = 1;
    while (end != true) {
      int subs = 0b100000000;
      subs = subs >> n;
      field = field - subs;
      StringBuilder allPossibleMoves =  new StringBuilder("123456789");
      String symbol = "\\u000" + player1;
      String container=""+symbol;
      allPossibleMoves=allPossibleMoves.deleteCharAt(player1-1);
      if (countRounds % 2 != 0) {
        counter1 = counter1 | subs;
        player1 = 0;
      } else {
        counter2 = counter2 | subs;
        player2 = 0;
      }
      if ((counter1&row1) == (row1) || (counter1&row2) == (row2) || (counter1&row3) ==
          (row3) || (counter1&columnA) == (columnA) || (counter1&columnB) ==
          (columnB) || (counter1&columnC) == (columnC) || (counter1&diagonalD1) == (diagonalD1)
          || (counter1&diagonalD2) == (diagonalD2)) {
        end = true;
        System.out.println("The first player wins");
        break;
      } else if ((counter2&row1) == (row1) || (counter2&row2) == (row2)
          || (counter2&row3) ==
          (row3) || (counter2&columnA) == (columnA) || (counter2&columnB) ==
          (columnB) || (counter2) == (columnC&columnC) || (counter2&diagonalD1) == (diagonalD1)
          || (counter2&diagonalD2) == (diagonalD2)) {
        end = true;
        System.out.println("The second player wins");
        break;
      }
      if (field == 0b0) {
        break;
      } else {
        System.out.println("Please enter number between 1 and 9: ");
        if (countRounds % 2 != 0) {
          player2 = Integer.parseInt(scanner.nextLine());
          n = player2 - 1;
          System.out.println(isPossible(player2,allPossibleMoves));
          while (isPossible(player2,allPossibleMoves)==(-1)){
            System.out.println("The field is already taken.You have to make another choice:");
            player2 = Integer.parseInt(scanner.nextLine());
            n = player2 - 1;
          }

        } else {
          player1 = Integer.parseInt(scanner.nextLine());
          n = player1 - 1;
          while (isPossible(player2,allPossibleMoves)==(-1)){
            System.out.println("The field is already taken.You have to make another choice:");
            player1 = Integer.parseInt(scanner.nextLine());
            n = player1 - 1;
          }
        }
        countRounds += 1;

      }
    }



  }
}

