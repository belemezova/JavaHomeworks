package OOP_Homework4.carFactory;

public class Ford extends Car {


  private int year;
  private double manufacturerDiscount;

  public Ford() {
  }

  public Ford(double speed, double regularPrice, String color, int year, double manufacturerDiscount) {
    super(speed, regularPrice,color);
    setYear(year);
    setManufacturerDiscount( manufacturerDiscount);
  }


  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    if(year>0){
    this.year = year;}
  }

  public double getManufacturerDiscount() {
    return manufacturerDiscount;
  }

  public void setManufacturerDiscount(double manufacturerDiscount) {
    this.manufacturerDiscount = manufacturerDiscount;
  }



  @Override
  public double getSalePrice() {
    return super.getRegularPrice()-getManufacturerDiscount();
  }
}
/*Създайте клас Ford който наследява Car и има следните атрибути и методи
year
manufacturerDiscount
getSalePrice() т. че от цената изчислена в класа Car да се извади manufacturerDiscount*/