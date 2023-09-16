package interview.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Unit1Exercise {

  public static void main(String[] args) {
    List<Person> people= Arrays.asList(
        new Person( "Emil", "Vasilev", 60),
        new Person( "Vasil", "Ivanov", 18),
        new Person( "Petar", "Petrov", 42),
        new Person( "Todor", "Pushev", 42),
        new Person( "Ivan", "Todorov", 44),
        new Person( "Georgi", "Dimitrov", 43)
    );
    //Step 1: Sort list by last name
    List<String> sortedByLastNameList= people.stream().map(s->s.getLastName()).sorted().collect(Collectors.toList());
    System.out.println("Step 1:");
    people.stream().forEach(p-> System.out.println(p.getLastName()));
    people.stream().filter(p->p.getLastName().startsWith("P")).forEachOrdered(System.out::println);
    System.out.println(sortedByLastNameList+"\n");
    people.parallelStream().filter(p->p.getLastName().startsWith("P")).count();

    //Step 2: Create a method that prints all elements in the list
    System.out.println("Step 2:");
     sortedByLastNameList.stream().forEach(System.out::println);
    System.out.println();

    //Step 3: Create a method that prints all people that have last name beginning with P

    System.out.println("Step 3:");
    people.stream().map(s->s.getLastName()).filter(s->s.startsWith("P")).forEach(System.out::println);
  }
}
