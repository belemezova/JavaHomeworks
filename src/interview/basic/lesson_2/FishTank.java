package interview.basic.lesson_2;

import java.util.Scanner;

public class FishTank {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int length=Integer.parseInt(sc.nextLine());
    int width=Integer.parseInt(sc.nextLine());
    int high=Integer.parseInt(sc.nextLine());
    double percent=Double.parseDouble(sc.nextLine());
    double areaInDm=length*width*high;
    double areaInSm=areaInDm/1000;
    double freeArea=areaInSm*(1-percent/100.0);
    System.out.println(freeArea);

  }
}
/*9.	Аквариум
За рождения си ден Любомир получил аквариум с формата на паралелепипед. 
Първоначално прочитаме от конзолата на отделни редове размерите му 
– дължина, широчина и височина в сантиметри. 
Трябва да се пресметне колко литра вода ще събира аквариума, 
ако се знае, че определен процент от вместимостта му е заета от пясък,
 растения, нагревател и помпа. 
Един литър вода се равнява на един кубичен дециметър/ 1л=1 дм3/. 
Да се напише програма, която изчислява литрите вода, 
която са необходими за напълването на аквариума.
Вход
От конзолата се четат 4 реда:
1.	Дължина в см – цяло число в интервала [10 … 500]
2.	Широчина в см – цяло число в интервала [10 … 300]
3.	Височина в см – цяло число в интервала [10… 200]
4.	Процент  – реално число в интервала [0.000 … 100.000]
Изход
Да се отпечата на конзолата едно число:
•	литрите вода, които ще събира аквариума.
*/