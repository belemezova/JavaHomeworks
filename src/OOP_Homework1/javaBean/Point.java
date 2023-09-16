package OOP_Homework1.javaBean;

import java.io.Serializable;

public class Point implements Serializable {

  private double xAxis;
  private double yAxis;

  public Point() {
  }

  public double getXAxis() {
    return xAxis;
  }

  public double getYAxis() {
    return yAxis;
  }


  public void setXAxis(double xAxis) {
    this.xAxis = xAxis;
  }

  public void setYAxis(double yAxis) {
    this.yAxis = yAxis;
  }



  @Override
  public String toString() {
    return "Point{" +
        "xAxis=" + xAxis +
        ", yAxis=" + yAxis +
        '}';
  }
}
/*6. Points and Shapes
Дефинирайте клас Point който е Java Bean.
Класът Point символизира точка в равнината с координати x, у.*/