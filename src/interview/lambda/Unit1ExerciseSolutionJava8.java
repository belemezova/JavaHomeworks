package interview.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionJava8 {

  public static void main(String[] args) {

    List<Person> people = Arrays.asList(
        new Person("Emil", "Vasilev", 60),
        new Person("Vasil", "Ivanov", 18),
        new Person("Petar", "Petrov", 42),
        new Person("Todor", "Pushev", 47),
        new Person("Ivan", "Todorov", 44),
        new Person("Georgi", "Dimitrov", 43)
    );
    //Step 1: Sort list by last name

    Collections.sort(people, ((o1, o2) -> o1.getLastName().compareTo(o2.getLastName())));
    //Step 2: Create a method that prints all elements in the list
    System.out.println("Printing all persons:");
    printAll(people);
    printConditionally(people, p->true);
    performPredicate(people, p->true);
    performConditionaly(people, p->true, p-> System.out.println(p));
    System.out.println();

    //Step 3: Create a method that prints all people that have last name beginning with P

    System.out.println("Printing all persons which last name strats with P:");
    performPredicate(people, (p -> p.getLastName().startsWith("P")));
    printConditionally(people, (p -> p.getLastName().startsWith("P")));
    performConditionaly(people, (p -> p.getLastName().startsWith("P")), p-> System.out.println(p));
    System.out.println();



    System.out.println("Printing all persons which first name strats with P:");
    performPredicate(people, (p ->p.getLastName().startsWith("P")));
    printConditionally(people, (p -> p.getLastName().startsWith("P")));
    performConditionaly(people, p->p.getLastName().startsWith("P"), p-> System.out.println(p.getLastName()));
    System.out.println();
  }

  private static void printAll(List<Person> people) {
    for (Person per : people) {
      System.out.println(per);
    }
  }

  private static void printConditionally(List<Person> people, Condition condition) {
    for (Person per : people) {
      if (condition.test(per)) {
        System.out.println(per);
      }
    }
  }
  private static void performPredicate(List<Person> people, Predicate<Person> predicate) {
    for (Person per : people) {
      if (predicate.test(per)) {
        System.out.println(per);
      }
    }
  }
  private static void performConditionaly(List<Person>p, Predicate<Person>predicate, Consumer<Person>consumer){
    for (Person pr:p) {
      if(predicate.test(pr)){
        consumer.accept(pr);
      }
    }
  }
  interface Conditon {

    boolean check(List<Person> p);
  }
}