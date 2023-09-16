/*
package bar_Info_Tables_Booking;

import employees.Employee;
import employees.TributeBand;
import java.util.ArrayList;
import methods.DayOfWeek.DaysOfWeek;

public class Start {

  public static void runProgram() throws Exception {

    Staff staff=new Staff();
    DayOfWeek day=new DayOfWeek(staff);
    day.setDayOfWeek();

    System.out.println("The day you chose is " + day.getCurrentDay());

    MusicPlayer musicPlayer=new MusicPlayer();

    checkForBandToday(day, musicPlayer);

    ArrayList<Employee>employees=day.getStaff().getEmployees();
    TributeBand tributeBand=day.getStaff().getTributeBand();


  }

  private static void checkForBandToday(DayOfWeek day, MusicPlayer musicPlayer) throws Exception {
    if (day.getCurrentDay().equals(DaysOfWeek.FRIDAY.toString())){

      String musicLocation= musicPlayer.musicLocation(day.getFridayBand());
      musicPlayer.turnTheMusic(musicLocation);
    }
    if (day.getCurrentDay().equals(DaysOfWeek.SATURDAY.toString())){

      String musicLocation= musicPlayer.musicLocation(day.getSaturdayBand());
      musicPlayer.turnTheMusic(musicLocation);
    }
  }
}
*/
