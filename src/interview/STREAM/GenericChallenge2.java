package interview.STREAM;

public class GenericChallenge2 {

  public static void main(String[] args) {
    Archer archer=new Archer();
    System.out.println(archer.t);

    archer.attack("->");
    archer.attack(Double.valueOf(1.0));
    archer.attack(Float.valueOf(1));

    archer.attacked("->");
    archer.attacked(Double.valueOf(1.0));
    archer.attacked(Float.valueOf(1));

    Archerer archerer=new GenericChallenge2().new Archerer();
    System.out.println(archer.t);

    archerer.attack("->");
    archerer.attack(Double.valueOf(1.0));
    archerer.attack(Float.valueOf(1));

    archerer.attacked("->");
    archerer.attacked(Double.valueOf(1.0));
    archerer.attacked(Float.valueOf(1));
  }
  static class Archer<T>{
    String t;
    void attack (T t){
      System.out.println( this.t);
    }
    void attacked (T t){
      System.out.println( t);
    }
  }
class Archerer<T>{
    String t;
    void attack (T t){
      System.out.println( this.t);
    }
    void attacked (T t){
      System.out.println( t);
    }
  }
}
