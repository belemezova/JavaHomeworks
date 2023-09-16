package Lecture_Homework.bar_Info_Tables_Booking1;


import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Random;

public class BookingSeats
{

  public final static int    BAR_CAPACITY = 40;
  public static       Random ran          = new Random();


  private LinkedHashMap<String, String[]> taken = new LinkedHashMap<>();

  private LinkedHashMap<String, String[]> availableSeats = new LinkedHashMap<>();

  private LinkedHashMap<String, String[]> allSeats = new LinkedHashMap<>();


  public  Reports report;
  private int     standings;
  private int     takenSeats = 0;
  private int     freeSeats  = 40;

  public BookingSeats()
  {
    setAllSeats();
    setAvailableSeats();
  }

  public void setTakenSeats(String nameOfEmployee)
  {
    int person = ran.nextInt(11);

    boolean stillPersonsToAdd = true;
    if (availableSeats.containsValue(person)) {
      String key = getKey(availableSeats, person);
      taken.put(key, new String[]{nameOfEmployee, "" + (person), IsAble.DISABLE.toString()});
      availableSeats.replace(key, new String[]{"" + (person), IsAble.ENABLE.toString()}, new String[]{"" + (person),
          IsAble.DISABLE.toString()});
      takenSeats += person;
      freeSeats -= takenSeats;
      stillPersonsToAdd = false;
    }

    while (stillPersonsToAdd) {
      for (Entry<String, String[]> entry : availableSeats.entrySet()) {
        String k = entry.getKey();
        Integer v = Integer.valueOf(entry.getValue()[0]);
        String status = entry.getValue()[1];

        if (Math.abs(person - v) <= 2) {
          int diff;
          if (person - v > 0) {
            diff = v;
          }
          else {
            diff = person;
          }
          taken.put(k, new String[]{nameOfEmployee, " " + (diff), IsAble.DISABLE.toString()});
          entry.getValue()[1] = IsAble.DISABLE.toString();
          takenSeats += diff;
          freeSeats -= takenSeats;
          person = person - diff;
          if (person <= 0) {
            stillPersonsToAdd = false;
          }
        }
        if (stillPersonsToAdd == false) {
          break;
        }
      }
      availableSeats(availableSeats);
      int freePlaces = checkCapacity(availableSeats);
      if (stillPersonsToAdd && (freeSeats > 0)) {
        for (Entry<String, String[]> entry : availableSeats.entrySet()) {
          String k = entry.getKey();
          Integer v = Integer.valueOf(entry.getValue()[0]);
          String status = entry.getValue()[1];
          for (int i = 0; i < freePlaces; i++) {
            taken.put(k, new String[]{nameOfEmployee, " " + (i), IsAble.DISABLE.toString()});
            entry.getValue()[1] = IsAble.DISABLE.toString();
            takenSeats += i;
            freeSeats -= takenSeats;
            person = person - i;
          }
        }
      }
    }

  }


  public void setAvailableSeats()
  {
    availableSeats = allSeats;
  }

  public void vacateSeats(String tableSeat, LinkedHashMap<String, String[]> taken)
  {
    if (taken.containsKey(tableSeat)) {
      taken.remove(tableSeat);
    }
  }
  public void changeNumberOfTakenSeats(Integer number,String table, LinkedHashMap<String, String[]> taken ){
    String [] value=taken.get(table);
    value[1]=number.toString();
    taken.replace(table, taken.get(table), value);
  }

  public void changeOneAvailableTableWithAnother(String oldNameTable, String newNameTable, LinkedHashMap<String,
      String[]> availableSeats, LinkedHashMap<String, String[]> allSeats)
  {
    if (availableSeats.containsKey(oldNameTable)) {
      availableSeats.remove(oldNameTable);
    }
     if(allSeats.containsKey(newNameTable)){
       availableSeats.put(newNameTable, allSeats.get(newNameTable));
     }
  }

  public String getKey(LinkedHashMap<String, String[]> availableSeats, Integer value)
  {
    for (Entry<String, String[]> entry : availableSeats.entrySet()) {
      if (value.equals(entry.getValue()[0])) {
        return entry.getKey();
      }
    }
    return null;
  }

  public int checkCapacity(LinkedHashMap<String, String[]> availableSeats)
  {
    availableSeats(availableSeats);
    int sum = 0;
    for (Entry<String, String[]> entry : availableSeats.entrySet()) {
      Integer v = Integer.valueOf(entry.getValue()[0]);
      sum += v;
    }
    return sum;
  }

  public void availableSeats(LinkedHashMap<String, String[]> availableSeats)
  {

    for (Entry<String, String[]> entry : availableSeats.entrySet()) {
      if (entry.getValue()[1].equals(IsAble.DISABLE.toString())) {
        availableSeats.remove(entry);
      }
      if (standings <= 10) {
        availableSeats.put("Standing", new String[]{("" + (10 - standings)), IsAble.ENABLE.name()});
      }
    }
  }

  public void setAllSeats()
  {

    for (Seats s : Seats.values()) {

      allSeats.put(s.getName(), new String[]{("" + s.getCapacity()),
          IsAble.ENABLE.toString()});

    }
    allSeats.put("Standing", new String[]{"10",
        IsAble.ENABLE.toString()});
    availableSeats = allSeats;

  }
}

