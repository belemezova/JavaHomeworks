package OOP_Homework1.carFactory2;


public class Car {

  private Engine engine;
  private String[] premium=new String[5];
  private String brand;
  private String model;
  private String body;
  private String color;

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  private double length;
  private double width;
  private double kg;
  public int numberCars;
  private double price;


  public Car() {
    numberCars++;
  }
  public Car(String brand, String model, String body, String color, double length, double width, double kg, double price){
    this();
    setBrand(brand);
    setModel(model);
    setBody(body);
    setColor(color);
    setLength(length);
    setWidth(width);
    setKg(kg);
    setPrice(price);
  }



  public String[] getPremium() {
    return premium;
  }



  public void setPremium(String[] premium) {
    this.premium = premium;
  }

  private int priceForPremium(String[] premium) {
    int sum = 0;
    for (int i = 0; i < premium.length; i++) {
      switch (premium[i]) {
        case "air-conditioner":
          sum += 1500;
          break;
        case "navigation":
          sum += 500;
          break;
        case "speed control":
          sum += 350;
          break;
        case "automatic":
          sum += 3000;
          break;
        case "electric windows":
          sum += 250;
          break;
      }
    /* климатик,
цената на колата трябва да се увеличи с 1500лв, Навигация – 500лв., Темпомат – 350лв.,
Автоматик – 3000лв. и ел. стъкла – 250лв.*/

    }
    return sum;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getKg() {
    return kg;
  }

  public void setKg(double kg) {
    this.kg = kg;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price + this.priceForPremium(getPremium());
  }

  @Override
  public String toString() {
    String extra = "";
    if (premium.length == 0) {
      extra = "This car is not equipped with any extras";
    } else {
extra= premium.toString();
    }
    return "Car{" +
        ", brand='" + brand + '\'' +
        ", model='" + model + '\'' +
        ", body='" + body + '\'' +
        ", color='" + color + '\'' +
        ", length=" + length +
        ", width=" + width +
        ", kg=" + kg +
        ", engine=" + engine +
        ", price=" + price +
        ", PREMIUM=" + extra.toString()+
        '}';
  }
}
  /*

Дефинирайте следните класове – Car и Demo с main метод.
Car -> Колата има марка, модел, тип каросерия, цвят, дължина, ширина, тегло, тип двигател
 (бензин, дизел, хибрид, електрически), цена и екстри (опционални).
Възможните екстри са -> Климатик, Автоматик, Навигация, Темпомат или Ел. стъкла.
Брой произведени коли за деня
Обща стойност на произведените коли
Колко коли са произведени с екстри?
Колко коли са произведени с различните типове двигатели?
Принтирайте всички произведени коли с тяхната информация по реда на въвеждането им,
като ако колата няма екстри, трябва да изписвате “This car is not equipped with any extras”



Добавете класа Engine който да представлява двигателя на колата.
Двигателят има модел, мощност, обем и тип(дизел, бензин, хибридили електрическа).
Направете необходимите модификации в програмата т. че да удовлетворява следните условия:
Преди да започнете да произвеждате коли, трябва да произведете двигателите
и да им зададете стойности на полетата – поне по 1 от всеки тип.
След това в класа трябва да прочетете число N, обозначаващо броят на колите,
 които трябва да произведете за деня.
.*/