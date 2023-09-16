package Lec_14_Conditionals;

import java.util.Scanner;

public class NumberOfWords {

  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    String sentence=scanner.nextLine();
        int wordsNumber= sentence.split(" ").length;
        if (wordsNumber>10){
          System.out.println("твърде дълго изречение");
        }else{
          switch (wordsNumber){
            case 1:
              System.out.println("една");
              break;
            case 2:
              System.out.println("две");
              break;
              case 3:
              System.out.println("три");
              break;
              case 4:
              System.out.println("четири");
              break;
              case 5:
              System.out.println("пет");
              break;
            case 6:
              System.out.println("шест");
              break;
            case 7:
              System.out.println("седем");
              break;
            case 8:
              System.out.println("осем");
              break;
            case 9:
              System.out.println("девет");
              break;
            case 10:
              System.out.println("десет");
              break;
          }
        }
    /*Да се отпечата “с думи” броя на думите във въведеното изречение на български език.

Използване на String.split().length за да определите броят на думите.

Ако са повече от 10 - просто отпечатва “твърде дълго изречение” (без кавичките)*/
  }

}
