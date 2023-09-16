package OOP_Homework4.carFactory;

public class Sedan extends Car {

  private double length;


  public Sedan() {
  }

  public Sedan(double speed, double regularPrice, String color, double length) {
    super(speed, regularPrice,color);
    this.length = length;
  }


  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    if (length > 0) {
      this.length = length;
    }
  }

  @Override
  public double getSalePrice() {
    double price = getRegularPrice();
    if (getLength() > 6.5) {
      price = price * .95;
    } else {
      price *= 0.9;
    }
    return price;
  }
}
/*Създайте клас Sedan който наследява Car и има следните атрибути и методи
length
getSalePrice() - ако дължината е > 6,5 метра -> 5% отстъпка, иначе 10% отстъпка*/