package OOP_Homework1.rectangleStartit;

public class Triangle extends Shape{

  private double sideA;
  private double sideB;
  private double sideC;

  public double getSideA() {
    return sideA;
  }

  public void setSideA(double sideA) {
    if(0<sideA&&Math.abs((sideB-sideC))<sideA&&sideA<(sideB+sideC)){    this.sideA = sideA;}
    else {
      System.out.println("Invalid value");
    }
  }

  public double getSideB() {
    return sideB;
  }

  public void setSideB(double sideB) {
    if(0<sideB&&Math.abs((sideA-sideC))<sideB&&sideB<(sideA+sideC)){    this.sideB = sideB;}
    else {
      System.out.println("Invalid value");
    }
  }

  public double getSideC() {
    return sideC;
  }

  public void setSideC(double sideC) {
    if(0<sideC&&Math.abs((sideB-sideA))<sideC&&sideC<(sideB+sideA)){    this.sideC = sideC;}
    else {
      System.out.println("Invalid value");
    }
  }

  public Triangle(double sideA, double sideB, double sideC) {
    setSideA(sideA);
    setSideB(sideB);
    setSideC(sideC);
  }

  public Triangle() {
  }

  @Override
  public double getPerimeter() {
    double perimeter=sideA+sideB+sideC;
    return perimeter;
  }

  @Override
  public double getArea(){
    double halfPerimeter=this.getPerimeter()/2;
    double area=Math.sqrt(halfPerimeter*(halfPerimeter-sideA)*(halfPerimeter-sideB)*(halfPerimeter-sideC));
    return area;
  }

  @Override
  public String toString() {
    return "Triangle{" +
        "sideA=" + sideA +
        ", sideB=" + sideB +
        ", sideC=" + sideC +
        '}';
  }

}
