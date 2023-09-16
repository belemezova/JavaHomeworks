package OOP_Homework3.shape;

import java.text.DecimalFormat;

public class Test3Shapes {
  static DecimalFormat df=new DecimalFormat("0.00");
  public static void main(String[] args) {
   Circle circle=new Circle(5.5);
   Square square=new Square(6.6);
    System.out.println("Circle area is: ");
  circle.getArea();
    System.out.println("Circle perimeter is: ");
        circle.getPerimeter();
    System.out.println("Square area is: ");
    square.getArea();
    System.out.println("Square perimeter is: ");
    square.getPerimeter();


  }
}
/*Създайте ShapeTest клас който инициализира един Circlе
 и един Square и извежда в конзолата техните лица и периметър.*/