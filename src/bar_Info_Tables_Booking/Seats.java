package bar_Info_Tables_Booking;

public enum Seats
{
  TABLE1( "T1", 6),
  TABLE2( "T2", 4),
  TABLE3( "T3", 4),
  TABLE4( "T4", 4),
  TABLE5( "T4", 4),
  TABLE6( "T4", 2),
  TABLE7( "T5", 2),
  TABLE8( "T6", 2),

  BAR_CHAIR1("BAR_CH1", 1),
  BAR_CHAIR2("BAR_CH2", 1),
  BAR_CHAIR3("BAR_CH3", 1),
  BAR_CHAIR4("BAR_CH4", 1),
  BAR_CHAIR5("BAR_CH5", 1),
  BAR_CHAIR6("BAR_CH6", 1),
  BAR_CHAIR7("BAR_CH7", 1),
  BAR_CHAIR8("BAR_CH8", 1);

  private String name;
  private int capacity;



  private Seats( String name, int capacity)
  {
    this.name =name;
    this.capacity =capacity;


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
