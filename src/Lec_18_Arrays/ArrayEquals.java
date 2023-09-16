package Lec_18_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEquals {

  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int[] myArray={1, 10, 15};
    int [] yourArray =new int[3];
    boolean isEqual=true;
    yourArray[0]=Integer.parseInt(scanner.nextLine());
    yourArray[1]=Integer.parseInt(scanner.nextLine());
    yourArray[2]=Integer.parseInt(scanner.nextLine());
    Arrays.sort(yourArray);
    for (int i = 0; i <myArray.length; i++) {
      if(myArray[i]!=yourArray[i]){isEqual=false;
      break;}
    }
    System.out.println(isEqual);
  }
}
/*Нека имаме следният масив:

int[] myArray = { 1, 10, 15 };
Напишете програма, която очаква потребителя да въведе 3 числа,
които съхранявате в масив.

Сверете дали елементите на въведения масив е същият,
като myArray и ако е, отпечатайте “true”, в противен случай - “false”.*/