package OOP_Homework4.shape;

public class Elements {
private Integer element;

  public Elements(Integer elements) {
    this.element = elements;
  }

  public Elements() {
  }

  @Override
  public String toString() {
    return "Elements{" +
        "elements=" + element +
        '}';
  }

  public Integer getElement() {
    return element;
  }

  public void setElement(Integer element) {
    this.element = element;
  }
}
