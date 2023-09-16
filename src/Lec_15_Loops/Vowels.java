package Lec_15_Loops;

import java.util.Scanner;

public class Vowels {

  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    String sentence = scanner.nextLine().toLowerCase();
    int counter=0;
    for(int i=0; i<sentence.length(); i++) {
      if(sentence.charAt(i) == 'a'|| sentence.charAt(i) == 'e'||
          sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' ||
          sentence.charAt(i) == 'u'|| sentence.charAt(i) == 'y')

        counter+=1;
    }
    System.out.println(counter);
  }
}
/*Направете програма Vowels, която прочита изречение (на английски)
от конзолата и отпечатва колко гласни има в него.
These shoes don"t fit my feet.
Дължината на String можете да вземете чрез метода String.length(),
например: "hello world".length().
А за да вземете първият символ от стринга, ползвайте "hello world".charAt(0)*/