package interview.STREAM;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TakeAndDropWhileChallenge {

  public static void main(String[] args) {
    List<Integer> alucardHits=List.of(9,7,1,8,5);
    Set<Integer> draculaHits= Set.of( 9, 6, 5, 7, 8);
    System.out.println(draculaHits);
/*  alucardHits.stream()
        .takeWhile(i->i>5)
        .forEach(System.out::print);
    System.out.println();
    alucardHits.stream()
        .takeWhile(i->i>5)
        .dropWhile(i->i>8)
        .forEach(System.out::print);*/
  Stream<Integer>alucardPerformHits= alucardHits.stream()
      .takeWhile(i->i>5)
      .dropWhile(i->i>8);
    System.out.println();
    draculaHits.stream()
        .takeWhile(i->i>1)
        .forEach(System.out::print);
    System.out.println();
    draculaHits.stream()
        .takeWhile(i->i>1)
        .dropWhile(i->i>7)
        .forEach(System.out::print);
    System.out.println();

  Stream<Integer>draculaPerformHits=draculaHits.stream()
      .takeWhile(i->i>1)
      .dropWhile(i->i>7);
    System.out.println();
    Stream.of(alucardPerformHits, draculaPerformHits).flatMap(h->h)
        .forEach(System.out::print);


  }

}
