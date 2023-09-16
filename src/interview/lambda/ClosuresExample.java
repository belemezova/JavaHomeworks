package interview.lambda;

public class ClosuresExample {

  public static void main(String[] args) {
    int a=10;
    int b=20;
    //compiler freezes the value of b and
    // if I try to change it in the body of inner class it will give me an error
    //it is effectively final
    doProcess(a, new Process() {
      @Override
      public void process(int i) {
        System.out.println(i+b);
      }
    });
    doProcess(a, v-> System.out.println(v+b));
  }
    private static void doProcess ( int i, Process p){
      p.process(i);
    }

}

interface Process {

  void process(int i);
}