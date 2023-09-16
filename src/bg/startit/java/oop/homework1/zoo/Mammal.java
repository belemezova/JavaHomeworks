package bg.startit.java.oop.homework1.zoo;

public abstract class Mammal extends Animal{
abstract void walk();
}
/*В задачата Animals от миналия път добавете класове Parrot,
Pigeon, Seagull които наследяват Bird. 2.
Променете както следва имплементацията на методa sing() във всеки един от наследните на Bird.

Parrot -> I am singing "How are you"

Pigeon -> I am singing "Gu Gu Gu"

Seagull -> I am singing "Kra Kra Kra"

3. Добавете и клас Mammal които има два child класа Cat и Dog.
Cat има метод meow(), а Dog - bark()

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
В зависимост от типа животно то може да пее, лае или прави мяу. Изведете в конзолота
резултата от извикването на sing(), bark() или meow() методите за избраното животно.*/