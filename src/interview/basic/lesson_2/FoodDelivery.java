package interview.basic.lesson_2;

import java.util.Scanner;

public class FoodDelivery {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int chickenMenu=Integer.parseInt(sc.nextLine());
    int fishMenu=Integer.parseInt(sc.nextLine());
    int veganMenu=Integer.parseInt(sc.nextLine());
    double priceChicken=10.35;
    double priceFish=12.4;
    double priceVegan=8.15;
    double sumWithoutDesert=chickenMenu*priceChicken+fishMenu*priceFish+veganMenu*priceVegan;
    double desert=sumWithoutDesert*0.2;
    double paying=sumWithoutDesert+desert+2.5;
    System.out.println(paying);

  }
}
/*Ресторант отваря врати и предлага няколко менюта на преференциални цени:
•	Пилешко меню –  10.35 лв.
•	Меню с риба – 12.40 лв.
•	Вегетарианско меню  – 8.15 лв.
Напишете програма, която изчислява колко ще струва на група хора да си поръчат храна за вкъщи.
Групата ще си поръча и десерт, чиято цена е равна на 20% от общата сметка (без доставката).
Цената на доставка е 2.50 лв и се начислява най-накрая.
Вход
От конзолата се четат 3 реда:
•	Брой пилешки менюта – цяло число в интервала [0 … 99]
•	Брой менюта с риба – цяло число в интервала [0 … 99]
•	Брой вегетариански менюта – цяло число в интервала [0 … 99]
Изход
Да се отпечата на конзолата един ред:  "{цена на поръчката}"
*/