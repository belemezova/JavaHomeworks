package OOP_Homework1.aritmetic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArithemticTest {

  public static void main(String[] args) {
    Arithmetic arithmetic = new Adder();
    System.out.println(arithmetic.getClass());
    System.out.println(arithmetic.getClass().getSuperclass());
    Random random=new Random();
    int numberSequence = random.nextInt(21);
    List<Integer> numbers=new ArrayList<>();
    for (int i = 0; i < numberSequence; i++) {
      numbers.add(random.nextInt());
    }
    System.out.println("First sum is: "+ arithmetic.add(numbers));
   int n=20000;
    List<Integer> nextSequence=new ArrayList<>();
    for (int i = 0; i < n; i++) {
      nextSequence.add(random.nextInt());
    }
    System.out.println("Next sum is:" + arithmetic.add(nextSequence));

  }
}
/*В ArithemticTest.java създайте променлива “arithmetic”
от тип Arithmetic която да е инстанция на Adder.
Принтирайте в конзолата следните редове: System.out.println(arithmetic.getClass());
System.out.println(arithmetic.getClass().getSuperclass());
Ако не разбирате какво означава този изход кажете ми на следващата лекция за да го обясним.
Сега добавете още един метод add в клас Arithmetic който събира неопределен брой цели числа.
В main метода генерирайте цяло число N между 2 и 20 включително.
 След това генерирайте N на брой случайни цели числа и ги подайте на add метода.
А сега нека N = 2,000,000,000 -> Какво стана?*/