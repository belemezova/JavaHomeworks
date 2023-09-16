package OOP_Homework3.animalLeg;

public class Fish extends Animal implements Pet {

  public Fish() {
    super(0);
  }

  @Override
  public String getName() {

    return "";
  }

  @Override
  public String setName() {
    return getName();
  }

  @Override
  void eat() {
    System.out.println("I eat food that i like most");
  }

  @Override
  public String toString() {
    return super.toString();
  }

  @Override
  public void walk() {
    System.out.println("Sorry, you know we couldn't walk. We just swim");
  }

}
