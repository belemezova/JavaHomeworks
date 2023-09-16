package OOP_Homework4.shape;

import java.text.DecimalFormat;

public class MovableCircle implements Movable {

  public DecimalFormat df = new DecimalFormat("0.00");

  protected MovablePoint center;

  public MovablePoint getCenter() {
    return center;
  }

  public void setCenter(MovablePoint center) {
    this.center = center;
  }

  protected double radius;

  public MovableCircle(MovablePoint center) {
    this.center = center;
  }

  public MovableCircle() {
  }

  public MovableCircle(double radius) {
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
  public void moveUp() {
    this.center.moveUp();
  }

  @Override
  public void moveDown() {
    this.center.moveDown();
  }

  @Override
  public void moveLeft() {
    this.center.moveLeft();
  }

  @Override
  public void moveRight() {
    this.center.moveRight();
  }

  public void getArea() {
    System.out.println(df.format(Math.PI * Math.pow(getRadius(), 2)));
  }



  public void getPerimeter() {
    System.out.println(df.format(2 * Math.PI * getRadius()));
  }



  public boolean isThereCircleIntersection (MovableCircle circle2){
    boolean intersection=false;
    double deltaX=Math.abs(circle2.getCenter().getX() - this.center.getX());
    double deltaY=Math.abs(circle2.getCenter().getY() - this.center.getY());
    double distance=Math.abs(Math.pow(deltaX, 2)+Math.pow(deltaY, 2));
    if (distance<(this.radius+circle2.getRadius())){
      intersection=true;
    }
    return intersection;
  }
}
