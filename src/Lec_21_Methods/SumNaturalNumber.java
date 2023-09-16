package Lec_21_Methods;

import java.util.Scanner;

public class SumNaturalNumber {
public static int sumNumbers(int num, int index){
  if(index<0){
    return 0;
  }
  return num+sumNumbers(num-1,index-1);
}
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int naturalNumber=Integer.parseInt(scanner.nextLine());
    System.out.println(sumNumbers(naturalNumber, naturalNumber-1));

  }
}
/*
* Целите, положителни числа 1,2,3 … се казват още натурални числа.

Нека вашата програма очаква от потребителя да въведе едно число и после
* използвайки рекурсивна функция, да изчисли сбора на всички числа от 1 до въведеното число.*/