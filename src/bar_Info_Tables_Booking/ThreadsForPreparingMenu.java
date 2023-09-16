package bar_Info_Tables_Booking;// package bar_Info_Tables_Booking.orders;
//
// import bar_Info_Tables_Booking.Services_Methods;
// import com.codix.bar.Product;
//
//
// import java.util.concurrent.ArrayBlockingQueue;
//
// public class ThreadsForPreparingMenu
// {
//
//   public class DishQueue
//   {
//
//     private static final int                         QUEUE_SIZE  = 50;
//     private              ArrayBlockingQueue<Product> readyOrders = new ArrayBlockingQueue<>(
//         QUEUE_SIZE);
//     private Services_Methods field;
//     private int              counter = 0;
//
//     public DishQueue(ArrayBlockingQueue<Product> readyOrders, Services_Methods field)
//     {
//       this.readyOrders = readyOrders;
//       this.field = field;
//     }
//
//
//
//     public synchronized void putDrink() throws InterruptedException
//     {
//       Product p;
//       try {
//         while (readyOrders.size() == QUEUE_SIZE) {
//           wait();
//         }
//         {
//           counter++;
//           readyOrders.put(p);
//           notify();
//           Thread.sleep(1000);
//         }
//       }
//
//
//       catch (InterruptedException e) {
//       }
//     }
//   }
//
//   public synchronized void putDish() throws InterruptedException
//   { try {
//       while (readyOrders.size() == QUEUE_SIZE) {
//         wait();
//       }
//       for (Product p : readyOrders) {
//         counter++;
//         readyOrders.put(p);
//         notify();
//         Thread.sleep(1000);
//       }
//     }
//
//     catch (InterruptedException e) {
//     }
//   }
//
//   public ArrayBlockingQueue<Product> getReadyOrders() throws InterruptedException
//   {
//     try {
//       while (readyOrders.size() == 0) {
//         wait();
//       }
//       for (Product p : readyOrders) {
//         readyOrders.put(p);
//         counter++;
//         notify();
//         Thread.sleep(1000);
//
//       }
//     }
//
//     //TODO       /* deleteDishOrDrinkFromOrderedList( orders, String tableOrSeatName, String productName);
//
//
//     catch (InterruptedException e) {
//     }
//     return ready;
//   }
//
// }
//
// class ServiceDish extends Thread
// {
//
//   private DishQueue dishQueue;
//
//   public ServiceDish(DishQueue dishQueue)
//   {
//     this.dishQueue = dishQueue;
//   }
//
//   public void run()
//   {
//     try {
//       while (true) {
//         dishQueue.readyOrders.take();
//         sleep(500);
//       }
//     }
//     catch (InterruptedException e) {
//     }
//   }
//
// }
//
// class ServiceDrink extends Thread
// {
//
//   private DishQueue drinkQueue;
//
//   public ServiceDrink(DishQueue drinkQueue)
//   {
//     this.drinkQueue = drinkQueue;
//   }
//
//   public void run()
//   {
//     try {
//       while (true) {
//         drinkQueue.readyOrders.take();
//         sleep(500);
//       }
//     }
//     catch (InterruptedException e) {
//     }
//   }
//
// }
//
// class Chef extends Thread
// {
//
//
//   private DishQueue readyOrders;
//
//   public Chef(DishQueue readyOrders)
//   {
//     this.readyOrders = readyOrders;
//   }
//
//   public void run()
//   {
//
//     try {
//       while (true) {
//
//         readyOrders.putDrink();
//         sleep(500);
//       }
//     }
//     catch (InterruptedException e) {
//     }
//   }
// }
//
// class Bartender extends Thread
// {
//
//
//   private DishQueue readyOrders;
//
//
//   {
//     this.readyOrders = readyOrders;
//   }
//
//   public void run()
//   {
//
//     try {
//       while (true) {
//
//         readyOrders.putDrink();
//         sleep(500);
//       }
//     }
//     catch (InterruptedException e) {
//     }
//
//   }
//
//
//
// }
