package OOP_Homework1.carFactory1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo {
static int sum=0;
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter number of cars you are going to produce today: ");
    int carsPerDay = Integer.parseInt(scanner.nextLine());
    Car[] car1=new Car[carsPerDay];
    List<String> engineCar = new ArrayList<>();
    double daysProfit = 0;
    int carsWithExtra = 0;
    for (int i = 0; i < carsPerDay; i++) {
      System.out.println(
          "Please enter the brand of car, model, type of body, color, length, width, kg, engine and price, separated by comma: ");
      Car car = new Car();
      String carInput = scanner.nextLine();
      List<String> carInfo = Arrays.asList(carInput.split(", "));
      car.setBrand(carInfo.get(0));
      car.setModel(carInfo.get(1));
      car.setBody(carInfo.get(2));
      car.setColor(carInfo.get(3));
      car.setLength(Double.parseDouble(carInfo.get(4)));
      car.setWidth(Double.parseDouble(carInfo.get(5)));
      car.setKg(Double.parseDouble(carInfo.get(6)));
      car.setEngine(carInfo.get(7));
      engineCar=typeOfEngineCars(car.getEngine());
      double priceWithoutExtra = Double.parseDouble(carInfo.get(8));
      if ((i + 1) % 2 == 0) {
        System.out.println("Please enter at least two premiums separated by comma: ");
        car.setPremium(scanner.nextLine().split(", "));
      } else {
        System.out.println(
            "Please enter all premiums separated by comma. If there is no extra, just press enter: ");

        car.setPremium(scanner.nextLine().replaceAll("\n", "").split(", "));
      }
      car.setPrice(priceWithoutExtra);
      car1[i]=car;
      daysProfit += car.getPrice();
      if (car.getPremium().length != 0) {
        carsWithExtra++;
      }
    }
    System.out.printf("There are %d cars produced in a day%n", carsPerDay);
    System.out.println("The price for the whole production is: " + daysProfit);
    System.out.printf("There is %d cars produced with premiums%n", carsWithExtra);
    System.out.println( "Here is the list with number of cars of each type of engine produced today: "
            + engineCar);
    System.out.println(Arrays.toString(car1));
  }

  public static List<String> typeOfEngineCars(String engine) {
    List<String> enginesType = new ArrayList<>();

    switch (engine) {
        case "gasoline":
          sum++;
          enginesType.add(0, ("gasoline - " + sum));
          break;
        case "diesel":
          sum++;
          enginesType.add(1, ("diesel - " + sum));
          break;
        case "hybrid":
          sum++;
          enginesType.add(2,("hybrid - " + sum));
          break;
        case "electric":
          sum++;
          enginesType.add(3, ("electric - " + sum));
          break;
    }
    return enginesType;

  }
}
/*Demo -> Прочетете число N, обозначаващо броя на колите, които трябва да произведете за деня.
Всяка втора кола трябва да бъде оборудвана с поне 2 екстри, като ако има климатик,
цената на колата трябва да се увеличи с 1500лв, Навигация – 500лв., Темпомат – 350лв.,
Автоматик – 3000лв. и ел. стъкла – 250лв.
След като завърши производството на колите, трябва да изкарате на конзолата следната статистика:

Брой произведени коли за деня
Обща стойност на произведените коли
Колко коли са произведени с екстри?
Колко коли са произведени с различните типове двигатели?
Принтирайте всички произведени коли с тяхната информация по реда на въвеждането им,
като ако колата няма екстри, трябва да изписвате “This car is not equipped with any extras”
Toyota, AygoXJoy, cuv, white, 3.7, 1.74, 980.0, gasoline, 28900
electric windows, speed control, air-conditioner, automatic
VW, PoloRLine, hatchback, blue, 4.074, 1.751, 1100, gasoline, 56111*/