
package Lec_19_ArrayList;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class HangMan {

  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(
        new File("C:\\Users\\zaham\\Desktop\\Java\\Java\\words_alpha.txt"));
    Scanner scanner=new Scanner(System.in);
    final int MAX_Tries = 6;
    ArrayList<String> wordTreasure = new ArrayList<>();
    while (sc.hasNext()) {
      wordTreasure.add(sc.nextLine());
    }
    Random rand = new Random();
    String word = wordTreasure.get(rand.nextInt(wordTreasure.size()));


    boolean thisIsWord = false;
    int numberOfWrongGuesses = 0;
    char letter=' ';


    ArrayList<Character> guessWord = new ArrayList<>(word.length());

    System.out.printf(
        "\nWelcome to HANGMAN!\nGuess a word!\nEach letter is represented by a dash.\n"
            + "You have only one letter in a try!\nThere is %d tries to guess the word\n",
        MAX_Tries);
    printWord(word, guessWord, letter);
    while (thisIsWord != true) {

      System.out.print("\nGuess a letter: ");
      letter = scanner.nextLine().toLowerCase().charAt(0);
      guessWord.add(letter);
      printWord(word, guessWord, letter);
     int cont=word.indexOf(letter);
      if (cont==-1){
        System.out.println("Whoops! That letter isn't in there!");
        numberOfWrongGuesses++;
        printHangPlatform(numberOfWrongGuesses);
        System.out.printf("You have %d guesses left\n", MAX_Tries - numberOfWrongGuesses);

      } else if (guessWord.indexOf("-")!=-1){
        System.out.println("You found a letter! Isn't that exciting!");

      }

      if (guessWord.indexOf("-")==-1){
        thisIsWord=true;
        System.out.println("congratulations");
      }
    }
  }

  public static void printHangPlatform(int mistakes) {
    Character[] body = new Character[7];
    Arrays.fill(body, ' ');
    switch (mistakes) {
      case 6:
        body[6] = '\\';

      case 5:
        body[5] = '/';

      case 4:
        body[4] = '\\';

      case 3:
        body[3] = '/';

      case 2:
        body[2] = '|';

      case 1:
        body[1] = ')';
        body[0] = '(';
        break;
      default:
        break;

    }
    System.out.printf("\t _________\n" +
            "\t|         |\n" +
            "\t|         |\n" +
            "\t|        %c %c\n" +
            "\t|        %c%c%c\n" +
            "\t|        %c %c\n" +
            "\t|             \n" +
            "\t|             \n" +
            "\t|             \n" +
            "\t\b======            \n", body[0], body[1], body[3],
        body[2], body[4], body[5], body[6]);
  }

  public static void printWord(String word, ArrayList guessWord, char letter) {
    for (int i = 0; i < word.length(); i++) {
      if (guessWord.contains(word.charAt(i))) {
        System.out.print(word.charAt(i));

      } else {
        System.out.print("-");
      }
    }
    System.out.println();
    return;
  }

}



