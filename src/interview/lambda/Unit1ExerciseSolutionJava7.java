package interview.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

  public static void main(String[] args) {

    List<Person> people = Arrays.asList(
        new Person("Emil", "Vasilev", 60),
        new Person("Vasil", "Ivanov", 18),
        new Person("Petar", "Petrov", 42),
        new Person("Todor", "Pushev", 42),
        new Person("Ivan", "Todorov", 44),
        new Person("Georgi", "Dimitrov", 43)
    );
    //Step 1: Sort list by last name

    Collections.sort(people, new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {

        return o1.getLastName().compareTo(o2.getLastName());
      }
    });
    //Step 2: Create a method that prints all elements in the list
   printSortedPeople(people);
    System.out.println();
    //Step 3: Create a method that prints all people that have last name beginning with P
    printNamesWithP(people);
    System.out.println();
    printConditionally(people, new Condition() {
      @Override
      public boolean test(Person p) {
        return p.getLastName().startsWith("P");
      }
    });
    System.out.println();
    printConditionally(people, new Condition() {
      @Override
      public boolean test(Person p) {
        return p.getFirstName().startsWith("T");
      }
    });
  }

  private static void printConditionally(List<Person> people, Condition condition) {
    for (Person per : people) {
      if (condition.test(per)) {
        System.out.println(per);
      }
    }
  }

  private static void printNamesWithP(List<Person> people) {
    for (Person per : people) {
      if (per.getLastName().startsWith("P")) {
        System.out.println(per);
      }
    }
  }

  private static void printSortedPeople(List<Person> p) {
    for (Person per : p) {
      System.out.println(per);
    }
  }
}

interface Condition {

  boolean test(Person p);
}