package Lec_19_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ListSum {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    boolean stillAdd = true;
    ArrayList<Integer> numbersToAdd = new ArrayList<>();
    while (stillAdd) {
      int nextNumber=Integer.parseInt(scanner.nextLine());
      numbersToAdd.add(nextNumber);
      if (nextNumber == 0) {
        stillAdd = false;
        break;
      }
    }
    for (int num:numbersToAdd) {
      sum+=num;
    }
    System.out.println(sum);
  }
}
/*Напишете програма, която събира въведените от потребителя цели числа.
Въвеждането продължава докато потребителя въведе 0.*/