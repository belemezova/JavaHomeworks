package interview.lambda;

public class Greeter {
 public void greet (IGreeting greeting){
   greeting.perform();
 }
  public static void main(String[] args) {
    Greeter greeter=new Greeter();
    IGreeting helloWorldGreeting= new HelloWorldGreeting();
    IGreeting lambdaGreeting=()-> System.out.println("Hello world!");

    greeter.greet(helloWorldGreeting);
    greeter.greet(()-> System.out.println("Make me proud!\n"));

    helloWorldGreeting.perform();
    lambdaGreeting.perform();


    //anonymous inner class
 IGreeting innerGreeting= new IGreeting() {
   @Override
   public void perform() {
     System.out.println("Hello world! -inner ");
   }};
 innerGreeting.perform();
 greeter.greet(innerGreeting);




    /*
    Execute lambda expression:
    By calling the interface method on it,
    just as if it were an instance of a class
    We are implementing the function but not implementing the  class- difference
    We do not create a class and then mplement the function. We just implement the function inline
    How to be sure that this is not just an imolementation:
     -
     */


}}
