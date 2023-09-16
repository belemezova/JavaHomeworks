package bg.startit.java.oop.homework1.ood;

import java.util.List;

public class ProjectsToBuid {
 private String nameOfProject;
 private String addressOfBuilding;
 private List<Employee>workers;
 private CompaniesData investor;

 public String getNameOfProject() {
  return nameOfProject;
 }

 public void setNameOfProject(String nameOfProject) {
  this.nameOfProject = nameOfProject;
 }

 public ProjectsToBuid(String nameOfProject, String addressOfBuilding, CompaniesData investor,
     String technicalsupervisor) {
  this.nameOfProject = nameOfProject;
  this.addressOfBuilding = addressOfBuilding;
  this.investor = investor;
  this.technicalsupervisor = technicalsupervisor;
 }

 public String getAddressOfBuilding() {
  return addressOfBuilding;
 }



 public void setAddressOfBuilding(String addressOfBuilding) {
  this.addressOfBuilding = addressOfBuilding;
 }

 public List<Employee> getWorkers() {
  return workers;
 }

 public void setWorkers(List<Employee> workers) {
  this.workers = workers;
 }

 public CompaniesData getInvestor() {
  return investor;
 }

 public void setInvestor(CompaniesData investor) {
  this.investor = investor;
 }

 public String getTechnicalSupervisor() {
  return technicalsupervisor;
 }

 public void setTechnicalsupervisor(String technicalsupervisor) {
  this.technicalsupervisor = technicalsupervisor;
 }

 private String technicalsupervisor;

}
