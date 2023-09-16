package Lecture_Homework;

import java.util.Scanner;

public class BinaryCombination {

  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.print("Please enter number of digits: ");
    int numberDigits=Integer.parseInt(scanner.nextLine());
    System.out.print("Please enter base: ");
    int baseSystem=Integer.parseInt(scanner.nextLine());
    Integer[] memory=new Integer[numberDigits];
    fillMemory(memory, 0, baseSystem);
  }

  public static void fillMemory(Integer[] memory, int index, int m) {
    if(index>= memory.length){
      print(memory);
     return;
    }
    for (int i = 0; i <=m-1; i++) {
      memory[index]=i;
      fillMemory(memory, index+1, m);
    }
  }

  private static void print(Integer[] memory) {
    for (Integer integer:memory) {
      System.out.print(integer);
    }
    System.out.println();
  }
}
