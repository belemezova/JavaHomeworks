package interview.basic.lesson_2;

import java.util.Scanner;

public class Repainting {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double nylon=Double.parseDouble(sc.nextLine());
    double paint=Double.parseDouble(sc.nextLine());
    double diluent=Double.parseDouble(sc.nextLine());
    double hours=Double.parseDouble(sc.nextLine());
    double priceNylon=1.5;
    double pricePaint=14.5;
    double priceDiluent=5;
   double sumMaterial=(nylon+2)*priceNylon+paint*1.1*pricePaint+diluent*priceDiluent+0.4;
   double sumForWork=sumMaterial*0.3;
   System.out.println(sumForWork*hours+sumMaterial);
  }
}
/*Румен иска да пребоядиса хола и за целта е наел майстори.
Напишете програма, която изчислява разходите за ремонта, предвид следните цени:
•	Предпазен найлон - 1.50 лв. за кв. метър
•	Боя - 14.50 лв. за литър
•	Разредител за боя - 5.00 лв. за литър
За всеки случай, към необходимите материали,
 Румен иска да добави още 10% от количеството боя
  и 2 кв.м. найлон, разбира се и 0.40 лв. за торбички.
  Сумата, която се заплаща на майсторите за 1 час работа,
   е равна на 30% от сбора на всички разходи за материали.


*/