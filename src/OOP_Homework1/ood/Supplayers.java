package OOP_Homework1.ood;

import java.util.List;

public class Supplayers {

  private CompaniesData supplayCompany;
  private List<String> products;


  public Supplayers() {
  }


  public CompaniesData getSupplayCompany() {
    return supplayCompany;
  }


  public void setSupplayCompany(CompaniesData supplayCompany) {
    this.supplayCompany = supplayCompany;
  }

  public List<String> getProducts() {
    return products;
  }

  public void setProducts(List<String> products) {
    this.products = products;
  }

}
