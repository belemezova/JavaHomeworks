/*
package bar_Info_Tables_Booking;

import employees.Band;
import employees.Employee;
import employees.TributeBand;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DayOfWeek {

  private Staff staff;
  private TributeBand tributeBand;
  private String currentDay;
  private Band fridayBand;
  private Band saturdayBand;

  public DayOfWeek(Staff staff) {
    this.staff = staff;
    tributeBand = staff.getTributeBand();
  }

  public TributeBand getTributeBand() {
    return tributeBand;
  }

  public Band getFridayBand() {
    return fridayBand;
  }

  public void setFridayBand(Band fridayBand) {
    this.fridayBand = fridayBand;
  }

  public Band getSaturdayBand() {
    return saturdayBand;
  }

  public void setSaturdayBand(Band saturdayBand) {
    this.saturdayBand = saturdayBand;
  }

  public Staff getStaff() {
    return staff;
  }

  public String getCurrentDay() {
    return currentDay;
  }

  public void setDayOfWeek() {

    ArrayList<Band> bands = BandsForCurrentWeek.generateRandomBandsForTribute();
    fridayBand = bands.get(0);
    saturdayBand = bands.get(1);

    ArrayList<String> allOptionsForTheDay = new ArrayList<>();//create a list with all options for the week

    for (DaysOfWeek day : DaysOfWeek.values()) {

      if (day.equals(DaysOfWeek.MONDAY) || day.equals(DaysOfWeek.TUESDAY)) {
        continue;
      }

      if (day.equals(DaysOfWeek.FRIDAY)) {

        allOptionsForTheDay.add(day + " - " + fridayBand + " tribute - 10 lv entrance");
        continue;
      }
      if (day.equals(DaysOfWeek.SATURDAY)) {

        allOptionsForTheDay.add(
            day + " - " + saturdayBand + " tribute - 10 lv entrance");
        continue;
      }

      allOptionsForTheDay.add(day.toString());

    }
//block for choosing the day - start
//    JFrame jFrame = new JFrame();
//
//    JComboBox<String> jComboBox = new JComboBox<>(
//        allOptionsForTheDay.toArray(new String[allOptionsForTheDay.size()]));
//
//    jComboBox.setBounds(80, 50, 140, 20);
//
//    JButton jButton = new JButton("Done");
//    jButton.setBounds(100, 100, 90, 20);
//
//    JLabel jLabel = new JLabel();
//    jLabel.setBounds(90, 100, 400, 100);
//
//    jFrame.add(jButton);
//    jFrame.add(jComboBox);
//    jFrame.add(jLabel);
//
//    jFrame.setLayout(null);
//    jFrame.setSize(350, 250);
//    jFrame.setVisible(true);
//
//
//    jButton.addActionListener(new ActionListener() {
//      @Override
//      public void actionPerformed(ActionEvent e) {
//
//        String selectedDayMessage = "You selected " + jComboBox.getItemAt(jComboBox.getSelectedIndex());
//        jLabel.setText(selectedDayMessage);
//        currentDay=  selectedDayMessage;
//        System.out.println(currentDay);
//      }
//    });



//block for choosing the day - end

     ImageIcon callendarPhoto=new ImageIcon("src/photos/callendar_photo.jpg");




    String setDay = (String) JOptionPane.showInputDialog(//create dropdown menu for the day
        null,
        "Choose day, Monday and Tuesday is closed",
        "Day",
        JOptionPane.QUESTION_MESSAGE,
        callendarPhoto,
        allOptionsForTheDay.toArray(),
        allOptionsForTheDay.toArray()[0]);

    currentDay = setDay.split(" ")[0];

    staff.getFirstWaiter().setOnShift(true);
    staff.getSecondWaiter().setOnShift(true);
    staff.getFirstBartender().setOnShift(true);
    staff.getSecondBartender().setOnShift(true);
    staff.getChef().setOnShift(true);

    if (currentDay.equals(DaysOfWeek.FRIDAY.toString()) || currentDay.equals(
        DaysOfWeek.SATURDAY.toString())) {

      staff.getSecurityMan().setOnShift(true);

      for (Employee bandMember : tributeBand.getBandMembers()) {

        bandMember.setOnShift(true);

      }
    }
  }

  public enum DaysOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
  }
}*/
