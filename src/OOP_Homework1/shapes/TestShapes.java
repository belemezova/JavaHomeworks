package OOP_Homework1.shapes;

public class TestShapes {

  public static void main(String[] args) {
    Circle circle=new Circle(5, "red");
    System.out.println(circle);
    Cylinder cylinder=new Cylinder(5, "red", 4);
    System.out.println(cylinder);
    System.out.printf("%.2f%n",circle.getArea());
    System.out.print("This is the area of the base of the cylinder: ");
    System.out.printf("%.2f%n",cylinder.getArea());
    System.out.print("This is the surface area of the cylinder: ");
    System.out.printf("%.2f%n",cylinder.getSurfaceArea());
    System.out.print("This is the full surface area of the cylinder: ");
    System.out.printf("%.2f%n",cylinder.getFullSurfaceArea());

  }
}
/*Направете програма TestShapes, която има main метод и създава нов Circle обект и го отпечатва на екрана.
След това създава нов Cylinder обект (със същия радиус и цвят) и го отпечатва на екрана.

Дали не трябва да презапишем toString() метода на Cylinder ?

Накрая нека отпечатаме колко е площта на цилиндъра - да добавим и getArea()
в Cylinder и да видим какво ще отпечата сега*/

