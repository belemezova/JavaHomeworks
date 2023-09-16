package bg.startit.java.oop.homework1.rectangleStartit;

public class Main {

  public static void main(String[] args) {
    Shape rectangle1 = new Rectangle(3, 5);
    Shape rectangle2 = new Rectangle(7, 9);

    Shape square1 = new Square(5);
    Shape square2 = new Square(8);
    Shape[] shapes = new Shape[]{rectangle1, rectangle2, square1, square2};
    for (Shape shape : shapes) {
      //System.out.println(
      //    "The area is: " + shape.getArea() + "\n" + "The perimeter is: " + shape.getPerimeter()
      //        + "\n");
      System.out.println(shape.toString());

    }
    Square square3 = (Square) shapes[2];
    Square square4 = (Square) shapes[3];
    System.out.println("\""+square3.getEdge()+"\""+"+"+ "\""+square4.getEdge()+"\"");


    //Square rec1= new Rectangle(5,5);
    // rec1.setHeight(3);
    //rec1.setWidth(4);

    //System.out.println(rec1.getArea());
    //System.out.println(rec1.getWidth());
  }
}
