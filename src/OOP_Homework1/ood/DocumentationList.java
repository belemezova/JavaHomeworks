package OOP_Homework1.ood;

public class DocumentationList {

  private CompaniesData nameOfCompany;
  private ProjectsToBuid project;
  private String filePath;


  public DocumentationList() {
  }


  public CompaniesData getNameOfCompany() {
    return nameOfCompany;
  }

  public void setNameOfCompany(CompaniesData nameOfCompany) {
    this.nameOfCompany = nameOfCompany;
  }

  public ProjectsToBuid getProject() {
    return project;
  }

  public void setProject(ProjectsToBuid project) {
    this.project = project;
  }

  public String getFilePath() {
    return filePath;
  }

  public void setFilePath() {
    this.filePath = "C:\\Users\\zaham\\Desktop"+nameOfCompany.toString();
  }


}
