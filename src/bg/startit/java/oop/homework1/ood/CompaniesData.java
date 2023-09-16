package bg.startit.java.oop.homework1.ood;

import static bg.startit.java.oop.homework1.ood.Employee.scanner;

import java.util.List;

public class CompaniesData {

  private String nameOfTheCompany;
  private String bulstat;
  private String address;
  private String email;
  private String phoneNumber;
  private String contactPerson;
  private double balance;
  private List<String> invoices;



  public CompaniesData() {
  }

  public String getNameOfTheCompany() {
    return nameOfTheCompany;
  }

  public void setNameOfTheCompany(String nameOfTheCompany) {
    this.nameOfTheCompany = nameOfTheCompany;
  }

  public String getBulstat() {
    return bulstat;
  }

  public void setBulstat(String bulstat) {
    this.bulstat = bulstat;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getContactPerson() {
    return contactPerson;
  }

  public void setContactPerson(String contactPerson) {
    this.contactPerson = contactPerson;
  }

  public List<String> getInvoices() {
    return invoices;
  }

  public void setInvoices(List<String> invoices) {
    this.invoices = invoices;
  }


  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setCompany() {

    System.out.println("Please enter companies name:");
    setNameOfTheCompany(scanner.nextLine());
    System.out.println("Please enter bulstat number:");
    setBulstat(scanner.nextLine());
    System.out.println("Enter the address of the company separated by \";\"");
    setAddress(scanner.nextLine());
    System.out.println("Please enter company email:");
    setEmail(scanner.nextLine());
    System.out.println("Please enter company phone number:");
    setPhoneNumber(scanner.nextLine());
    System.out.println("Please enter person for contact info");
    setContactPerson(scanner.nextLine());
  }
}
