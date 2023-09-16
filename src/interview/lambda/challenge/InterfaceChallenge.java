package interview.lambda.challenge;

import java.util.function.Function;

public class InterfaceChallenge {

  interface Jedi {
    String MASTER = "Yoda";

    default String attack() {return jump(jedi -> String.join(jedi, useSaber(), useForce())); }

    private String jump(Function<String, String> function) {return function.apply("Luke"); }
    private static String useSaber(){ return "S";}
    private String useForce() { return "F";}}

  public static void main(String[] args) {
    System.out.println(new Jedi (){public String useForce(){return "X";}}.attack());
    System.out.println(Jedi.useSaber());
    System.out.println(Jedi.MASTER);
    System.out.println(new Jedi (){public String useForce(){return "X";}}.attack()+Jedi.useSaber()+Jedi.MASTER);

    }

//Juke is being a delimeter
  // ако методът useForce беше default public,той щеше да се override-не и тогава резулатът ще бъде: SLukeXSYoda
}
