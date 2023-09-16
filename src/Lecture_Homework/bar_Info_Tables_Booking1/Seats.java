package Lecture_Homework.bar_Info_Tables_Booking1;

public enum Seats
{
  Table1( "T1", 6),
  Table2( "T2", 4),
  Table3( "T3", 4),
  Table4( "T4", 2),
  Table5( "T5", 2),
  Table6( "T6", 4),

  BAR_CHAIR1("BAR_CH1",1),
  BAR_CHAIR2("BAR_CH2",1),
  BAR_CHAIR3("BAR_CH3",1),
  BAR_CHAIR4("BAR_CH4",1),
  BAR_CHAIR5("BAR_CH5",1),
  BAR_CHAIR6("BAR_CH6",1),
  BAR_CHAIR7("BAR_CH7",1),
  BAR_CHAIR8("BAR_CH8",1);

  private String name;
  private int capacity;



  private Seats( String name, int capacity)
  {
    this.name = name;
    this.capacity = capacity;


  }


  public String getName()
  {
    return name;
  }



  public int getCapacity()
  {
    return capacity;
  }



}
