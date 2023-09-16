package bar_Info_Tables_Booking;


import java.util.Random;

class Test

{


  static Random ran = new Random();




  public static void main(String[] args) throws InterruptedException
  {

    Services_Methods method = new Services_Methods();
    method.printMenu();
    method.getBook().setQueueGuest();
    method.getBook().hostFirstGroupGuests();
    method.getBook().vacateSeats(method.getBook().getTaken(), method.getBook().getAvailableSeats(), "T1" );
    method.getProductName(method.getMenu(), 3);

    method.takingOrder(method.getBook().getTaken());
    method.printOrderedDishes();
    method.printBarOrders();
    method.numberOfOrdersOnTable(method.getBarOrders(), method.getNumberOfOrdersOnTable());
    System.out.println(method.getTableForDeliverPreparedFromOrder(method.getDrinks(), method.getNumberOfOrdersOnTable()));
    method.printDrink(method.getDrinks());
  }


}




