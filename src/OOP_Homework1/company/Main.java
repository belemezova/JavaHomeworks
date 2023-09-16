package OOP_Homework1.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Company company = new Company();
    List<Company> companies = new ArrayList<>();
    companies.add(company);

    Building build = new Building();

    Floor floor1 = new Floor();
    Floor floor2 = new Floor();

    Employee employee1 = new Employee();
    Employee employee2 = new Employee();

    Skills skill = new Skills();

    employee1.setSkill(skill);
    employee2.setSkill(skill);

    List<Employee> employees = new ArrayList<>();
    employees.add(employee1);

    List<Employee> employees1 = new ArrayList<>();
    employees1.add(employee2);
    // employees1.add(employee1);

    floor1.setEmployees(employees);
    floor2.setEmployees(employees1);

    List<Floor> floors = new ArrayList<>();
    floors.add(floor1);
    floors.add(floor2);

    build.setFloor(floors);

    List<Building> buildings = new ArrayList<>();
    buildings.add(build);

    company.setBuildings(buildings);
    company.setCompanyName("MyCompany");

//    company.getBuildings().get(0).getFloor().get(0).getEmployees().add(employee1);

    System.out.printf("The Company with name: %s has %d buildings.%n", company.getCompanyName(),
        company.getBuildings().size());

    for (int i = 0; i < company.getBuildings().size(); i++) {
      System.out.printf("The building %d has %d floors.%n", i + 1,
          company.getBuildings().get(i).getFloor().size());
      for (int j = 0; j < company.getBuildings().get(i).getFloor().size(); j++) {
        System.out.printf("Floor %d has %d employees.%n", j + 1,
            company.getBuildings().get(i).getFloor().get(j).getEmployees().size());
        for (int k = 0; k < company.getBuildings().get(i).getFloor().get(j).getEmployees().size();
            k++) {
          System.out.printf("Employee %d's name is %s.%n", k + 1,
              company.getBuildings().get(i).getFloor().get(j).getEmployees().get(k).getFirstName());
        }
      }
    }

  }
}

