package OOP_Homework2.animals;

import java.lang.annotation.Inherited;
import java.security.cert.Extension;

public class Main {

  public static void main(String[] args) {

    Bird bird=new Bird();
    bird.walk();
    bird.fly();
    bird.sing();
    System.out.println();
    Petshop catalog=new Petshop();
    catalog.printCatalogue();
    System.out.println();
    catalog.printCatalogue(("Bird"));

  }
}
/*

reflections.getSubTypesOf(aClazz))
1.В задачата Animals от миналия път добавете класове Parrot, Pigeon, Seagull които наследяват Bird.
2. Променете както следва имплементацията на методa sing() във всеки един от наследните на Bird.

Parrot -> I am singing "How are you"

Pigeon -> I am singing "Gu Gu Gu"

Seagull -> I am singing "Kra Kra Kra"

3. Добавете и клас Mammal които има два child класа Cat и Dog.
Cat има метод meow(), а Dog - bark()

Изведете в конзолота резултата от извикването на sing(), bark() или meow() методите за избраното животно.*/