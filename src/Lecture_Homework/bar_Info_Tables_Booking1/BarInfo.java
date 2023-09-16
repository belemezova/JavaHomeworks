package Lecture_Homework.bar_Info_Tables_Booking1;

public class BarInfo
{

  public final static String      BAR_NAME = "Bar Cheers";
  public final static String      Address  = "бул. „Княз Александър Дондуков 14,  1000 София център, София";
  public final static String      website  = "www.BarCheers.bg";
  public final static String      phone    = "35929243377";
  public              boolean     isOpen;
  public static String            workingHours;


  public BarInfo()
  {
    setWorkingHours("19:00 PM- 1:00 AM");
    isOpen=true;
  }

  public boolean isOpen()
  {
    return isOpen;
  }

  public void setOpen(String day, int hour, String amOrPm)
  {if((day!="MONDAY"||day!="TUESDAY")||(hour>=19&&amOrPm.equals("PM"))
      ||(hour<=1&&amOrPm.equals("AM"))){
    isOpen = true;
  }else {isOpen=false;}

  }

  public static String getWorkingHours()
  {
    return workingHours;
  }

  public static void setWorkingHours(String workingHours)
  {
    BarInfo.workingHours = workingHours;
  }


}
