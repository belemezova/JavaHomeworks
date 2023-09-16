package bg.startit.java.oop.homework1.company;

public class Equipment {
  private String laptop;
  private String Desk;
  private String Chair;

  public Equipment(String laptop, String desk, String chair) {
    this.laptop = laptop;
    this.Desk = desk;
    this.Chair = chair;
  }

  public String getLaptop() {
    return laptop;
  }

  public void setLaptop(String laptop) {
    this.laptop = laptop;
  }

  public String getDesk() {
    return Desk;
  }

  public void setDesk(String desk) {
    Desk = desk;
  }

  public String getChair() {
    return Chair;
  }

  public void setChair(String chair) {
    Chair = chair;
  }

  @Override
  public String toString() {
    return "Equipment{" +
        "laptop='" + laptop + '\'' +
        ", Desk='" + Desk + '\'' +
        ", Chair='" + Chair + '\'' +
        '}';
  }
}
