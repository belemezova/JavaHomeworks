package OOP_Homework4.shape;

import java.text.DecimalFormat;

public class MovableRectangle implements Movable {
  public DecimalFormat df=new DecimalFormat("0.00");
  private MovablePoint topLeft;
  private MovablePoint bottomRight;

  public MovablePoint getTopLeft() {
    return topLeft;
  }

  public void setTopLeft(MovablePoint topLeft) {

      this.topLeft = topLeft;
  }

  public MovablePoint getBottomRight() {
    return bottomRight;
  }

  public void setBottomRight(MovablePoint bottomRight) {

      this.bottomRight = bottomRight;
      }

  public MovableRectangle() {


  }

  @Override
  public void moveUp() {
    this.bottomRight.moveUp();
    this.topLeft.moveUp();
  }

  @Override
  public void moveDown() {
    this.bottomRight.moveDown();
    this.topLeft.moveDown();
  }

  @Override
  public void moveLeft() {
    this.bottomRight.moveLeft();
    this.topLeft.moveLeft();
  }

  @Override
  public void moveRight() {
    this.bottomRight.moveRight();
    this.topLeft.moveRight();
  }

  public double recWidth() {
    double width=0;
    if ((bottomRight.getX() > topLeft.getX()) && (topLeft.getY() > bottomRight.getY())) {
    width=Math.abs(this.bottomRight.getX() - this.topLeft.getX());}
    return width;
  }

  public double recHight() {

    double height = 0;
    if ((bottomRight.getX() > topLeft.getX()) && (topLeft.getY() > bottomRight.getY()))
    {height=Math.abs(this.topLeft.getY() - this.bottomRight.getY());}
    return height;
  }
  public  void getPerimeter(){
    System.out.println( df.format(2*(this.recHight()+this.recWidth())));
  }

  public  void getArea(){
    System.out.println(df.format( this.recWidth()*this.recHight()));
  }
}
/*Добавете клас MovableRectangle който има атрибути
topLeft и bottomRight които са от тип MovablePoint*/