package OOP_Homework1.rectangleStartit;



public class Test2Shapes {

  public static void main(String[] args) {
   Shape rectangle1 = new Rectangle(3, 5);
   Shape rectangle2 = new Rectangle(7, 9);

   Shape square1 = new Square(5);
   Rectangle square2 = new Square(8);
   Shape[] shapes = new Shape[]{rectangle1, rectangle2, square1, square2};
    for (Shape shape : shapes) {
      System.out.println(shape.toString());
      System.out.println(
          "The area is: " + shape.getArea() + "\n" + "The perimeter is: " + shape.getPerimeter()
              + "\n");

    }
    Square square3 = (Square) shapes[2];
    Square square4 = (Square) shapes[3];
    System.out.println("\""+square3.getWidth()+"\""+"+"+ "\""+square3.getHeight()+"\"");
    System.out.println("\""+square4.getWidth()+"\""+"+"+ "\""+square4.getHeight()+"\"");


    Rectangle rec1= new Square( 5.5);


    System.out.println(rec1.getArea());
    System.out.println(rec1.getWidth());
  }
}
