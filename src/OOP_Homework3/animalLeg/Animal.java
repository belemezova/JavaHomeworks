package OOP_Homework3.animalLeg;

public abstract class Animal {

  private int legs;

  public Animal(int legs) {
  this.legs = legs;
  }

  abstract void eat();

  public void walk(){
    System.out.println("I am walking by moving my < " + this.legs + " > legs.");
  }

}
/*Създайте абстрактен клас Animal който: атрибут legs -
 представлява броя крака на животното конструктор който инициализира legs абстрактен метод eat()
 метод walk() -  Който принтира “I am walking by moving my <n> legs.”
Създайте клас Fish който наследява Pet и показва, че рибите не могат да ходят и нямат крака.”*/