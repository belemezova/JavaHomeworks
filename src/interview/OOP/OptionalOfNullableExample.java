package interview.OOP;

import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalOfNullableExample {
static String finalZionValue = "";
static  int matrixCount=0;

  public static void main(String[] args) {
    Optional<String> optFromMatrix=Optional.ofNullable(finalZionValue);
    var agentSmith="Virus";
    finalZionValue+=Optional.ofNullable(agentSmith).orElse(getVisionFromOracle());
    System.out.println(finalZionValue);
    finalZionValue+=optFromMatrix.orElseGet(OptionalOfNullableExample::getVisionFromOracle);
    System.out.println(finalZionValue);
    finalZionValue+=matrixCount;
    System.out.println(finalZionValue);
    String neo=null;
    try{
      Optional.ofNullable(neo).orElseThrow(IllegalArgumentException::new);
    }catch (Exception ex){
      finalZionValue+=Optional.ofNullable(neo).or(()->Optional.of("theOne")).get();
      System.out.println(finalZionValue);
    }
    finalZionValue+=Optional.of("trinity").stream().map(String::toUpperCase)
        .filter(t->t.equals("TRINITY"))
        .collect(Collectors.joining());
    System.out.println(finalZionValue);


  }

  private static String getVisionFromOracle() {
    matrixCount++;
    finalZionValue="KeyMarker";
    return "Architect";
  }
}
