package OOP_Homework2.shape;

import java.text.DecimalFormat;

public class Rectangle extends Shape {
  public DecimalFormat df=new DecimalFormat("0.00");
private double width;
private double height;

  public double getWidth() {
    return width;
  }

  public double getHeight(){
  return height;
}

  public void setWidth(double width) {
    if(width>0){this.width = width;}else{
      System.out.println("Invalid value");
    }
  }

  public void setHeight(double height){
    if(height>0){this.height = height;}else{
      System.out.println("Invalid value");
    }
}

public Rectangle(double width, double height){
    super();
    setHeight(height);
    setWidth(width);
}

  @Override
  public String toString() {
    return "Rectangle{" +
        "width=" + df.format(width) +
        ", height=" + df.format(height) +
        '}';
  }

  public double getMaxPossibleSquareInside(){
    double maxSquareSide;
    if(width>height){
      maxSquareSide=height;
    }else{
      maxSquareSide=width;
    }
    return maxSquareSide;
  }

  public  void printMaxSquareSide(){
    System.out.println("The side of the square inside the rectangle with maximum value is: "
        +df.format(getMaxPossibleSquareInside()));
  }
  @Override
  public  double getArea(){
    return  width*height;
  }

  @Override
  public  double getPerimeter(){
    return 2*(this.height+this.width);
  }
}
