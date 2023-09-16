package interview.STREAM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class GenericChallange3 {

  public static void main(String[] args) {

    List<String> firstResult = GenericChallange3.<String>get(new ArrayList<>(), new

        String("2"));
    System.out.println(firstResult.toString());
    List<Object> secondResult = GenericChallange3.get("Homer", Double.valueOf("4"));
    System.out.println(secondResult.toString());
    Stream<Object> stream = Stream.concat(firstResult.stream(), secondResult.stream());
   stream.forEach(System.out::println);
  }

  public static <T> List<T> get(List<T> list, T t) {
    list.add(t);
    return list;
  }

  public static <T, R extends T> List<T> get(T type1, R type2) {
    //it is impossible to make R double and to make T String, because is impossible double to extends string
    //the only way to make it work is T to be object and R to be object
    List<T> list = new ArrayList<>();
    list.add(type1);
    list.add(type2);
    return list;
  }
}
