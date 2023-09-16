package OOP_Homework1.rectangleStartit;

public class Rectangle extends Shape {
private double width;
private double height;

  public double getWidth() {
    return width;
  }

  public double getHeight(){
  return height;
}

  public void setWidth(double width) {
    this.width = width;
  }

  public void setHeight(double height){
    this.height=height;
}

public Rectangle(double width, double height){
    super();
    this.height=height;
    this.width=width;
}

  @Override
  public String toString() {
    return "Rectangle{" +
        "width=" + width +
        ", height=" + height +
        '}';
  }
  @Override
  public  double getArea(){
    return  getWidth()*getHeight();
  }

  @Override
  public  double getPerimeter(){
    return 2*(getWidth()+getHeight());
  }
}
