package Lec_19_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNames {

  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    ArrayList<String>namesToOrder=new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      namesToOrder.add(scanner.nextLine());

    }
    Collections.sort(namesToOrder);
    System.out.println(namesToOrder);

  }
}
/*Напишете програма, която изисква от потребителя да въведе 3 имена от конзолата.

След това, имената се сортират в азбучен ред и се отпечатват на екрана.
Ivan
Petar
Asen
[Asen, Ivan, Petar]*/