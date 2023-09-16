package OOP_Homework1.javaBean;

public class TestLines {

  public static void main(String[] args) {
    Point first = new Point();
    first.setXAxis(-2.0);
    first.setYAxis(8.0);
    Point second = new Point();
    second.setXAxis(2.0);
    second.setYAxis(-2.0);
    Line line1=new Line();
    line1.setPoint1(first);
    line1.setPoint2(second);
    System.out.println(line1.deltaX());
    System.out.println(line1.deltaY());
    System.out.println(line1.slope());
    System.out.println(line1.getLength());
    line1.print();
    System.out.println();
    System.out.println();

    Point point1Line1=new Point();
    Point point2Line1=new Point();
    point1Line1.setXAxis(1.0);
    point1Line1.setYAxis(2.0);
    point2Line1.setXAxis(3.0);
    point2Line1.setYAxis(-2.0);
    Line firstLine=new Line();
    firstLine.setPoint1(point1Line1);
    firstLine.setPoint2(point2Line1);
    System.out.println("Delta y:"+firstLine.deltaY());
    System.out.println("Delta x:"+firstLine.deltaX());
    System.out.println("Slope:"+firstLine.slope());
    firstLine.print();
    System.out.println();
    System.out.println();



    Point point1Line2=new Point();
    Point point2Line2=new Point();
    point1Line2.setXAxis(1.0);
    point1Line2.setYAxis(2.0);
    point2Line2.setXAxis(2.0);
    point2Line2.setYAxis(5.0);
    Line secondLine=new Line();
    secondLine.setPoint1(point1Line2);
    secondLine.setPoint2(point2Line2);
    System.out.println("Delta y:"+secondLine.deltaY());
    System.out.println("Delta x:"+secondLine.deltaX());
    System.out.println("Slope:"+secondLine.slope());
    secondLine.print();
    System.out.println();


    giveLinesPossition (firstLine, secondLine);

    System.out.println();

    Point point1Line3=new Point();
    Point point2Line3=new Point();
    point1Line3.setXAxis(1.0);
    point1Line3.setYAxis(-3.0);
    point2Line3.setXAxis(2.0);
    point2Line3.setYAxis(-2.0);
    Line thirdtLine=new Line();
    thirdtLine.setPoint1(point1Line3);
    thirdtLine.setPoint2(point2Line3);
    System.out.println("Delta y:"+thirdtLine.deltaY());
    System.out.println("Delta x:"+thirdtLine.deltaX());
    System.out.println("Slope:"+thirdtLine.slope());
    thirdtLine.print();
    System.out.println();
    System.out.println();



    Point point1Line4=new Point();
    Point point2Line4=new Point();
    point1Line4.setXAxis(1.0);
    point1Line4.setYAxis(3.0);
    point2Line4.setXAxis(2.0);
    point2Line4.setYAxis(2.0);
    Line fourthLine=new Line();
    fourthLine.setPoint1(point1Line4);
    fourthLine.setPoint2(point2Line4);
    System.out.println("Delta y:"+fourthLine.deltaY());
    System.out.println("Delta x:"+fourthLine.deltaX());
    System.out.println("Slope:"+fourthLine.slope());
    fourthLine.print();

    System.out.println(fourthLine.slope()*thirdtLine.slope());
    giveLinesPossition (thirdtLine, fourthLine);


    System.out.println();

    Point point1Line5=new Point();
    Point point2Line5=new Point();
    point1Line5.setXAxis(2.0);
    point1Line5.setYAxis(-1.0);
    point2Line5.setXAxis(5.0);
    point2Line5.setYAxis(0.0);
    Line fifthLine=new Line();
    fifthLine.setPoint1(point1Line5);
    fifthLine.setPoint2(point2Line5);
    System.out.println("Delta y:"+fifthLine.deltaY());
    System.out.println("Delta x:"+fifthLine.deltaX());
    System.out.println("Slope:"+fifthLine.slope());
    fifthLine.print();
    System.out.println();
    System.out.println();



    Point point1Line6=new Point();
    Point point2Line6=new Point();
    point1Line6.setXAxis(1.0);
    point1Line6.setYAxis(2.0);
    point2Line6.setXAxis(4.0);
    point2Line6.setYAxis(3.0);
    Line sixthLine=new Line();
    sixthLine.setPoint1(point1Line6);
    sixthLine.setPoint2(point2Line6);
    System.out.println("Delta y:"+sixthLine.deltaY());
    System.out.println("Delta x:"+sixthLine.deltaX());
    System.out.println("Slope:"+sixthLine.slope());
    sixthLine.print();

    System.out.println(fifthLine.slope()*sixthLine.slope());
    giveLinesPossition (fifthLine, sixthLine);
  }

  public static void giveLinesPossition (
      Line line1, Line line2) {
    if ((line1.slope()!= line2.slope())&&((line1.slope()* line2.slope())!=-1)&&(line1.slope()!=0)&&(line2.slope()!=0)) {
      System.out.println("The lines have a point of intersection");
    }else if(line1.slope()* line2.slope()==-1){
      System.out.println("These lines are perpendicular.");
    } else if ((line1.slope()==line2.slope()&&(line1.setC()!=line2.setC()))||(line1.slope()==0)||(line2.slope()==0)){
      System.out.println("These lines are parallel.");
    } else if (line1.slope()==line2.slope()&&(line1.setC()==line2.setC())){
      System.out.println("These lines are equal.");
    }


  }


}
/*Напишете програма която: * Чете от конзолата 2 точки които определят правата line1. *
Чете от конзолата 2 точки които определят правата line2.
Помислите как да валидирате входните данни където има нужда т.
че правата да има за дължина някаква положително число. *
Показва взаимното положение на двете прави - пресичащи се,
перпендикуларни-прерпендикулярни- точно когато 1 + k1k2 = 0,
 успоредни, съвпадащи.*/