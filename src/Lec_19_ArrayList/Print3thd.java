package Lec_19_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Print3thd {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> names = new ArrayList<>();
    boolean newName = true;
    while (newName) {
      String nextName = scanner.nextLine();
      if (nextName.equals(".")) {
        newName = false;
      } else {
        names.add(nextName);
      }
    }
    if (names.size() < 2) {
      System.out.println("");
    } else {
      System.out.println(names.get(2));
    }
    Collections.sort(names);
    System.out.println(names);
  }
}
/*Напишете програма, която изисква от потребителя да въвежда имена от конзолата,
като въвеждането приключва, когато потребителя въведе точка (.).

Отпечатайте 3-тото въведено име на екрана.

Сортирайте списъка и отпечатайте сортирания списък.

Ivan
Petar
Asen
Gosho
Dimitar
.

Asen
[Asen, Dimitar, Gosho, Ivan, Petar]*/