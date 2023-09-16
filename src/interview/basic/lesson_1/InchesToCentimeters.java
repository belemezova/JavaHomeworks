package interview.basic.lesson_1;

import java.util.Scanner;

public class InchesToCentimeters {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      double a = Double.parseDouble(sc.nextLine());
    while (true) {
      System.out.println(a * 2.54);
      String next=sc.nextLine();
      if (("Stop".equals(next))) {
        break;
      }else a=Double.parseDouble(next);
    }

  }

}
/*Да се напише програма, която чете от конзолата реално число
и го преобразува от инчове в сантиметри.
За целта умножете инчовете по 2.54 (1 инч = 2.54 сантиметра).*/