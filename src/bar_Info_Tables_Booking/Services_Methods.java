package bar_Info_Tables_Booking;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;


public class Services_Methods
{

  private static Random             ran   = new Random();
  private final  Staff              staff = new Staff();
  private        ArrayList<Product> menu;

  private LinkedHashMap<String, Order>   barOrders;
  private ArrayBlockingQueue<Product>    drinks;
  private LinkedHashMap<String, Integer> numberOfOrdersOnTable;
  private ArrayBlockingQueue<Product>    food;
  private ArrayBlockingQueue<Product>    readyOrders = new ArrayBlockingQueue<>(50);
  private LinkedList<String[]>           orderedDishes;

  public Staff getStaff()
  {
    return staff;
  }

  public LinkedHashMap<String, Integer> getNumberOfOrdersOnTable()
  {
    return numberOfOrdersOnTable;
  }

  public LinkedHashMap<String, Order> getBarOrders()
  {
    return barOrders;
  }

  public ArrayBlockingQueue<Product> getDrinks()
  {
    return drinks;
  }

  public ArrayBlockingQueue<Product> getFood()
  {
    return food;
  }

  public LinkedList<String[]> getOrderedDishes()
  {
    return orderedDishes;
  }

  private BookingSeats1 book;



  public ArrayList<Product> getMenu()
  {
    return menu;
  }

  public BookingSeats1 getBook()
  {
    return book;
  }

  public Services_Methods()
  {
    this.book = new BookingSeats1();
    this.menu = setMenuList();
    this.barOrders = new LinkedHashMap<>();
    this.drinks = new ArrayBlockingQueue<>(50);
    this.food = new ArrayBlockingQueue<>(50);
    this.orderedDishes = new LinkedList<>();
    this.numberOfOrdersOnTable = new LinkedHashMap<>();

  }


  public Employee chooseStaff(String signatureOfEmployee)
  {
    int firstOrSecond = ran.nextInt(2) + 1;
    if (signatureOfEmployee.contains("Waiter")) {
      if (firstOrSecond == 1) {
        return staff.getFirstWaiter();
      }
      else {
        return staff.getFirstBartender();
      }
    }
    else {
      if (firstOrSecond == 1) {
        return staff.getFirstBartender();
      }
      else {
        return staff.getSecondBartender();
      }
    }


  }

  public void takingOrder(LinkedHashMap<String, String[]> taken) throws InterruptedException

  {

    for (Entry<String, String[]> entry : taken.entrySet()) {
      String seatName = entry.getKey();
      String[] value = entry.getValue();
      int maxItemsToOrder = 3;//(Integer.parseInt(entry.getValue()[0].trim())) * (ran.nextInt(3 - 1) + 1);
      if (seatName
          .startsWith("T")) {
        String staffName = chooseStaff("Waiter").getName();
        puttingInOrderList(seatName, staffName, maxItemsToOrder, taken, barOrders, orderedDishes);
      }

      else {
        String staffName = chooseStaff("Bartender").getName();
        puttingInOrderList(seatName, staffName, maxItemsToOrder, taken, barOrders, orderedDishes);
      }
    }
  }


  public String getTableForDeliverPreparedFromOrder(ArrayBlockingQueue<Product> prepared,
      LinkedHashMap<String, Integer> numberOfOrdersOnTable)
  {
    int sum = 0;
    String key = "";
    for (Entry<String, Integer> entry : numberOfOrdersOnTable.entrySet()) {
      sum += entry.getValue();
      if (sum >= prepared.size()) {
        key = entry.getKey();
        break;
      }
    }
    return key;
  }

  public String seatNameOfDelivery(String getTableForDeliverPreparedFromOrder,
      LinkedHashMap<String, Order> barOrders)
  {
    String seatName = barOrders
        .get(getTableForDeliverPreparedFromOrder)
        .getNameSeat();
    return seatName;
  }

