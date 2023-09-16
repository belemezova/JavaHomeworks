package project;

import java.util.Arrays;

public enum Vest {

       Vest1000(900, 10),
       Vest1500(950, 15),
       Vest2000(1000, 20),
       Vest2300(1300, 25),
       Vest2800(1800, 30);
  private double price;
  private int dmg;

  Vest(double price, int dmg) {
    this.price = price;
    this.dmg = dmg;
  }


  }
