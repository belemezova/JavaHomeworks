package OOP_Homework2.shape;

import java.text.DecimalFormat;

public class Triangle extends Shape {
  public DecimalFormat df=new DecimalFormat("0.00");
  private double sideA;
  private double sideB;
  private double sideC;

  public double getSideA() {
    return sideA;
  }

  public void setSideA(double sideA) {
    if (0 < sideA ) {
      this.sideA = sideA;
    } else {
      System.out.println("Invalid value");
    }
  }

  public double getSideB() {
    return sideB;
  }

  public void setSideB(double sideB) {
    if (0 < sideB ) {
      this.sideB = sideB;
    } else {
      System.out.println("Invalid value");
    }
  }

  public double getSideC() {
    return sideC;
  }

  public void setSideC(double sideC) {
    if (0 < sideC && Math.abs((sideB - sideA)) < sideC && sideC < (sideB + sideA)) {
      this.sideC = sideC;
    } else {
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
    double perimeter = sideA + sideB + sideC;
    return perimeter;
  }

  @Override
  public double getArea() {
    double halfPerimeter = this.getPerimeter() / 2;
    double area = Math.sqrt(
        halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter
            - sideC));
    return area;
  }

  public double findAlpha() {
    double sinAlpha = 2 * getArea() / (sideA * sideB);
    return Math.toDegrees(Math.asin(sinAlpha));
  }


  public double findBeta() {
    double sinBeta = 2 * getArea() / (sideB * sideC);
    return Math.toDegrees(Math.asin(sinBeta));
  }

  public double findGama() {
    double sinGama = 2 * getArea() / (sideA * sideC);
    return Math.toDegrees(Math.asin(sinGama));
  }

  public double radiusOfInscribedCircle() {
    double r = 2 * getArea() / getPerimeter();
    return r;
  }

  public double radiusOfCircumscribedCircle() {
    double R = (sideA * sideB * sideC) / (4 * getArea());
    return R;
  }
  public boolean isRight(){
    if(findAlpha()==90||findBeta()==90||findGama()==90){
     return true;
    } else{
  return false;}
  }
  public boolean isObtuse(){
    if(findAlpha()>90||findBeta()>90||findGama()>90){
      return true;
    } else{
      return false;}
  }

  public boolean isAcute(){
    if(findAlpha()<90&&findBeta()<90&&findGama()<90){
      return true;
    } else{
      return false;}
  }
  public String typeTriangle(){
    String type;
    if (isRight()){
      type="Right";
    }else if(isObtuse()){
      type="Obtuse";
    }else  {type="Acute";}
    return type;

  }



  @Override
  public String toString() {
    return "Triangle{ type= "+typeTriangle()+
        ", sideA=" + df.format(sideA) +
        ", sideB=" + df.format(sideB) +
        ", sideC=" + df.format(sideC) +
        ", alpha=" + df.format(findAlpha()) +
        ", beta=" +  df.format(findBeta() )+
        ", gama=" +  df.format(findGama() )+
        '}';
  }

}
