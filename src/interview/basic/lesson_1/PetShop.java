package interview.basic.lesson_1;

import java.util.Scanner;

public class PetShop {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dogsFood = Integer.parseInt(sc.nextLine());
    int catsFood = Integer.parseInt(sc.nextLine());
    double price = dogsFood * 2.5 + catsFood * 4;
    System.out.println(price + " lv.");
  }
}
/*Напишете програма, която пресмята нужните разходи за закупуването
на храна за кучета и котки.  Храната се пазарува от зоомагазин,
като една опаковка храна за кучета е на цена 2.50 лв, а опаковка храна за котки струва 4 лв.
От конзолата се четат 2 реда:
1.	Броят на опаковките храна за кучета – цяло число в интервала [0… 100]
2.	Броят на опаковките храна за котки –  цяло число в интервала [0… 100]
Изход
На конзолата се отпечатва:
"{крайната сума} lv."
*/