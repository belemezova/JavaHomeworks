package Lecture_Homework.bar_Info_Tables_Booking1;

import java.util.LinkedHashMap;


public class Reports
{

  public  LinkedHashMap<String, String[]> allSeats = new LinkedHashMap<>();

  public  void setAllSeats()
  {
    int i = 0;
    for (Seats s : Seats.values()) {

      allSeats.put(s.getName(),new String[]{(""+s.getCapacity()),
          IsAble.ENABLE.toString()});
      i++;
    }
    allSeats.put("Standing", new String[]{"10",
        IsAble.ENABLE.toString()});

  }
}


