package bar_Info_Tables_Booking;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class TestNewDesign
{
  public static void main(String[] args)
  {
    Map<String, Integer> choices=new LinkedHashMap<>();
    int i = 0;
    for (SeatCapasity s : SeatCapasity.values()) {

      choices.put(s.getName(), s.getCapacity()) ;
      i++;
    }
    choices.put("Standing",10);
    System.out.println(choices);
    String setPlace = (String) JOptionPane.showInputDialog(
        null,
        "Choose place",
        "Choose SeatPlace",
        JOptionPane.QUESTION_MESSAGE,
        null,
        choices.keySet()
               .toArray(),
        choices.entrySet().toArray());

    System.out.println("Your choice is: " + setPlace);
  }


  public enum SeatCapasity
  {
    Table1("T1", 4, IsAble.ENABLE),
    Table2("T2", 4, IsAble.ENABLE),
    Table3("T3", 4, IsAble.ENABLE),
    Table4("T4", 2, IsAble.ENABLE),
    Table5("T5", 2, IsAble.ENABLE),
    Table6("T6", 6, IsAble.ENABLE),

    BAR_CHAIR1("BAR_CH1", 1, IsAble.ENABLE),
    BAR_CHAIR2("BAR_CH2", 1, IsAble.ENABLE),
    BAR_CHAIR3("BAR_CH3", 1, IsAble.ENABLE),
    BAR_CHAIR4("BAR_CH4", 1, IsAble.ENABLE),
    BAR_CHAIR5("BAR_CH5", 1, IsAble.ENABLE),
    BAR_CHAIR6("BAR_CH6", 1, IsAble.ENABLE),
    BAR_CHAIR7("BAR_CH7", 1, IsAble.ENABLE),
    BAR_CHAIR8("BAR_CH8", 1, IsAble.ENABLE);

    private String name;
    private int    capacity;
    private IsAble status;


    private SeatCapasity(String name, int capacity, IsAble status)
    {
      this.name = name;
      this.capacity = capacity;
      this.status = status;

    }


    public String getName()
    {
      return name;
    }

    public IsAble getStatus()
    {
      return status;
    }

    public int getCapacity()
    {
      return capacity;
    }

    public IsAble checker(String name)
    {
      if ((SeatCapasity.valueOf(name).capacity) != 0) {
        return IsAble.DISABLE;
      }
      else {
        return IsAble.ENABLE;
      }

    }

  }

  public enum IsAble
  {
    ENABLE,
    DISABLE
  }

}

/*gfg.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v));*/