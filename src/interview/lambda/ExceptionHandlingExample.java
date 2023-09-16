package interview.lambda;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

  public static void main(String[] args) {
    int[] someNumbers = {1, 2, 3, 4};
    int key = 2;
    process(someNumbers, key);
    processBiConsumers(someNumbers, key, (v, k) -> System.out.println(v + k));
    key = 1;
    processBiHandling(someNumbers, key, (v, k) -> {
      try {
        System.out.println(v / k);
      } catch (ArithmeticException ex) {
        System.out.println("An Aritmetic exception happened");
      }
    });
    key=9;
    processBiHandling(someNumbers, key, wrappedLambda(((v, k)-> System.out.println(v/k))));
    int[] someNumbers1={3,6,9,15};
    key=3;
    processBiHandling(someNumbers1, key, biLambda(((v, k)-> System.out.println(v/k))));
  }

  private static void process(int[] someNumbers, int key) {
    for (int i : someNumbers) {
      System.out.println(i + key);
    }
  }

  private static void processBiConsumers(int[] someNumbers, int key,
      BiConsumer<Integer, Integer> consumer) {
    for (int i : someNumbers) {
      try {
        consumer.accept(i, key);
      } catch (ArithmeticException e) {

      }
    }
  }

  private static void processBiHandling(int[] someNumbers, int key,
      BiConsumer<Integer, Integer> consumer) {
    for (int i : someNumbers) {
      consumer.accept(i, key);
    }
  }

  private static BiConsumer<Integer, Integer> wrappedLambda(BiConsumer<Integer, Integer> consumer) {
    return (v,k)-> System.out.println(v+k);
  }

  private static BiConsumer<Integer, Integer> biLambda(BiConsumer<Integer, Integer> consumer) {
    return (v,k)-> {
      System.out.println("Executing from wrapper:");
      try{
      consumer.accept(v,k);}
    catch(ArithmeticException ex){
      System.out.println("Exception caught in wrapper lambda");
    }
  };}
}
