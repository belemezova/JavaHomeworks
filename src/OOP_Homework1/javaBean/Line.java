package OOP_Homework1.javaBean;

import java.io.Serializable;

public class Line implements Serializable {

  private Point point1;
  private Point point2;


  public Line() {
  }


  public Point getPoint1() {
    return point1;
  }
  public Point getPoint2() {
    return point2;
  }


  public void setPoint1(Point point1) {
    this.point1 = point1;
  }
  public void setPoint2(Point point2) {
    this.point2 = point2;
  }

  public double deltaX() {
    return point2.getXAxis() - point1.getXAxis();
  }



  public double deltaY() {
    return point2.getYAxis()-point1.getYAxis();
  }

  public double slope(){
    if((deltaY()/deltaX()==0.0)||(deltaY()/deltaX()==-0.0)){
      return 0.0;}
    else{
    return deltaY()/deltaX();}
  }



  public double getLength () {
    double distance = Math.abs(Math.pow(this.deltaX(), 2) + Math.pow(this.deltaY(), 2));

    return distance;
  }
  public double setA (){
    // A=y1-y2;
    return point1.getYAxis()-point2.getYAxis();
  }
  public double setB (){
    // B=x2-x1;
    return point2.getXAxis()-point1.getXAxis();
  }
public double setC(){
  // C=x1.y2-y1*x2;
    return point1.getXAxis()*point2.getYAxis()-point1.getYAxis()*point2.getXAxis();
}


  public void print (){
    //g: Ax +By + C = 0.

    System.out.println("The line passing through these is: g: "+this.setA()+"*x+"+this.setB()+"*y+"+"("+this.setC()+")"+"=0");
  }

}
/*Създайте клас Line който е Java Bean и симоволизира права в равнината.
(Както е известно то математика всяка една права се определя от две точки.
Използвайте този факт във вашата програма).
Използвайте уравнението на права в равнината g: Ax +By + C = 0.
Напишете програма която: * Чете от конзолата 2 точки които определят правата line1. *
Чете от конзолата 2 точки които определят правата line2.
Помислите как да валидирате входните данни където има нужда т.
че правата да има за дължина някаква положително число. *
Показва взаимното положение на двете прави - пресичащи се,
перпендикуларни, успоредни, съвпадащи.

(Потърсете формулите за взаимно положение на две прави.) */