package bar_Info_Tables_Booking;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

public class Bartender extends Employee {

  private BigDecimal tip;

  public Bartender(String name, BigDecimal dailyWage) {
    super(name);
    this.setDailyWage(dailyWage);
  }

  public BigDecimal getTip() {
    return tip;
  }

  public void setTip(BigDecimal tip) {
    this.tip = tip;
  }

  public boolean prepareDrink(LinkedHashMap<Product, Integer> drinkStorage,
      Product drink) {
    /*
    receive drink order
    check are the products available in the storage,
     if yes- return true and remove the part from the storage
     if not - return false and throw exception
     */

    for (Map.Entry<Product, Integer> entry : drinkStorage.entrySet()) {

      if (entry.getKey().getName().equals(drink.getName())) {

        if (entry.getValue()-1>=0){

          drinkStorage.put(entry.getKey(),entry.getValue()-1);
          return true;
        }
      }
    }
    System.err.println("No more "+drink.getName());
    return false;
  }
}
