package Lecture_Homework.bar_Info_Tables_Booking1;


import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Random;

class Test

{


  static Random ran = new Random();

  static LinkedHashMap<String, String[]> taken = new LinkedHashMap<>();

  static LinkedHashMap<String, String[]> availableSeats = new LinkedHashMap<>();
  static LinkedHashMap<String, String[]> allSeats       = new LinkedHashMap<>();


  public static void main(String[] args)
  {

    Seats seats;

    setAllSeats();
    setAvailableSeats();
    int takenSeats = 0;
    int freeSeats = 40;

    int person = 5;//ran.nextInt(11);
    String nameOfEmployee = "Damyan";

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
    System.out.println(taken.toString());
  }

  public static void setAvailableSeats()
  {
    availableSeats = allSeats;
  }

  public static String getKey(LinkedHashMap<String, String[]> availableSeats, Integer value)
  {
    for (Entry<String, String[]> entry : availableSeats.entrySet()) {
      if (value.equals(entry.getValue()[0])) {
        return entry.getKey();
      }
    }
    return null;
  }

  public static int checkCapacity(LinkedHashMap<String, String[]> availableSeats)
  {
    availableSeats(availableSeats);
    int sum = 0;
    for (Entry<String, String[]> entry : availableSeats.entrySet()) {
      Integer v = Integer.valueOf(entry.getValue()[0]);
      sum += v;
    }
    return sum;
  }

  public static void availableSeats(LinkedHashMap<String, String[]> availableSeats)
  {

    for (Entry<String, String[]> entry : availableSeats.entrySet()) {
      if (entry.getValue()[1].equals(IsAble.DISABLE.toString())) {
        availableSeats.remove(entry.getKey());
      }
    }
  }


  public static void setAllSeats()
  {
    int i = 0;
    for (Seats s : Seats.values()) {

      allSeats.put(s.getName(), new String[]{("" + s.getCapacity()),
          IsAble.ENABLE.toString()});
      i++;
    }
    allSeats.put("Standing", new String[]{"10",
        IsAble.ENABLE.toString()});
    availableSeats = allSeats;

  }
}