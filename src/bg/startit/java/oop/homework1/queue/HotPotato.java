
package bg.startit.java.oop.homework1.queue;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;


public class HotPotato {

  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    String[] input=scanner.nextLine().split(" ");
    Integer toss=Integer.parseInt(scanner.nextLine());
    ArrayDeque<String> children=new ArrayDeque<>();
    Collections.addAll(children,input);
    while(children.size()>1){
      for (int i = 1; i <toss ; i++) {
        String child=children.remove();
        children.add(child);


      }
      System.out.println("Removed "+children.pop());
    }
    System.out.println("Last is "+children.pop());
  }
}
/*Hot potato is a game in which children form a circle and start passing a hot potato.
The counting starts with the first kid.
Every nth toss the child left with the potato leaves the game.
 When a kid leaves the game, it passes the potato forward.
 This continues repeating until there is only one kid left.
Create a program that simulates the game of Hot Potato.
Print every kid that is removed from the circle.
In the end, print the kid that is left last.

input:
Sam John Sara
2
  Output:
  Removed John
Removed Sam
Last is Sara

*/