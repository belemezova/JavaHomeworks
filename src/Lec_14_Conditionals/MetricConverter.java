package Lec_14_Conditionals;

import java.util.Scanner;

public class MetricConverter {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double lengthToConvert = Double.parseDouble(scanner.nextLine());
    String from = scanner.next().toLowerCase();
    String to = scanner.next().toLowerCase();

    switch (from) {
      case "mm":
        lengthToConvert = lengthToConvert / 1000;
        break;
      case "cm":
        lengthToConvert = lengthToConvert / 100;
        break;
      case "mi":
        lengthToConvert = lengthToConvert / 0.000621371192;
        break;
      case "in":
        lengthToConvert = lengthToConvert / 39.3700787;
        break;
      case "km":
        lengthToConvert = lengthToConvert / 0.001;
        break;
      case "ft":
        lengthToConvert = lengthToConvert / 3.2808399;
        break;
      case "yd":
        lengthToConvert = lengthToConvert / 1.0936133;
        break;
      case "m":
        lengthToConvert = lengthToConvert;
        break;
      default:
        System.out.printf("Невалидна метрика %s%n", from);
        return;

    }
    switch (to) {
      case "mm":
        lengthToConvert = lengthToConvert * 1000;
        break;
      case "cm":
        lengthToConvert = lengthToConvert * 100;
        break;
      case "mi":
        lengthToConvert = lengthToConvert * 0.000621371192;
        break;
      case "in":
        lengthToConvert = lengthToConvert * 39.3700787;
        break;
      case "km":
        lengthToConvert = lengthToConvert * 0.001;
        break;
      case "ft":
        lengthToConvert = lengthToConvert * 3.2808399;
        break;
      case "yd":
        lengthToConvert = lengthToConvert * 1.0936133;
        break;
      case "m":
        lengthToConvert = lengthToConvert;
        break;
      default:
        System.out.printf("Невалидна метрика %s%n", to);
        return;

    }
    System.out.printf("%.5f%n", lengthToConvert);


/*
45.6
mi
cm
7338608.64280*/
  }
}
