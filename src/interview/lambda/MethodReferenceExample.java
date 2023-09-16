package interview.lambda;

public class MethodReferenceExample {

  public static void main(String[] args) {
    Thread t=new Thread(()-> System.out.println("Hello"));
    t.run();
    t.start();
    Thread tr=new Thread(MethodReferenceExample::printMessage);
    tr.start();
  }
  public static void printMessage(){
    System.out.println("Hello you too");
  }
}
//If you just executing a method in your lambda expression , use method reference
