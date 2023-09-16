package interview.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.swing.plaf.basic.BasicSplitPaneUI.BasicVerticalLayoutManager;

public class CollectionIterationExample {

  public static void main(String[] args) {
    List<Person> people = Arrays.asList(
        new Person("Emil", "Vasilev", 60),
        new Person("Vasil", "Ivanov", 18),
        new Person("Petar", "Petrov", 42),
        new Person("Todor", "Pushev", 42),
        new Person("Ivan", "Todorov", 44),
        new Person("Georgi", "Dimitrov", 43)
    );
    //iterate over people collection
    //They are cold External iterator -
    // you are basically write code to perform this operation primitively
    System.out.println("Using for loop");
    for (int i = 0; i < people.size(); i++) {
      System.out.println(people.get(i));
    }
    System.out.println();
    System.out.println("Using for in loop");
    for (Person p : people) {
      System.out.println(p);
    }
    System.out.println();

    //Internal iteration. You give the controller of iteration to runtime
    //calling a new method
    //forEach-is a method of instance of Consumer
    //Consumer <?super Person > action

    System.out.println("Using lambda for each loop");
    people.forEach(p -> System.out.println(p));
    System.out.println();
    System.out.println("Using lambda method reference");
    System.out.println("This is very easy for processor to run in multiple thread and parallelism");
    people.forEach(System.out::println);

  }
}
