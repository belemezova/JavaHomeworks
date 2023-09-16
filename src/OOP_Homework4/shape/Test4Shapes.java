package OOP_Homework4.shape;

import java.text.DecimalFormat;

public class Test4Shapes {

  static DecimalFormat df = new DecimalFormat("0.00");


  public static void main(String[] args) {

    GeometricObject circle = new Circle(5.3);
    GeometricObject rectangle = new Rectangle(5.6, 8.4);

    System.out.println("Circle area is: ");
    circle.getArea();
    System.out.println("Circle perimeter is: ");
    circle.getPerimeter();

    System.out.println();
    System.out.println("Rectangle area is: ");
    rectangle.getArea();
    System.out.println("Rectangle perimeter is: ");
    rectangle.getPerimeter();
    System.out.println();


    ResizableCircle circleResize = new ResizableCircle();
     circleResize.resize(22);

    System.out.println();
    System.out.println("Circle area is: ");
    circleResize.getArea();
    System.out.println("Circle perimeter is: ");
    circleResize.getPerimeter();
    System.out.println();


    MovableCircle circleM=new MovableCircle();
    circleM.setCenter(new MovablePoint(5.5, 6.5));
    circleM.setRadius(4);
    circleM.getArea();
    circleM.getPerimeter();

    System.out.println();
    MovableCircle circleM1=new MovableCircle();
    circleM1.setCenter(new MovablePoint(3.3, -1.2));
    circleM1.setRadius(6);
    circleM1.getArea();
    circleM1.getPerimeter();

    System.out.println(circleM.isThereCircleIntersection(circleM1));

    System.out.println();


    MovableRectangle rec1=new MovableRectangle();

    rec1.setBottomRight(new MovablePoint(6,-4));
    rec1.setTopLeft(new MovablePoint(-2,6));
    System.out.println(rec1.recWidth());
    System.out.println(rec1.recHight());
    rec1.getArea();
    rec1.getPerimeter();

  }
}
/*Напишете interface GeometricObject с абстрактни методи - getArea()
- getPerimeter()
Напишете класове Circle - с атрибут radius - методи toString,
getArea(), getPerimeter()


Rectangle който го имплементират - с атрибути width, length -
методи toString, getArea(), getPerimeter()


Напишете програма която създава два обекта от тип GeometricObject.
Единия да е Circle, а другия Rectangle.
Вие си избирете стойности на които да инициализирате атрибутите им.

Изведете в конзолата areа и perimeter на двата обекта. -

Сега добавете и интерфейс Resizable който има абстрактен метод
 resize(int percent). -
 Добавете клас ResizableCircle който наследява Circle и имплементира Resizable.
 Нека имплементацията на метода resize да увеличава радиуса с percent.
 Демонтстрирайте работата на тази функционалност  в main метода.

Задача 3 Създайте интерфейс Movable който има следните методи: - moveUp() -
moveDown() - moveLeft() - moveRight() Нека клас MovablePoint имплементира интерфейса Movable,
има toString() метод , както и следните атрибути: - x, y, xSpeed, ySpeed и имплементира методите на
Movable както следва - moveUp() -> y-=ySpeed - moveDown() -> y+=ySpeed - moveLeft() -> x-=xSpeed - moveRight() -> x+=xSpeed
Създайте и клас Circle който също имплементира Movable и има следните атрибути - radius - MovablePoint center
Добавете клас MovableRectangle който има атрибути topLeft и bottomRight които са от тип MovablePoint

*/