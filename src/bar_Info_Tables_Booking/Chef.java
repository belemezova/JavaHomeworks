package bar_Info_Tables_Booking;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Chef extends Employee {

  public Chef(String name, BigDecimal dailyWage) {
    super(name);
    this.setDailyWage(dailyWage);
  }

  public boolean cooking(LinkedHashMap<Product, Integer> foodStorage, Dish dish) {
    /*
    receive dish order
    check are the products available in the storage,
     if can cook this - return true and remove the part from the storage
     if not - return false
     */

    //this map keeps all products that we'll remove in case we need them back
    HashMap<Product, Integer> productsForAdding = new HashMap<>();

    for (Map.Entry<Product, Integer> currentProductRecipe : dish.getRecipe()
        .entrySet()) {//goes through the recipe

      String productName = currentProductRecipe.getKey().getName();
      Integer quantityNeeded = currentProductRecipe.getValue();

      for (Map.Entry<Product, Integer> currentProductInFoodStorage : foodStorage.entrySet()) {//goes through the storage

        String productNameInStorage = currentProductInFoodStorage.getKey().getName();
        Integer quantityInStorage = currentProductInFoodStorage.getValue();

        if (productNameInStorage.equals(
            productName)) {//check for the current product in the storage

          if (quantityInStorage - quantityNeeded >= 0) {

            foodStorage.put(currentProductRecipe.getKey(), quantityInStorage - quantityNeeded);
            productsForAdding.put(currentProductRecipe.getKey(), quantityNeeded);

          } else {
            //return unused products in the storage
            for (Map.Entry<Product, Integer> entryToReturn : productsForAdding.entrySet()) {

              for (Map.Entry<Product, Integer> entryStorage : foodStorage.entrySet()) {

                if (entryStorage.getKey().equals(entryToReturn.getKey())) {

                  foodStorage.put(entryStorage.getKey(), entryStorage.getValue() + entryToReturn.getValue());
                }
              }
            }
            System.err.println("No more " + dish.getName());
            return false;
          }
        }
      }
    }
    return true;
  }
}
