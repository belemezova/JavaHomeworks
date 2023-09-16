package interview.basic.lesson_1;

import java.util.Scanner;

public class YardGreening {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Double area = Double.parseDouble(sc.nextLine());
    Double priceWithoutDiscount = area * 7.61;
    int procent = 18;
    double discount = priceWithoutDiscount * procent / 100;
    Double priceForPaying = priceWithoutDiscount -discount;
    System.out.println("The final price is: " + priceForPaying + " lv.");
    System.out.printf("The discount is: %5.2f lv.%n", discount);

  }
}
/*Напишете програма, която изчислява необходимате сума,
които Божидара ще трябва да заплати на фирмата изпълнител на проекта.
 Цената на един кв. м. е 7.61 лв със ДДС. Понеже нейният двор е доста голям,
 фирмата изпълнител предлага 18% отстъпка от крайната цена.
Вход
От конзолата се прочита само един ред:
1.	Кв. метри, които ще бъдат озеленени – реално число в интервала [0.00 … 10000.00]
Изход
На конзолата се отпечатват два реда:
•	"The final price is: {крайна цена на услугата} lv."
•	"The discount is: {отстъпка} lv."
*/