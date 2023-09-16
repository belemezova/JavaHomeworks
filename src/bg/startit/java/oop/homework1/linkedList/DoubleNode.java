package bg.startit.java.oop.homework1.linkedList;

public class DoubleNode extends Node {

  public Node prev;

  public void setPrev( DoubleNode node2, DoubleNode node1) {
    node2.prev = node1.next;
  }

  public DoubleNode(int data) {
    super(data);
  }

  public int calculateBackNodes(DoubleNode inTheMiddle) {
    int counter = 2;
    DoubleNode current = inTheMiddle;
    while (current.prev != this) {
      counter++;
      current = (DoubleNode) current.prev;
    }
    return counter;
  }
}

/*  public int calculateNodes(Node head) {
    int counter = 1;
  Node current = head;
    while (current.next != null) {
      counter++;
      current = current.next;
    }
    return counter;
  }*/


