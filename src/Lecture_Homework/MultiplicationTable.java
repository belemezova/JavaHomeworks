package Lecture_Homework;

public class MultiplicationTable {

  public static void main(String[] args) {
  final String BOOKS="\uD83D\uDCDA";
  String frame="----------------------------";
    System.out.printf("\u001B[92m%n%n");
   System.out.printf("%80S\u001B[92m", "multiplication table");
    System.out.println();
    System.out.printf("%s\u001B[92m",frame+frame+frame+frame+frame+frame);
    System.out.println();
    for (int i = 1; i <=10 ; i++) {
      for (int j = 1; j <=10 ; j++) {
        System.out.printf("%s%-1d * %-2d = %-3d%3s\u001B[92m", "  ",j,i,(i*j), " | ");
      }
      System.out.println();
    }
    System.out.printf("%s","  "+ frame+frame+frame+frame+frame+frame);
/*1. Изведете таблицата за умножение на числата от 1 до 10 в табличен вид.*/
  }
}

