package project2;

public class Vest {
private String  name;
private double  price;
private int defence;

  public Vest(String name, double price, int defence) {
    this.name = name;
    this.price = price;
    this.defence = defence;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getDefence() {
    return defence;
  }

  public void setDefence(int defence) {
    this.defence = defence;
  }
}
/* name:
    o price
    o defense*/