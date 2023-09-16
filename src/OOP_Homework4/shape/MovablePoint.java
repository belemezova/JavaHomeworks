package OOP_Homework4.shape;

public class MovablePoint implements Movable {

  private double x;
  private double y;
  private double xSpeed;
  private double ySpeed;

  public MovablePoint(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public MovablePoint() {
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double getXSpeed() {
    return xSpeed;
  }

  public void setXSpeed(double xSpeed) {
    this.xSpeed = xSpeed;
  }

  public double getYSpeed() {
    return ySpeed;
  }

  public void setYSpeed(double ySpeed) {
    this.ySpeed = ySpeed;
  }

  @Override
  public void moveUp() {
    setY(y -= ySpeed);
  }

  @Override
  public void moveDown() {
    setY(y += ySpeed);
  }

  @Override
  public void moveLeft() {
    setX(x -= xSpeed);
  }

  @Override
  public void moveRight() {
    setX(x += xSpeed);
  }
}
/*x, y, xSpeed, ySpeed и имплементира методите на
Movable както следва - moveUp() -> y-=ySpeed -
moveDown() -> y+=ySpeed -
moveLeft() -> x-=xSpeed -
moveRight() -> x+=xSpeed*/