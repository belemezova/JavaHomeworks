package interview.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MethodREferenceExample1 {

  public static void main(String[] args) {
    List<Person> people = Arrays.asList(
        new Person("Emil", "Vasilev", 60),
        new Person("Vasil", "Ivanov", 18),
        new Person("Petar", "Petrov", 42),
        new Person("Todor", "Pushev", 42),
        new Person("Ivan", "Todorov", 44),
        new Person("Georgi", "Dimitrov", 43)
    );
    System.out.println("Print all persons");
    performConditionaly(people, p -> true, p -> System.out.println(p));
    performConditionaly(people, p -> true, System.out::println);//p->method(p)
  }

  public static void performConditionaly(List<Person> people, Predicate<Person> predicate,
      Consumer<Person> consumer) {
    for (Person p : people) {
      if (predicate.test(p)) {
        consumer.accept(p);
      }
    }
  }

}
