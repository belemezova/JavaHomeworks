package interview.basic.lesson_2;

import java.util.Scanner;

public class SuppliesForSchool {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int pens=Integer.parseInt(sc.nextLine());
    int markers=Integer.parseInt(sc.nextLine());
    int litre=Integer.parseInt(sc.nextLine());
    int discount=Integer.parseInt(sc.nextLine());
    double priceForPen=5.80;
    double priceForMarker=7.2;
    double priceForDetergent=1.2;
    double sum=pens*priceForPen+markers*priceForMarker+litre*priceForDetergent;
    double procent=discount*0.01;
    sum=sum*(1-procent);
    System.out.println(sum);

  }
}
/*Учебната година вече е започнала и отговорничката на 10Б клас -
Ани трябва да купи определен брой пакетчета с химикали, пакетчета с маркери,
 както и препарат за почистване на дъска.
 Тя е редовна клиентка на една книжарница, затова има намаление за нея,
 което представлява някакъв процент от общата сума.
  Напишете програма, която изчислява колко пари ще трябва да събере Ани,
   за да плати сметката, като имате предвид следния ценоразпис:
•	Пакет химикали - 5.80 лв.
•	Пакет маркери - 7.20 лв.
•	Препарат - 1.20 лв (за литър)
Вход
От конзолата се четат 4 числа:
•	Брой пакети химикали - цяло число в интервала [0...100]
•	Брой пакети маркери - цяло число в интервала [0...100]
•	Литри препарат за почистване на дъска - цяло число в интервала [0…50]
•	Процент намаление - цяло число в интервала [0...100]
Изход
Да се отпечата на конзолата колко пари ще са нужни на Ани, за да си плати сметката.
*/