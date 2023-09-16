package OOP_Homework1.shapes;

public class Cylinder extends Circle {

  private double height;

  public Cylinder(double radius, String color, double height) {
    super(radius, color);
    setHeight(height);
  }
  public Cylinder(double radius,double height){
    super(radius, "white");
    setHeight(height);
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    if (height < 0) {
      System.out.println("This is not valid value for height. "
          + "Please set new value or will be used the default value =0.0 ");
      this.height = 0.0;
    } else {
      this.height = height;
    }
  }

  @Override
  public String toString() {
    return "Cylinder{" +
        "radius=" + radius +
        ", color='" + color + '\'' +
        ", height=" + height +
        '}';
  }

  public double volumeCalculate() {
    return super.getArea() * getHeight();
  }


  public double getSurfaceArea() {

    return super.getPerimeter() * getHeight();
  }

  public double getFullSurfaceArea() {

    return 2 * super.getArea() + getSurfaceArea();
  }

}
