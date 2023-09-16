package bg.startit.java.oop.homework1.ood;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Employee {

  int counter = 0;
  static Scanner scanner;
  private List<String> names;

  private String townOfBirth;
  private List<String> address;

  static {
    scanner = new Scanner(System.in);
  }
  private int contractNumber;



  private String position;

  private List<ProjectsToBuid> buildingObject;
  private double salary;




  public int getContractNumber() {
    return contractNumber;
  }

  public void setContractNumber() {
    this.contractNumber = counter;
  }


  public String getNames() {
    String name = String.join(" ", names);
    return name;
  }

  public void setNames(String name) {

    names = Arrays.asList(name.split(" "));

  }
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public String getTownOfBirth() {
    return townOfBirth;
  }

  public void setTownOfBirth(String townOfBirth) {
    this.townOfBirth = townOfBirth;
  }

  public String getAddress() {
    String addresses = String.join("; ", address);

    return addresses;
  }

  public void setAddress(String addresses) {
    address = Arrays.asList(addresses.split(";  "));
  }


  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    if (salary < 0 && salary > 5000) {
      System.out.println("Check again and enter valid salary");
    } else {
      this.salary = salary;
    }

  }


  public Employee() {

    counter++;
  }

  public List<ProjectsToBuid> getBuildingObject() {
    return buildingObject;
  }

  public void setBuildingObject(
      List<ProjectsToBuid> nameOfProject) {
    this.buildingObject = nameOfProject;
  }

  public void setEmployeeDataBase() {
    setContractNumber();
    System.out.println("Please enter employee's first name, surname and last name:");
    setNames(scanner.nextLine());
    System.out.println("please enter employee's birth town:");
    setTownOfBirth(scanner.nextLine());
    System.out.println("Enter the address of an employee separated by \";\"");
    System.out.println("Enter employee position:");
    setPosition(scanner.nextLine());

  }
}
/*
Помислете как бихте представили една компания със служителите и със Java обекти?

Помислете какво е нужно за работата на тази компания.

А кои са важните атрибути на служителите.

Има ли общи атрибути?

Дефинирайте минимум 4 класа.*/