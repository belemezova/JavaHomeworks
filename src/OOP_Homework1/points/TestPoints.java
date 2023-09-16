package OOP_Homework1.points;

import OOP_Homework1.shapes.Circle;
import OOP_Homework1.shapes.Cylinder;
import java.text.DecimalFormat;


public class TestPoints {
  private static final DecimalFormat df = new DecimalFormat("0.00");
  public static void main(String[] args) {
    Point2D leftPoint=new Point2D(3,5);
    Point2D rightPoint=new Point2D(6,10);
    Point2D midPoint=leftPoint.getMidPoint2D(rightPoint);
    System.out.println("The middle point is: "+midPoint);
    Point2D minePoint=new Point2D(5,11);
    System.out.println("Is main point between left and right point: "+ minePoint.isOnTheLine(leftPoint, rightPoint));
    double radius=midPoint.getDistance2D(leftPoint);
    System.out.println("Radius= "+ radius+ Point2D.DIM);
    Circle circle=new Circle(radius);
    System.out.println("Area of the circle is: "+df.format(circle.getArea()));
    System.out.println("Perimeter of the circle is: "+df.format(circle.getPerimeter()));
    Point3D baseEdge=new Point3D(3,5,0);
    Point3D topEdge=new Point3D(6,10,10);
    System.out.println("deltaX: "+baseEdge.deltaX(topEdge.getX()));
    System.out.println("deltaY: "+baseEdge.deltaY(topEdge.getY()));
    System.out.println("deltaZ: "+baseEdge.deltaZ(topEdge.getZ()));
    Point2D midPointNew=baseEdge.getMidPoint2D(topEdge);
    double radius1=midPoint.getDistance2D(leftPoint);
    Cylinder cylinder=new Cylinder(radius1, baseEdge.deltaZ(topEdge.getZ()));
    System.out.println("Cylinder with: "+ cylinder);
    System.out.print("This is the area of the base of the cylinder: ");
    System.out.printf("%.2f%n",cylinder.getArea());
    System.out.print("This is the surface area of the cylinder: ");
    System.out.printf("%.2f%n",cylinder.getSurfaceArea());
    System.out.print("This is the full surface area of the cylinder: ");
    System.out.printf("%.2f%n",cylinder.getFullSurfaceArea());
    Point3D mine3DPoint=new Point3D(5,9, 6);
    System.out.println("Is main 3D point between left and right point: "+ mine3DPoint.isOnTheLine3D(baseEdge, topEdge));



  }
}
