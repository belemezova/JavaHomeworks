package OOP_Homework1.rectangleStartit;

public class Circle extends Shape{

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


  @Override
  public String toString() {
    return "Circle{" +
        "radius=" + radius +
        '}';
  }
  @Override
  public double getArea() {
    return PI *  Math.pow(getRadius(),2);
  }


  @Override
  public double getPerimeter(){
    return 2*PI*radius;
  }


}
