package bar_Info_Tables_Booking;

import java.util.LinkedList;
import java.util.Random;

public class Order
{

  private static Random ran = new Random();

  private        String               nameSeat;
  private        String               nameEmployee;
  private        int                  orderID = 0;
  private        LinkedList<String[]> orderedDishes;
  private        int                  persons;
  private        IsActive             status;
  private        int                  maxItemsToOrder;
  private static int                  increment;


  public Order()
  {
    increment++;
    orderID = increment;
  }


  public IsActive getStatus()
  {
    return status;
  }


  public int getOrderID()
  {
    return orderID;
  }

  @Override
  public String toString()
  {
    return "Order{" +
        "orderID=" + orderID +
        ", nameSeat='" + nameSeat + '\'' +
        ", nameEmployee='" + nameEmployee + '\'' +
        ", orderedDishes=" + orderedDishes +
        ", persons=" + persons +
        ", status=" + status +
        ", maxItemsToOrder=" + maxItemsToOrder +
        '}';
  }


  public void setOrderID(int orderID)
  {

  }

  public int getMaxItemsToOrder()
  {
    return maxItemsToOrder;
  }

  public String getNameSeat()
  {
    return nameSeat;
  }

  public String getNameEmployee()
  {
    return nameEmployee;
  }

  public int getPersons()
  {
    return persons;
  }

  public void setMaxItemsToOrder(int maxItemsToOrder)
  {
    this.maxItemsToOrder = maxItemsToOrder;
  }

  public void setNameEmployee(String nameEmployee)
  {
    this.nameEmployee = nameEmployee;
  }

  public void setNameSeat(String nameSeat)
  {
    this.nameSeat = nameSeat;
  }


  public LinkedList<String[]> getOrderedDishes()
  {
    return orderedDishes;
  }

  public void setOrderedDishes(LinkedList<String[]> orderedDishes)
  {
    this.orderedDishes = orderedDishes;
  }

  public void setPersons(int persons)
  {
    this.persons = persons;
  }

  public void setStatus(IsActive status)
  {
    this.status = status;
  }
}