  public LinkedHashMap<String, List<String[]>> listWithOrders(LinkedHashMap<String, Order> barOrders)
  {
    LinkedHashMap<String, List<String[]>> listWithOrders = new LinkedHashMap<>();
    for (Entry<String, Order> entry : barOrders.entrySet()) {
      listWithOrders.put(entry.getKey(), entry
          .getValue()
          .getOrderedDishes());
    }
    return listWithOrders;
  }

  public void puttingInOrderList(String seatName, String staffName, int maxItemsToOrder,
      LinkedHashMap<String, String[]> taken, LinkedHashMap<String, Order> barOrders,
      LinkedList<String[]> orderedDishes)
  {
    Order order = new Order();
    for (int i = 0; i < maxItemsToOrder; i++) {
      int productID = ran.nextInt(9) + 1;
      int quantity = ran.nextInt(3 - 1) + 1;
      orderedDishes.add(new String[]{getProductName(getMenu(), productID), String.valueOf(quantity)});
      if (menu
          .get(productID)
          .getType() == ProductType.DRINK) {

        puttingInDrinkListForBartender(productID, quantity);

      }

      else {
        puttingInFoodListForCooker(productID, quantity, food);
      }
    }

    order.setOrderedDishes(orderedDishes);
    order.setNameSeat(seatName);
    order.setMaxItemsToOrder(maxItemsToOrder);
    order.setNameEmployee(staffName);
    order.setStatus(IsActive.ACTIVE);
    order.setPersons(Integer.parseInt((taken.get(seatName)[0]).trim()));
    order.setNameEmployee(staffName);
    barOrders.put(seatName, order);

  }


  private void puttingInFoodListForCooker(int productID, int quantity, ArrayBlockingQueue<Product> food)
  {
    for (int i = 0; i < quantity; i++) {

      if (food.offer(this.menu.get(productID))) {
        food.add(this.menu.get(productID));
      }
    }

  }

  public LinkedHashMap<String, Integer> numberOfOrdersOnTable(LinkedHashMap<String, Order> barOrders,
      LinkedHashMap<String, Integer> numberOfOrdersOnTable)
  {

    for (Entry<String, Order> entry : barOrders.entrySet()) {
      numberOfOrdersOnTable.put(entry.getKey(), entry
          .getValue()
          .getMaxItemsToOrder());
    }
    return numberOfOrdersOnTable;
  }
  // food.addAll(Collections.nCopies(quantity, menu.get(productID)));-throwing an exception after adding only some
  // of the elements in c

  private synchronized void puttingInDrinkListForBartender(int productID, int quantity)
  {
    for (int i = 0; i < quantity; i++) {

      if (drinks.offer(menu.get(productID))) {
        drinks.add(menu.get(productID));
      }
    }
  }

  public void deleteDishOrDrinkFromOrderedList(String tableOrSeatName, String productName)
  {
    Order fromTobeRemoved = barOrders.get(tableOrSeatName);
    LinkedList<String[]> orderedproducts = fromTobeRemoved.getOrderedDishes();
    int index = orderedproducts.indexOf(productName);
    int quantity = 0;
    if (!(index == -1)) {
      quantity = Integer.parseInt(orderedproducts.get(index)[1]) - 1;
    }
    orderedproducts.set(index, new String[]{productName, String.valueOf(quantity)});
  }


  public void deleteDishFromPreparingQueue(ArrayBlockingQueue<Product> food, String productName)
  {

    Product[] array = (Product[]) food.toArray();
    for (int i = 0; i < array.length; i++) {
      if (array[i]
          .getName()
          .equals(productName)) {
        food.remove(array[i]);
      }
    }
  }

  public Integer getProductID(ArrayList<Product> menu, String productName)
  {
    Integer productID = 0;
    for (int i = 0; i < menu.size(); i++) {
      if (menu
          .get(i)
          .getName()
          .equals(productName)) {
        productID = menu
            .get(i)
            .getId();
      }
    }
    return productID;
  }

