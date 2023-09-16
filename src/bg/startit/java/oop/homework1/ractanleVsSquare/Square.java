package bg.startit.java.oop.homework1.ractanleVsSquare;


public class Square extends Rectangle {


  public Square(double edge) {
    super(edge, edge);

  }

  @Override
  public void setHeight(double edge) {
    super.setHeight(edge);
    super.setWidth(edge);
  }

  public void setWidth(double edge) {
    super.setHeight(edge);
    super.setWidth(edge);
  }

  @Override
  public String toString() {
    return "Square{" +
        "width=" + super.getWidth() +
        ", height=" + super.getHeight() +
        '}';
  }
}
