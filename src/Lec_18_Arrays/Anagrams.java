package Lec_18_Arrays;

import java.util.Scanner;

public class Anagrams {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String firstWordToCheck = scanner.nextLine().toLowerCase();
    String secondWordToCheck = scanner.nextLine().toLowerCase();
    char[] firstWord = firstWordToCheck.toCharArray();
    char[] secondWord = secondWordToCheck.toCharArray();
    int length = firstWord.length;
    char[] result = new char[length];
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        if (firstWord[i] == secondWord[j]) {
          result[i] = secondWord[j];
          secondWord[j]=' ';
          break;
        }
      }
    }
    boolean isAnagram = true;
    for (int i = 0; i < length; i++) {
      if (firstWord[i] != result[i]) {
        isAnagram = false;
      }
    }
    System.out.println(isAnagram);
  }
}
/*Направeте програма, която прочита две думи от конзолата и отпечатва true,
ако те са анаграми и false, ако не са. Абстрахирайте се от големината на буквите.

Анаграми са Java и Vaaj например.
И двата стринга са съставени от едни и същи букви, които са в разбъркан ред.

Подсказка: String.toCharArray() методът ще ви помогне да конвертирате стринга в масив от char елементи.
За да може да сравните дали са еднакви, ще се наложи да ги подредите по един и същ ред.

Не забравяйте един от най-добрите приятели на програмиста - не кучето, а класът Arrays.
Той може да ви е от изключителна полза.*/