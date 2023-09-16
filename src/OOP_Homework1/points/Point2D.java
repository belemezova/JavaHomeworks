package OOP_Homework1.points;

public class Point2D {

  public final static String DIM = "sm";
  protected double x;
  protected double y;


  public Point2D(double x, double y) {
    this.x = x;
    this.y = y;
  }


  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }


  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  @Override
  public String toString() {
    return "Point2D{" +
        "x=" + getX() + DIM +
        ", y=" + getY() + DIM +
        '}';
  }

  public double deltaX(double x2) {
    return Math.abs(x2 - this.x);
  }

  public double deltaY(double y2) {
    return Math.abs(y2 - this.y);
  }

  public Point2D() {
  }

  public Point2D getMidPoint2D(Point2D point2) {
    return new Point2D(deltaX(point2.x) / 2 + this.x, deltaY(point2.y) / 2 + this.y);
  }

  public double getDistance2D(Point2D point2) {
    double distance = Math.abs(Math.pow(deltaX(point2.x), 2) + Math.pow(deltaY(point2.y), 2));

    return distance;
  }

  public boolean isOnTheLine(Point2D point1, Point2D point2) {
    if ((point2.x-point1.x > this.x -point1.x ) && (
        point2.y-point1.y > this.y - point1.y)) {
      return true;
    } else {
      return false;
    }
  }

}
/*Сега дефинирайте напълно сами пакет points и в него следните класове Point2D и Point3D.
Point2D има атрибути x, y; Point3D наследява Point2D и добавя атрибут z.

Не забравяйте да презапишете toString() метода и да добавите програма,
която показва употребата на класа*/

/*
 * Izpolzvam klasa circle i cylinder*/

