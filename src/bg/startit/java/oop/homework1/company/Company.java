package bg.startit.java.oop.homework1.company;

import java.util.ArrayList;
import java.util.List;

public class Company {
  private List<Building> buildings = new ArrayList<>();
  private String companyName;

  public List<Building> getBuildings() {
    return buildings;
  }

  public void setBuildings(List<Building> buildings) {
    this.buildings = buildings;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }
}
