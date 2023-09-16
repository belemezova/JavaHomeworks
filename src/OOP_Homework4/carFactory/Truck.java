package OOP_Homework4.carFactory;

public class Truck extends Car{
private double weight;

  public Truck() {
  }
  public Truck(double speed, double regularPrice, String color, double weight){
    super(speed, regularPrice, color);
    setWeight(weight);

  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  @Override
  public double getSalePrice() {
    double price=super.getRegularPrice();
    if(this.weight>2000){
      price=price*0.9;
    }else {
      price*=0.8;
    }
    return price;
  }
}
/*Създайте клас Truck който наследява Car и има следните атрибути и методи
weight
getSalePrice() т.че ако weight > 2000 тогава има 10% намаление, иначе 20% намаление.*/