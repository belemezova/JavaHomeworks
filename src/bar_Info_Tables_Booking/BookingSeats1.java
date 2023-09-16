package bar_Info_Tables_Booking;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;


public class BookingSeats1 {//singleton

  public static Random ran = new Random();


  private LinkedHashMap<String, String[]> taken;

  private LinkedHashMap<String, String[]> availableSeats;
  private ArrayBlockingQueue<Integer> queueGuest;

  private LinkedHashMap<String, String[]> allSeats;
  private Seats seats;


  private int standings;
  private int guestPerDay;
  private int takenSeats = 0;
  private boolean vacateSeatsIsCalled = false;
  private int guestsToBeHosted;

  public int getGuestPerDay() {
    return guestPerDay;
  }

  public LinkedHashMap<String, String[]> getTaken() {
    return taken;
  }

  public LinkedHashMap<String, String[]> getAvailableSeats() {
    return availableSeats;
  }

  public LinkedHashMap<String, String[]> getAllSeats() {
    return allSeats;
  }

  public boolean isVacateSeatsIsCalled() {
    return vacateSeatsIsCalled;
  }

  public int getGuestsToBeHosted() {

    return guestsToBeHosted;
  }

  private int freeSeats = 40;

  public int getStandings() {
    return standings;
  }

  public int getTakenSeats() {
    return takenSeats;
  }

  public int getFreeSeats() {
    return freeSeats;
  }


  public void setStandings() {
    this.standings = 10;
  }

  public void setVacateSeatsIsCalled(boolean vacateSeatsIsCalled) {
    this.vacateSeatsIsCalled = vacateSeatsIsCalled;
  }

  public void setGuestsToBeHosted(int guestsToBeHosted) {
    this.guestsToBeHosted = guestsToBeHosted;
  }

  public void setFreeSeats(int freeSeats) {
    this.freeSeats = freeSeats;
  }

  public BookingSeats1() {

    this.allSeats = setAllSeats();
    this.availableSeats = availableSeats();
    guestPerDay = ran.nextInt(50 - 25) + 25;
    this.queueGuest = setQueueGuest();
    this.taken = new LinkedHashMap<>();
  }

  public ArrayBlockingQueue<Integer> setQueueGuest() {
    guestsToBeHosted = 0;
    ArrayBlockingQueue<Integer> queueGuest = new ArrayBlockingQueue<>(20);

    int person = 0;
    while (guestPerDay > 0) {
      person = ran.nextInt(8 - 4) + 4;
      if (guestPerDay - person > 0) {

        queueGuest.offer(person);
        guestPerDay -= person;
      } else {
        queueGuest.offer(guestPerDay);
        break;
      }


    }
    return queueGuest;
  }

  public void removeFromBooking(LinkedHashMap<String, String[]> taken) {

    if (taken.size() > 0) {
      for (Map.Entry<String, String[]> takenEntry : taken.entrySet()) {
        if ((takenEntry.getValue().length > 0) && ((takenEntry.getValue()[1]).equals(
            IsAble.ENABLE.name()))) {
          taken.remove(takenEntry.getKey());
        }
      }
    }
  }

  public LinkedHashMap<String, String[]> hostFirstGroupGuests() {
    taken = new LinkedHashMap<>();
    int k = queueGuest.size();
    for (int i = 0; i < k; i++) {
      if (!queueGuest.isEmpty()) {
        int num = queueGuest.peek();
        selectGuestsTable(num);
        queueGuest.remove(num);
        k--;
      }

    }
    return taken;
  }

