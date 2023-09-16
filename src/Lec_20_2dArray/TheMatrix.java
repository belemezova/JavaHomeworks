package Lec_20_2dArray;


import java.util.Scanner;

public class TheMatrix {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean correctInput = false;
    int rows = 1;
    int column = 1;

    while (correctInput == false) {

      System.out.print("Брой редове: ");
      rows = Integer.parseInt(scanner.nextLine());
      if (rows < 10 && rows > 0) {
        correctInput = true;
      }
    }
    correctInput = false;
    while (correctInput == false) {

      System.out.print("Брой колони: ");
      column = Integer.parseInt(scanner.nextLine());
      if (column < 10 && column > 0) {
        correctInput = true;
      }
    }
    int[][] matrix1 = new int[rows][column];
    int[][] matrix2 = new int[rows][column];
    for (int i = 1; i <= 2; i++) {

      System.out.printf("Въведете матрица %d:%n", i);
      for (int j = 0; j < rows; j++) {
        for (int k = 0; k < column; k++) {
          System.out.printf("Ред %d, Колона %d = ", j, k);
          int number = Integer.parseInt(scanner.next());

          switch (i) {
            case 1:
              matrix1[j][k] = number;
              break;
            case 2:
              matrix2[j][k] = number;
              break;
          }
        }

      }
    }

    for (int j = 0; j < rows; j++) {
      for (int i = 1; i <= 2; i++) {
        if (i == 1) {
          for (int k = 0; k < column; k++) {
            System.out.printf("%-4d", matrix1[j][k]);
          }
        }

        if (i == 2) {
          System.out.printf(" | ");
          for (int k = 0; k < column; k++) {
            System.out.printf("%-4d", matrix2[j][k]);
          }
        }
      }
      System.out.println();

    }

    System.out.println("Сумата на матриците е:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < column; j++) {
        int[][] sumMatrix = new int[rows][column];
        sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
        System.out.printf("%-4d", sumMatrix[i][j]);
      }
      System.out.println();
    }
    System.out.print("Директната сумата на матриците е:\n");
    int[][] zeroMatrix = new int[rows][column];
    for (int[] row: zeroMatrix) {
      for (int element: row) {
        element = 0;
      }
    }

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < column; j++) {
        System.out.printf("%-4d", matrix1[i][j]);
      }
      for (int j = 0; j < column; j++) {
        System.out.printf("%-4d", zeroMatrix[i][j]);
      }
      System.out.println();
    }
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < column; j++) {
        System.out.printf("%-4d", zeroMatrix[i][j]);
      }
      for (int j = 0; j < column; j++) {
        System.out.printf("%-4d", matrix2[i][j]);
      }
      System.out.println();
    }


  }
}
/*Направете програма, която:

Очаква потребителят да въведе редове (<10).
 Докато потребителят не въведе коректен ред, програмата продължава да го пита за броя на редовете.
  Използвайте подканващ стринг "Брой редове: "
Очаква потребителят да въведе колони (<10).
Докато потребителят не въведе коректна колона, програмата продължава да го пита за броя на колоните.
 Използвайте подканващ стринг "Брой колони: "
Иска от него да въведе двете матрици, които са съставени от цели числа.
Използвайте същите подканващи низове като в дадения пример.
След това тя трябва да отпечата:

Двете матрици една до друга. Отделете двете матрици с низа " | "
стринга “Сумата на матриците е:” на отделен ред
Сборът им (поелементарна сума)
стрингът “Директната сумата на матриците е:” на отделен ред
Сборът им (пряка/директна сума)
Като отпечатвате елементите на матрицата, нека те заемат 4 символа и да са подравнение наляво.

За помощ използвайте wikipedia или MathIsFun

Брой редове: 15
Брой редове: 2
Брой колони: 2
Въведете матрица 1:
Ред 0, Колона 0 = 1
Ред 0, Колона 1 = 2
Ред 1, Колона 0 = 3
Ред 1, Колона 1 = 4
Въведете матрица 2:
Ред 0, Колона 0 = 5
Ред 0, Колона 1 = 6
Ред 1, Колона 0 = 7
Ред 1, Колона 1 = 8
1   2     | 5   6
3   4     | 7   8
Сумата на матриците е:
6   8
10  12
Директната сумата на матриците е:
1   2   0   0
3   4   0   0
0   0   5   6
0   0   7   8   */