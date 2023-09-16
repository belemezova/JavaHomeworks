package interview.basic.lesson_2;

import java.util.Scanner;

public class RadiansToDegrees {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double number=Double.parseDouble(sc.nextLine());
    double gradus=number*180/Math.PI;
    System.out.println(gradus);

  }
}
/*Напишете програма, която чете ъгъл в радиани (десетично число) и го преобразува в градуси.
Използвайте формулата: градус = радиан * 180 / π.
Числото π в Java програми е достъпно чрез Math.PI.*/