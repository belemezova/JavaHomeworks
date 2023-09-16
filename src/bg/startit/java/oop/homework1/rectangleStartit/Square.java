package bg.startit.java.oop.homework1.rectangleStartit;


public class Square extends Shape {

  protected double edge;

  public Square(double edge) {
    this.edge = edge;

  }

  public double getEdge() {
    return edge;
  }

  public void setEdge(double edge) {
    this.edge = edge;
  }

  @Override
  public double getArea() {
    return edge*edge;
  }

  @Override
  public double getPerimeter() {
    return edge*4;
  }

  @Override
  public String toString() {
    return "Square{" +
        "edge=" + getEdge() +
        '}';
  }
}
