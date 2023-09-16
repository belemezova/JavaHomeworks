package OOP_Homework4.animals;

public class Petshop {

  public void printCatalogue() {
    System.out.println(String.format("%-6s: ", "1. Bird"));
    System.out.println(String.format("\t%-10s ", "1.1. Pigeon"));
    System.out.println(String.format("\t%-10s ", "1.2. Parrot"));
    System.out.println(String.format("\t%-10s ", "1.3. Seagull"));

    System.out.println(String.format("%-6s: ", "2. Mammal"));
    System.out.println(String.format("\t%-10s ", "2.1. Dog"));
    System.out.println(String.format("\t%-10s ", "2.2. Cat"));

  }
  public void printCatalogue(String animal) {
  switch (animal){
    case "Bird":
      System.out.println(String.format("\t%-5s ", "1. Pigeon"));
      System.out.println(String.format("\t%-5s ", "2. Parrot"));
      System.out.println(String.format("\t%-5s ", "3. Seagull"));
      break;
    case "Mammal":
      System.out.println(String.format("\t%-5s ", "1. Dog"));
      System.out.println(String.format("\t%-5s ", "2. Cat"));
    break;
  }

  }
}
/*

public class SuperClasses {
    public static void main(String[] args) {
        showHierarchy(JTextField.class);
    }
    static void showHierarchy(Class<?> c) {
        if (c.getSuperclass() == null) {
            System.out.println(c.getName());
            return;
        }
        showHierarchy(c.getSuperclass());
        System.out.println(c.getName());
    }
}
Създайте клас Petshop който има метод printCatalogue.
Използвайте метод overloading за да направите две различни имплементации на printCatalogue.

4.1. printCatalogue() - извежда номерирано всички животни за които програмата знае

 1. Birds:

 	1.1. Pigeon

 	1.2. Parrot

 	1.3. Seagull
Mammal:

2.1. Dog

2.2. Cat

4.2. printCatalogue(AnimalType type) -
 извежда номериран каталог само за дадения тип (Mammal or Bird)

Сега потребителят трябва да си избере животно въвеждайки неговия номер.
 В зависимост от типа животно то може да пее, лае или прави мяу.




*/