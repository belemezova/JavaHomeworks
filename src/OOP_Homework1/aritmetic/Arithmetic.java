package OOP_Homework1.aritmetic;

import java.util.List;

public class Arithmetic {

public int calculateSum (int number1, int number2){
  return number1+number2;
}
public long add (List<Integer> sequenceOfNumbers){
  long sum=0;
  for (int i : sequenceOfNumbers) {
    sum+=i;
  }
  return sum;
}
}
/*2. Arithmetic Operations
Напишете клас Arithmetic който има метод add. Методът приема като аргументи две цели числа и връща тяхната сума.
Напишете клас Adder който наследява Arithmetic. Сега добавете още един метод add в
клас Arithmetic който събира неопределен брой цели числа.
В main метода генерирайте цяло число N между 2 и 20 включително.
 След това генерирайте N на брой случайни цели числа и ги подайте на add метода.
*/