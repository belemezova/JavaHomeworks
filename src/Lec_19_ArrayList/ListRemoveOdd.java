package Lec_19_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ListRemoveOdd {

  public static void main(String[] args) {
    ArrayList<Integer>holdNumbers=new ArrayList<>(Arrays.asList(1, 4, 6, 2, 10, 5));
    ArrayList<Integer>elementHoldNumbers=new ArrayList<>();
    for (int i = 0, j=0; i < holdNumbers.size(); i++) {
      if (i%2==0){
        elementHoldNumbers.add(j,holdNumbers.get(i));
        j++;
      }
    }
    holdNumbers.removeAll(elementHoldNumbers);

     }
}

/*Направете променлива, която е списък от цели числа.
Инициализирайте списъка със следните елементи: 1, 4, 6, 2, 10, 5.

Напишете програма, която да премахне всеки елемент на нечетна позиция от списъка.
 Внимавайте с for-a - ако махнете първият елемент - вторият ще стане първи.

Може да почнете итерацията в обратен ред - отзад, напред*/
