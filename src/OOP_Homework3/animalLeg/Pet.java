package OOP_Homework3.animalLeg;

public interface Pet {
    String getName();


    String  setName();


   default void play(){
       System.out.println("I am playing on my own");
   }


}
/*Създайте интерфейс Pet който има следните методи: getName() setName() play()*/