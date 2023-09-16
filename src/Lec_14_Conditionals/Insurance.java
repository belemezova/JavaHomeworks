package Lec_14_Conditionals;

import java.util.Scanner;

public class Insurance {

  public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);
    double monthSalary=Double.parseDouble(scanner.nextLine());
    int years=Integer.parseInt(scanner.nextLine());
    double taxWorker=0.0;
    double taxBoss=0.0;
    if (monthSalary<=3000){
      if (years<=55){
        taxWorker=0.2*monthSalary;
        taxBoss=0.17*monthSalary;
      }else if (55<years&&years<=60){
        taxWorker=0.13*monthSalary;
        taxBoss=0.13*monthSalary;
      }else if (60<years&&years<=65){
        taxWorker=0.075*monthSalary;
        taxBoss=0.09*monthSalary;
      }else if (years>60){
        taxWorker=0.05*monthSalary;
        taxBoss=0.075*monthSalary;
      }
    }else if(monthSalary>3000){
      taxWorker=0.20*3000;
      taxBoss=0.20*3000;
    }

    System.out.printf("%.2f%n",taxWorker);
    System.out.printf("%.2f%n",taxBoss);
    /*Направете програма, която изчислява осигуровките.

За целта потребителя трябва да въведе следните данни:

месечна заплата
години
Има 2 такси, които се плащат едната от служителя, а другата - от неговият работодател.

Законът изисква:

Ако заплатата е под 3000лв
Ако служителя е на 55 години или по-малко, тогава таксите са: 20%(за работника) + 17%(за работодателя)
Ако служителя е над 55 години до 60 (включително) - 13% + 13%
Ако служителя е над 60 години до 65 (включително) - 7.5% + 9%
Ако служителя е над 65 - 5% + 7.5%
Ако заплатата е над 3000лв, таксите са 20% + 20%, но само върху сумата от 3000лв.
Отпечатайте:

първо колко е таксата за служителя
колко е таксата за работодателя
Не забравяйте, че можете да използвате вложени if-else структури.

Имайте предвид, че мога да платя само до стотинка, но не и до части от стотинката.*/
  }
}
