package OOP_Homework1.codeChallenge;

public class AbstractEvilChange {

  static int nemesisRaids = 0;

  public static void main(String[] args) {

    Zombie zombie = () -> System.out.println("Graw!!!  " + nemesisRaids++);
    // lambda expression has not yet executed, so the nemesisRaids field won't
    // be incremented just yet.
//At this point, we will print the nemesisRadius field which is not
// incremented because the lambda expression hasn't yet been invoked, only declared.
    //The next line of code invokes the lambda expression we created at the start.
    // Therefore, the nemesisRaids variable will be incremented.
    // However, because we are using the post-increment operator,
    // it will be incremented only after this code statement.


    System.out.println("Nemesis radius: " + nemesisRaids);

    Nemesis nemesis = new Nemesis() { public void shoot() { shoots = 23; }};


    // anonymous inner class
    // -any class that will implement the methods from the abstract class;

    Zombie.zombie.shoot();
    zombie.shoot();
    nemesis.shoot();
    System.out.println("Nemesis shoots: " + nemesis.shoots + " and raids: " + nemesisRaids);
    zombie = () -> System.out.println("Graw!!!  " + ++nemesis.shoots);
    zombie.shoot();
    nemesis.shoot();
    System.out.println("Nemesis shoots: " + nemesis.shoots + " and raids: " + nemesisRaids);
  }
}
