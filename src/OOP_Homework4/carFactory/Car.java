package OOP_Homework4.carFactory;

public abstract class Car {
  protected double speed;
  protected double  regularPrice;
  protected String color;

  public Car() {
  }

  public Car(double speed, double regularPrice, String color) {
    setSpeed(speed);
    setRegularPrice(regularPrice);
   setColor(color);
  }

  public double getSpeed() {
    return speed;
  }

  public void setSpeed(double speed) {
    if(speed>0){
    this.speed = speed;}else {this.speed=0;}
  }

  public double getRegularPrice() {
    return regularPrice;
  }

  public void setRegularPrice(double regularPrice) {
    if(regularPrice>0){
      this.regularPrice = regularPrice;
    } else {this.regularPrice=0;}
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

 abstract double  getSalePrice();

}
/*Създайте клас Car който има следните атрибути и методи
speed, regularPrice, color
getSalePrice()
*/