package Lec_17_Knowedge;

import java.util.Scanner;

public class CharFrequency {

  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    String sentence= scanner.nextLine();
    char ch= scanner.next().charAt(0);
    int counter=0;
    for (int i = 0; i < sentence.length(); i++) {
      if (sentence.charAt(i)==ch){
        counter+=1;
      }
    }
    System.out.println(counter);
  }
}
/*Направете програма, която очаква от потребителя да въведе:

Изречение
Символ
Нека вашата програма изчисли колко пъти въведения символ се среща в
изреченито и да го отпечата на екрана.

Метода str.charAt(i) връща символа от даденият стринг на позиция i.*/