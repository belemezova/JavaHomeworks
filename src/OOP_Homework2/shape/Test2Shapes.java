package OOP_Homework2.shape;

import java.text.DecimalFormat;

public class Test2Shapes {
  static DecimalFormat decimalFormat=new DecimalFormat("0.00");
  public static void main(String[] args) {
    Shape rectangle1 = new Rectangle(3, 5);
    Shape rectangle2 = new Rectangle(7, 9);

    Shape square1 = new Square(5);
    Shape square2 = new Square(8);

    Shape triangle1 = new Triangle(8, 7, 9);
    Shape triangle2 = new Triangle(3, 4, 5);

    Shape circle1 = new Circle(((Triangle) triangle1).radiusOfCircumscribedCircle());
    Shape circle2 = new Circle(((Triangle) triangle1).radiusOfInscribedCircle());
    Shape circle3 = new Circle(4.5);

    Shape[] shapes = new Shape[]{rectangle1, rectangle2, square1, square2, triangle1, triangle2,
        circle1, circle2, circle3};
    for (Shape shape : shapes) {


     /* System.out.println(shape.toString());
      System.out.println(
          "The area is: " + shape.getArea() + "\n" + "The perimeter is: " + shape.getPerimeter()
              + "\n");*/

      if  (shape instanceof Square) {
        System.out.println("This is a square");
        System.out.println();
      }

        else if(shape instanceof Rectangle) {
        System.out.println("This is a rectangle with height= " +
            ((Rectangle) shape).getHeight() +
            " and with width= " + ((Rectangle) shape).getWidth());
        ((Rectangle)shape).printMaxSquareSide();
        System.out.println();
      }

        else if (shape instanceof Circle) {
        System.out.println(((Circle) shape).toString());
        System.out.println(((Circle) shape).printCircleDimentions());
        System.out.println();
      }

        else {
        System.out.println(((Triangle) shape).toString());
        System.out.println();
      }

    }


    Square square3 = (Square) shapes[2];
    Square square4 = (Square) shapes[3];
    System.out.println("\"" + square3.getWidth() + "\"" + "+" + "\"" + square3.getHeight() + "\"");
    System.out.println("\"" + square4.getWidth() + "\"" + "+" + "\"" + square4.getHeight() + "\"");


  }
}
/*В ShapesTest class създайтe обекти от тип Shape които да са инстанции на Circle, Rectangle, Square, Triangle съответно.

Използвайте instanceof оператора за да направите следните проверки:
 Ако обектът е кръг тогава принтирайте “Кръг с радиус: Х”
 Ако обектът е правоъгълник тогава принтирайте “Правоъгълник с височина Х и широчина У”
 Ако обектът е квадрат тогава принтирайте “Квадрат”
 Ако обектът е триъгълник тогава принтирайте “Правоъгълен/Тъпоъгълен/Остроъгълен
 Триъгълник със страни a,b,c, и ъгли alpha, beta, gama.” (*Ако е правоъгълен не извеждайте и остроъгълен.)

Сега в Circle добавете и метод getDiameter() който изчислява диаметъра на кръга.
 В ShapesTest класа към изхода в случай на кръг добавете и диаметъра. т.е.
  Когато дадения обект е кръг тогава да се извежда “Кръг с радиус: Х и диаметър D”

В класът Rectangle добавете метод getMaxPossibleSquareInside()
който ще връщат страната на най-големия възможен (т.е. с най-голяма страна) квадрат който се събира в правъгълника.
Сега в ShapesTest в случая когато обектът е правоъгълник добавете в изхода и страната на най-големия възможен квадрат
 който се събира в правоъгълника. т.е. примерен изход: “Правоъгълник с височина Х и широчина У” .
 Страната на най-големия квадрат който се събира в правоъгълника е: "*/