package OOP_Homework1.company;

import java.util.Scanner;

public class Employee {
  private Skills skill = new Skills();
  private Equipment eq = new Equipment("Asus","White","Office Chair");
  private String firstName;
  private String secondName;
  private double salary;
  private int paidAnnualLeave;
  public final String rights = "I know my rights";

  public Employee(){
  }


  public Skills getSkill() {
    return skill;
  }

  public void setSkill(Skills skill) {
    this.skill = skill;
  }

  public Equipment getEq() {
    return eq;
  }

  public void setEq(Equipment eq) {
    this.eq = eq;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    if (salary < 740){
      System.out.println("The Minimal Salary is 740 lv.");
      salary = 740;
    }
    this.salary = salary;
  }

  public int getPaidAnnualLeave() {
    return paidAnnualLeave;
  }

  public void setPaidAnnualLeave(int paidAnnualLeave) {
    if (paidAnnualLeave < 20){
      System.out.println("The Minimum is 20 days");
      paidAnnualLeave = 20;
    }
    this.paidAnnualLeave = paidAnnualLeave;
  }

  public String getRights() {
    return rights;
  }
  public double makeMoney() {
    System.out.println("How many hours did you work this week? ");
    Scanner sc = new Scanner(System.in);
    int money = 0;
    int hours = sc.nextInt();
    if (hours < 40){
      System.out.println("You need to be working at least 40 hours a week!");
      System.out.println("Get Yourself together!");
    }
    else if (hours>40 && hours<55 ){
      System.out.println("That's the spirit! You deserve a reward! ");
      salary += 150;
    }
    else if (hours>55 && hours<90){
      System.out.println("You are working way too hard! You need to rest!");
    }
    else {
      System.out.println("Don't Lie to me :D ");
      hours = 40;
    }
    for (int i = 0; i < hours ; i++) {
      money += 150;
    }
    return money;
  }
}
