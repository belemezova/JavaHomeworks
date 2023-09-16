package OOP_Homework2.shape;

import java.text.DecimalFormat;

public class Circle extends Shape {
  public DecimalFormat df=new DecimalFormat("0.00");
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
  public double getArea() {
    return PI * Math.pow(getRadius(), 2);
  }


  @Override
  public double getPerimeter() {
    return 2 * PI * radius;
  }


}