  public void selectGuestsTable(int person) {

    boolean stillPersonsToAdd = true;

    while (stillPersonsToAdd) {
      int diff = 0;
      String[] value = {String.valueOf(person), IsAble.ENABLE.name()};
      if (availableSeats.containsValue(value)) {
        setTakenSeats(person, getKey(availableSeats, person), stillPersonsToAdd);
        stillPersonsToAdd = false;
      } else {
        for (Entry<String, String[]> entry : availableSeats.entrySet()) {//при един ми дава грешка
          String k = entry.getKey();
          Integer v = Integer.valueOf(entry.getValue()[0]);
          String status = entry.getValue()[1];
          if (availableSeats.get(k)[1].equals(IsAble.ENABLE.name())) {
            if (Math.abs(person - v) <= 2) {

              if (person - v > 0) {
                diff = v;
              } else {
                diff = person;
              }
              setTakenSeats(diff, k, stillPersonsToAdd);
              person = person - diff;
              if (person <= 0) {
                stillPersonsToAdd = false;
              }
            }
          }
          if (!stillPersonsToAdd) {
            break;
          }
        }
        if (stillPersonsToAdd && availableSeats.containsValue(value)) {
          for (Entry<String, String[]> entry : availableSeats.entrySet()) {
            String k = entry.getKey();
            setTakenSeats(1, k, stillPersonsToAdd);
            person = person - 1;

          }
        }
      }
    }

  }


  public void setTakenSeats(int person, String key, boolean stillPersonsToAdd) {
    taken.put(key, new String[]{String.valueOf(person).trim(), IsAble.DISABLE.toString()});
    String[] value = availableSeats.get(key);
    String[] temp = new String[2];
    temp[0] = String.valueOf(0);
    temp[1] = IsAble.DISABLE.name();
    availableSeats.replace(key, temp);
    takenSeats += person;
    freeSeats -= takenSeats;
  }

  public void hostLastGuests() {
    if (guestsToBeHosted != 0 && vacateSeatsIsCalled) {
      selectGuestsTable(guestsToBeHosted);
    }
  }


  public void vacateSeats(LinkedHashMap<String, String[]> taken,
      LinkedHashMap<String, String[]> availableSeats, String tableSeat) {
    if (taken.containsKey(tableSeat)) {
      taken.get(tableSeat)[1] = IsAble.ENABLE.name();
      availableSeats.get(tableSeat)[1] = IsAble.ENABLE.name();
      taken.remove(tableSeat);
      takenSeats -= Integer.parseInt(taken.get(tableSeat)[0]);
      freeSeats += Integer.parseInt(taken.get(tableSeat)[0]);
      vacateSeatsIsCalled = true;
    }
  }

  public void changeNumberOfTakenSeats(Integer number, String table,
      LinkedHashMap<String, String[]> taken) {
    String[] value = taken.get(table);
    value[1] = number.toString();
    taken.replace(table, taken.get(table), value);
  }

  public void changeOneAvailableTableWithAnother(String oldNameTable, String newNameTable,
      LinkedHashMap<String,
          String[]> availableSeats, LinkedHashMap<String, String[]> allSeats) {
    if (availableSeats.containsKey(oldNameTable)) {
      availableSeats.remove(oldNameTable);
    }
    if (allSeats.containsKey(newNameTable)) {
      availableSeats.put(newNameTable, allSeats.get(newNameTable));
    }
  }

  public String getKey(LinkedHashMap<String, String[]> availableSeats, Integer value) {
    String key = " ";
    for (Entry<String, String[]> entry : availableSeats.entrySet()) {
      if (value.equals(Integer.parseInt(entry.getValue()[0]))) {
        key = entry.getKey();
        break;
      }
    }
    return key;
  }

  public int checkCapacity(LinkedHashMap<String, String[]> availableSeats) {
    availableSeats();
    int sum = 0;
    for (Entry<String, String[]> entry : availableSeats.entrySet()) {
      int v = Integer.valueOf(entry.getValue()[0]);
      sum += v;
    }
    return sum;
  }

  public LinkedHashMap<String, String[]> availableSeats() {
    for (Entry<String, String[]> entry : availableSeats.entrySet()) {
      if (entry.getValue()[1].equals(IsAble.DISABLE.toString())) {
        availableSeats.remove(entry);
      }
    }
    return availableSeats;
  }

  public LinkedHashMap<String, String[]> setAllSeats() {
    LinkedHashMap<String, String[]> allSeats = new LinkedHashMap<>();
    for (Seats s : Seats.values()) {
      allSeats.put(s.getName(), new String[]{("" + s.getCapacity()),
          IsAble.ENABLE.toString()});
    }
    availableSeats = allSeats;
    this.allSeats = allSeats;
    return allSeats;
  }
}

// Unbooking
