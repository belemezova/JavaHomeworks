package bar_Info_Tables_Booking;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Staff {

  private Employee firstWaiter = new Waiter("Mariq", new BigDecimal("30"));
  private Employee secondWaiter = new Waiter("Tanq", new BigDecimal("30"));
  private Employee firstBartender = new Bartender("Nikolay", new BigDecimal("35"));
  private Employee secondBartender = new Bartender("Krasimir", new BigDecimal("35"));
  private Employee securityMan = new SecurityMan("Ivan", new BigDecimal("30"));
  private Employee chef = new Chef("Konstantin", new BigDecimal("40"));

  private ArrayList<Employee> employees;

  private Employee firstGuitarMan = new Employee("Mitko");
  private Employee secondGuitarMan = new Employee("Dilyan");
  private Employee drumsMan = new Employee("Toshko");
  private Employee vocalMan = new Employee("Stefan");

  private TributeBand tributeBand = new TributeBand("BloodyCode");

  public Staff() {
    this.employees = fillEmployees();
    this.tributeBand.setBandMembers(fillBandMembers());
  }

  public Employee getFirstWaiter() {
    return firstWaiter;
  }

  public Employee getSecondWaiter() {
    return secondWaiter;
  }

  public Employee getFirstBartender() {
    return firstBartender;
  }

  public Employee getSecondBartender() {
    return secondBartender;
  }

  public Employee getSecurityMan() {
    return securityMan;
  }

  public Employee getChef() {
    return chef;
  }

  public ArrayList<Employee> getEmployees() {
    return employees;
  }

  public Employee getFirstGuitarMan() {
    return firstGuitarMan;
  }

  public Employee getSecondGuitarMan() {
    return secondGuitarMan;
  }

  public Employee getDrumsMan() {
    return drumsMan;
  }

  public Employee getVocalMan() {
    return vocalMan;
  }

  public TributeBand getTributeBand() {
    return tributeBand;
  }

  private ArrayList<Employee> fillEmployees() {

    return new ArrayList<>(
        List.of(firstWaiter, secondWaiter, firstBartender, secondBartender, securityMan, chef));
  }

  private ArrayList<Employee> fillBandMembers() {
    return new ArrayList<>(List.of(firstGuitarMan, secondGuitarMan, drumsMan, vocalMan));
  }
}