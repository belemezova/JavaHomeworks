package bar_Info_Tables_Booking;

import java.math.BigDecimal;
import java.util.ArrayList;

public class TributeBand {

  private String name;
  ArrayList<Employee> bandMembers;
  private BigDecimal bandHonorarium;

  public TributeBand(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<Employee> getBandMembers() {
    return bandMembers;
  }

  public void setBandMembers(ArrayList<Employee> bandMembers) {
    this.bandMembers = bandMembers;
  }

  public BigDecimal getBandHonorarium() {
    return bandHonorarium;
  }

  public void setBandHonorarium(BigDecimal bandHonorarium) {
    this.bandHonorarium = bandHonorarium;
  }
}
