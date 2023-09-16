package OOP_Homework2.shape;

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
        "width=" + super.df.format(getWidth()) +
        ", height=" + super.df.format(getHeight()) +
        '}';
  }
}
