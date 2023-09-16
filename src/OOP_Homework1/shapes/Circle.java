package OOP_Homework1.shapes;

public class Circle {

  protected final static double PI = Math.PI;
  public final static  String DIM="sm";
  protected double radius;
  protected String color;


  public Circle() {
  }

  public Circle(double radius, String color) {
    this(radius);
    setColor(color);
  }

  public Circle(double radius) {
    setRadius(radius);
  }


  public double getRadius() {
    return radius;
  }

  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    if(color.trim().equals("")){
      this.color="white";
    }else{
    this.color = color;}
  }

  public void setRadius(double radius) {
    if (radius < 0) {
      System.out.println(
          "This is not valid value for radius. "
              + "Please set new value or will be used the default value =0.0 ");
      this.radius = 0.0;
    } else {
      this.radius = radius;
    }
  }


  @Override
  public String toString() {
    return "Circle{" +
        "radius=" + radius +DIM+
        ", color='" + color + DIM+'\'' +
        '}';
  }

  public double getArea() {
    return PI *  Math.pow(getRadius(),2);
  }

  public double getPerimeter(){
    return 2*PI*radius;
  }


}
/*Дефинирайте пакет shapes и създайте клас Circle с атрибути radius & color,
катод обавете и съответните get/set методи и възможните конструктори.
Добавете метод double getArea и презапишете и метода toString - не забравяйте да сложите анотацията

Сега дефинирайте клас Cylinder, който наследява Circle и притежава собствен атрибут double height.
обавете нужните конструктори и методи.

Направете програма TestShapes, която има main метод и създава нов Circle обект и го отпечатва на екрана.
След това създава нов Cylinder обект (със същия радиус и цвят) и го отпечатва на екрана.

Дали не трябва да презапишем toString() метода на Cylinder ?

Накрая нека отпечатаме колко е площта на цилиндъра - да добавим и getArea() в Cylinder и да видим какво ще отпечата сега.*/