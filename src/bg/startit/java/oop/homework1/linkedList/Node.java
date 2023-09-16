package bg.startit.java.oop.homework1.linkedList;

public class Node {

  public int data;
  public Node next;

  public Node(int data) {
    this.data = data;
  }

  public int calculateNodes() {
    int counter = 1;
    Node current = this;
    while (current.next != null) {
      counter++;
      current = current.next;
    }
    return counter;
  }
}
