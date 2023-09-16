package OOP_Homework4.shape;

import java.text.DecimalFormat;

public class Circle implements GeometricObject {

  public DecimalFormat df = new DecimalFormat("0.00");
  protected final static double PI = Math.PI;


  protected double radius;


  public Circle() {
  }

  public Circle(double radius) {
    setRadius(radius);
  }


  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    if (radius < 0) {
      System.out.println(
          "This is not valid value for radius. "
              + "Please set new value or will be used the default value =0.0 ");
      this.radius = 0.0;
    } else {
      this.radius = radius;
    }
  }

  public double getDiameter() {
    return 2 * radius;
  }

  public String printCircleDimentions() {
    return "Circle with radius= " + df.format(radius) +
        " and diameter=" + df.format(getDiameter()) +
        '}';
  }

  @Override
  public String toString() {
    return "Circle{" +
        "radius=" + df.format(radius) +
        '}';
  }

  @Override
  public void getArea() {
    System.out.println(df.format(PI * Math.pow(getRadius(), 2)));
  }


  @Override
  public void getPerimeter() {
    System.out.println(df.format(2 * PI * radius));
  }


}