  public String getProductName(ArrayList<Product> menu, Integer productID)
  {
    String productName = "";
    for (int i = 0; i < menu.size(); i++) {
      if (menu
          .get(i)
          .getId()
          == (productID)) {
        productName = menu
            .get(i)
            .getName();
        break;
      }
    }
    return productName;
  }

  public ArrayList<Product> setMenuList()
  {
    Product burger = new Product(1, "Burger", new BigDecimal(13), ProductType.DISH);
    Product pizza = new Product(2, "Pizza", new BigDecimal(10), ProductType.DISH);
    Product fries = new Product(3, "Fries", new BigDecimal(7), ProductType.DISH);
    Product friesWithCheese = new Product(4, "FriesAndCheese", new BigDecimal(8), ProductType.DISH);
    Product water = new Product(5, "Water", new BigDecimal(2), ProductType.DRINK);
    Product juice = new Product(6, "Juice", new BigDecimal(1), ProductType.DRINK);
    Product cola = new Product(7, "Juice", new BigDecimal(2), ProductType.DRINK);
    Product vodka = new Product(8, "Vodka", new BigDecimal(3), ProductType.DRINK);
    Product whiskey = new Product(9, "Whiskey", new BigDecimal(3), ProductType.DRINK);
    Product rum = new Product(10, "Rum", new BigDecimal(3), ProductType.DRINK);
    menu = new ArrayList<>(Arrays.asList(burger, pizza, fries, friesWithCheese,
        water, juice, cola, vodka, whiskey, rum));
    return menu;
  }

  public void printMenu()
  {
    Iterator<Product> listIterator = menu.iterator();
    while (listIterator.hasNext()) {
      Product product = listIterator.next();
      System.out.println("Product{" +
          "id=" + product.getId() +
          ", name='" + product.getName() + '\'' +
          ", price='" + product.getPrice() + '\'' +
          ", type" + product.getType() +
          '}');
    }
  }

  public void printListWithOrders(LinkedHashMap<String, List<String[]>> listWithOrders)
  {
    for (Entry<String, List<String[]>> entry : listWithOrders.entrySet()) {
      System.out.print(entry.getKey() + "+" + "{");
      for (String[] s : entry.getValue()) {
        System.out.print(" " + "[ " + s + "; ");
      }
      System.out.print("]}\n");
    }
  }

  public void printOrderedDishes()
  {
    for (String[] s : orderedDishes) {
      System.out.print(Arrays.asList(s) + "; ");
    }

  }

  public void printBarOrders()
  {
    for (Map.Entry<String, Order> e : barOrders.entrySet()) {
      System.out.print(e.getKey() + "-{" + e
          .getValue()
          .toString() + "}" + "; \n");
    }
  }

  public void prepareDrinks(ArrayBlockingQueue<Product> drinks, Bartender bartender,
      LinkedHashMap<Product, Integer> storageProducts, ArrayBlockingQueue<Product> readyOrders)
  {
    while (!drinks.isEmpty()) {
      Product p = drinks.poll();
      bartender.prepareDrink(storageProducts, p);
      readyOrders.offer(p);
    }
  }

 /* public void prepareFood(ArrayBlockingQueue<Product> food, Chef chef,
      LinkedHashMap<Product, Integer> storageProducts, ArrayBlockingQueue<Product> readyOrders)
  {
    while (!food.isEmpty()) {
      Product p = food.poll();
      chef.cooking(storageProducts, p);
      readyOrders.offer(p);
    }
  }*/

  public void printDrink(ArrayBlockingQueue<Product> drinks)
  {
    Product product;
    Iterator<Product> drinksIterator = drinks.iterator();
    while (drinksIterator.hasNext()) {
      product = drinksIterator.next();
      System.out.print(product.getName() + "; ");
    }
  }

  public void printFood(ArrayBlockingQueue<Product> food)
  {
    Product product;
    Iterator<Product> foodIterator = drinks.iterator();
    while (foodIterator.hasNext()) {
      product = foodIterator.next();
      System.out.print(product.getName() + "; ");
    }

  }
}

// платено масата е свободна


