import bg.startit.java.oop.homework1.ractanleVsSquare.Rectangle;
import bg.startit.java.oop.homework1.ractanleVsSquare.Square;

public class Test2Shapes {

  public static void main(String[] args) {
    Rectangle rec1 = new Rectangle(4.0, 3.0);
    Rectangle rec2 = new Rectangle(6, 9);

    Rectangle sq1 = new Square(5.5);
    Rectangle sq2 = new Square(12);
    Rectangle[] rectangles= {rec1, rec2, sq2, sq1};
    for (Rectangle rectangle:rectangles) {
      rectangle.setHeight(8);
      rectangle.setWidth(7);
      System.out.println(rectangle);
    }

  }
}


