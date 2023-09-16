package bar_Info_Tables_Booking;

import java.math.BigDecimal;

public class SecurityMan extends Employee {

  private BigDecimal wallet;

  public SecurityMan(String name, BigDecimal dailyWage) {
    super(name);
    this.setDailyWage(dailyWage);
  }

  public BigDecimal getWallet() {
    return wallet;
  }

  public void setWallet(BigDecimal wallet) {
    this.wallet = wallet;
  }
}
