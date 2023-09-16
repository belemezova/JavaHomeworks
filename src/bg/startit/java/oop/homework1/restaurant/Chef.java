package bg.startit.java.oop.homework1.restaurant;

import java.util.ArrayDeque;
import java.util.Collections;


public class Chef {
 private ArrayDeque<String> dish=new ArrayDeque<>();
 private String[] orders;


  public ArrayDeque<String> getDish() {
    return dish;
  }

  public void setDish(ArrayDeque<String> dish) {
    this.dish = dish;
  }

  public Chef() {
    Collections.addAll(this.dish, orders);
  }
  public boolean  toCook(){
    Collections.addAll(dish, orders);
    return getDish().remove(orders.length-1);
  }
}
