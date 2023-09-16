package Lec_14_Conditionals;

import java.util.Scanner;

public class TaxCalculator {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    double salary = Double.parseDouble(scanner.nextLine());
    double taxCounter = 0.0;
    if (salary <= 20000) {
      taxCounter = 0;
    } else if (20000 < salary && salary <= 40000) {
      taxCounter = (salary - 20000) * 0.1;
    } else if (40000 < salary && salary <= 60000) {
      taxCounter = 2000 + (salary - 40000) * 0.2;
    } else if (salary > 60000) {
      taxCounter = 2000 + 4000 + (salary - 60000) * 0.3;
    }
    System.out.printf("%.2f", taxCounter);

  }
}
