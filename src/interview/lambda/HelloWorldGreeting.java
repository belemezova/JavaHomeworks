package interview.lambda;

public class HelloWorldGreeting implements IGreeting{

  @Override
  public void perform() {
    System.out.println("Hello world!");
  }
}
