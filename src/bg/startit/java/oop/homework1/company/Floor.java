package bg.startit.java.oop.homework1.company;

import java.util.List;

public class Floor {

  private int workspace;
  private List<Employee> employees;

  private int counter=0;

  public Floor() {

  }

  public int getWorkspace() {
    return workspace;
  }

  public void setWorkspace(int workspace) {
    this.workspace = workspace;
  }



  public List<Employee> getEmployees() {
    return employees;
  }

  public void setEmployees(List<Employee> employees) {
    this.employees = employees;
  }
}
