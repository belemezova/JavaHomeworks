package OOP_Homework3.shape;

public class Square extends Shape {

 private double edge;
  public Square(double edge) {
    setEdge(edge);

  }

  public double getEdge() {
    return edge;
  }

  public void setEdge(double edge) {
  if(edge<0){
    System.out.println("Invalid value");
  } else this.edge=edge;
  }

  @Override
  public String toString() {
    return "Square{" +
        "edge=" + edge +
        '}';
  }

  @Override
  double getArea() {
    return getEdge()*getEdge();
  }

  @Override
  double getPerimeter() {
    return 4*getEdge();
  }
}

