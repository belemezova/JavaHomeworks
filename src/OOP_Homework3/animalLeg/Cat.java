package OOP_Homework3.animalLeg;

public class Cat extends Animal implements Pet {

  private String name;

  public Cat(String name) {
    super(4);
    this.name=name;
  }

  public Cat() {
    super(4);
    this.name="";
  }

  @Override
  void eat() {
    System.out.println("I like to eat a variety of fish, such as salmon, trout, tuna and whitefish ");
  }

  @Override
  public String getName() {
    return this.getName();
  }

  @Override
  public String setName() {
    return getName();
  }
}
/*Създайте клас Cat който наследява Animal и имплементира Pet. Cat има атрибут name.
Има конструктор който приема name като аргумент и създава Cat със зададеното име и 4 крака.
Добавете и дефолтен конструктор който инициализира Cat с празно име и 4 крака.
Имплементира методите на Pet Имплементира eat()*/