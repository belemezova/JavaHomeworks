package project2;

public class Weapon {
  private String name;
  private int dmg;
  private double price;


  public Weapon(String name, int dmg, double price) {
    this.name = name;
    this.dmg = dmg;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getDmg() {
    return dmg;
  }

  public void setDmg(int dmg) {
    this.dmg = dmg;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
