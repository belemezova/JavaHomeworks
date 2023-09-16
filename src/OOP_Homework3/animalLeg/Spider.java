package OOP_Homework3.animalLeg;

public class Spider extends Animal{

  public Spider() {
    super(8);
  }

  @Override
  void eat() {
    System.out.println(" I eat mainly mosquitoes, flies, moths, and sometimes..... even other spiders");
  }
}
/*Създайте клас Spider който наследява Animal Нека Spider има дефолтен конструктор който създава Spider с 8 крака.
Имплементирайте метода еат() в Spider*/