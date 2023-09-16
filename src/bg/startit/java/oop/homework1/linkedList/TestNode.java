package bg.startit.java.oop.homework1.linkedList;

public class TestNode {

  public static void main(String[] args) {
    Node nodeHead=new Node(5);
    Node nodeB=new Node(2);
    Node nodeC=new Node(11);
    Node nodeD=new Node(3);
    Node nodeE=new Node(9);
    Node nodeF=new Node(8);

    nodeHead.next=nodeB;
    nodeB.next=nodeC;
    nodeC.next=nodeD;
    nodeD.next=nodeE;
    nodeE.next=nodeF;

    System.out.println(nodeHead.calculateNodes());

    DoubleNode nodeA1=new DoubleNode(5);
    DoubleNode nodeB1=new DoubleNode(2);
    DoubleNode nodeC1=new DoubleNode(11);
    DoubleNode nodeD1=new DoubleNode(3);
    DoubleNode nodeE1=new DoubleNode(9);
    DoubleNode nodeF1=new DoubleNode(8);

    nodeA1.next=nodeB1;
    nodeB1.next=nodeC1;
    nodeC1.next=nodeD1;
    nodeD1.next=nodeE1;
    nodeE1.next=nodeF1;


    DoubleNode nodeBase=new DoubleNode(0);
    nodeBase.next=nodeA1;


    nodeB1.setPrev(nodeB1, nodeBase);
    nodeC1.setPrev(nodeC1, nodeA1);
    nodeD1.setPrev(nodeD1, nodeB1);
    nodeE1.setPrev(nodeE1, nodeC1);
    nodeF1.setPrev(nodeF1, nodeD1);

    System.out.println(nodeB1.calculateBackNodes(nodeD1));
  }
}
