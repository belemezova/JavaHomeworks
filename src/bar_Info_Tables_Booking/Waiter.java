package bar_Info_Tables_Booking;

import java.math.BigDecimal;

public class Waiter extends Employee {

  private BigDecimal tip;

  public Waiter(String name, BigDecimal dailyWage) {
    super(name);
    this.setDailyWage(dailyWage);
  }

  public BigDecimal getTip() {
    return tip;
  }

  public void setTip(BigDecimal tip) {
    this.tip = tip;
  }
}
