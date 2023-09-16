package OOP_Homework1.randomGenerator;

public class Main {

  public static void main(String[] args) {
    RandomGen rand = new RandomGen(3.2,7.8);
    double m = rand.generateNextDouble(2.3, 7.8);
    System.out.println(m);
  }
}
/*Дефинирайте наследник на клас наследник Random,
 който да има метод връщащ случайни числа от тип double в интервал double [а,b].
(Разгледайте какви методи вече са дефинирани и вижте кой е най-лесно да бъде модифициран,
 така, че да ви свърши работа;*/