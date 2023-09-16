package bg.startit.java.oop.homework1.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Building {
  private List<Floor> floor;

  private ArrayList<Employee> employees = new ArrayList<>();



  private final int floors = 2;
  private final int entrance = 1;
  private final int[] officeNumber = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

  public List<Floor> getFloor() {
    return floor;
  }

  public void setFloor(List<Floor> floor) {
    this.floor = floor;
  }

  //public int getFloors() {
  //  return floors;}


  public int getEntrance() {
    return entrance;
  }

  public int getOfficeNumber() {
    Random random = new Random();
    int office = random.nextInt(20);
    for (int i = 0; i < officeNumber.length; i++) {

      if (officeNumber[i] == 0){
        System.out.println("This office is taken!");
        office = random.nextInt(20);
        continue;}

      if (officeNumber[i] == office){officeNumber[i] = 0;}
    }
    return office;
  }

  public ArrayList<Employee> getEmployees() {
    return employees;
  }

  public void setEmployees(ArrayList<Employee> employees) {
    this.employees = employees;
  }
}
