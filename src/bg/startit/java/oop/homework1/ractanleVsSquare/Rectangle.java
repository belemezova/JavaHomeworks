package bg.startit.java.oop.homework1.ractanleVsSquare;




public class Rectangle implements  Comparable<Rectangle>{
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

  public  double getArea(){
    return  getWidth()*getHeight();
  }


  public  double getPerimeter(){
    return 2*(getWidth()+getHeight());
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {return true;}

    if (obj == null) {return false;}
    if(this.hashCode()!=obj.hashCode()){return false;}

    if (this.getClass() != obj.getClass()){ return false;}
    if(this.height!=((Rectangle) obj).height){ return false;}
    if(this.width!=((Rectangle) obj).width){ return false;}

    return true;
  }

  @Override
  public int compareTo( Rectangle obj) {
    if(this.height> obj.height){ return 1;}
    else if(this.height< obj.height){ return -1;} else {
    return 0;}
  }
//return Double(this.height, obj.height);


}
