package OOP_Homework3.animalLeg;

public class TestAnimal {

  public static void main(String[] args) {
    Fish fish1=new Fish();
    fish1.setName();
    Cat cat1=new Cat("Fluffy");
    Animal fish2=new Fish();
    Animal spider1=new Spider();
    Pet cat2=new Cat("Ru");


  }
}
/*Създайте програма TestAnimals която създава следните обекти:

6.1. Fish

6.2. Cat на име Fluffy

6.3. Animal който е инстанция на Fish

6.4. Animal който е инстанция на Spider

6.5. Pet който е инстанция на Cat

Изведете в конзолата следния изход:

6.6 Fish with name: <name> и резултатите от извикаването на методите walk(), eat(), play()

6.7 Cat with name: <name> и резултатите от извикаването на методите walk(), eat(), play()

6.8 [За подточка 6.3 ]The Animal is <Animal concrete implementation> and its name is: <name>,
и резултатите от извикаването на методите walk(), eat()

6.9 [За подточка 6.4 ]The Animal is <Animal concrete implementation>, резултатите от извикаването на walk() и eat().

7.0 [За подточка 6.5 ]The Pet is <Pet concrete implementation> and its name is: <name>,
 и резултатите от извикаването на методите walk(), eat(), play()

7.Направете методът play() да има default имплементация в Pet interface-a
т. че play() да извежда в конзолата “I am playing on my own”.
Изведете в конзолата резултата от извикването на play() за котката Fluffy.
Сега нека Cat имплементира play т че да извежда “I like playing with wool balls*/