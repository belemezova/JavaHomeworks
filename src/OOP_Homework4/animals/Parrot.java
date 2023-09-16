package OOP_Homework4.animals;

public class Parrot extends Bird {


  public void say() {
    System.out.println("Parrot, I am a Parrot, What do I say? Squawk, squawk, I say it all day.");
  }

  @Override
  public void sing() {
    System.out.println("I am singing \"How are you\"");
  }
}
