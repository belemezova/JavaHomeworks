package Lec_17_Knowedge;

import java.util.Scanner;

public class Fibonachi {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberFib = Integer.parseInt(scanner.nextLine());
    int prev = 0;
    int next = 1;
    System.out.print(prev + " " + next + " ");
    for (int i = 1; i < numberFib - 1; i++) {
     int sum = prev + next;
      System.out.print(sum + " ");
      prev = next;
      next = sum;
    }
  }
}
/*Направете програма, която отпечатва първите n числа от серията на Фибоначи.

Серията на Фибоначи се състои от числа, където всяко едно число е сбор от
 предишните 2 числа. А първите 2 числа са 0 и 1. Пример: 0, 1, 1, 2, 3, 5, 8, 13, 21, …

Броят на числата n, които трябва да се отпечатат се въвеждат от конзолата.

Отпечатайте числата с един интервал между всяко едно число.
           0                      0
           1 |                    1
           2 |                    1
           3 |                    2
           4 |                    3
           5 |                    5
           6 |                    8
           7 |                   13
           8 |                   21
           9 |                   34
          10 |                   55
          11 |                   89
          12 |                  144
          13 |                  233
          14 |                  377
          15 |                  610
          16 |                  987
          17 |                 1597
          18 |                 2584
          19 |                 4181
          20 |                 6765
          21 |                10946
          22 |                17711
          23 |                28657
          24 |                46368
          25 |                75025
          26 |               121393
          27 |               196418
          28 |               317811
          29 |               514229
          30 |               832040
          31 |              1346269
          32 |              2178309
          33 |              3524578
          34 |              5702887
          35 |              9227465
          36 |             14930352
          37 |             24157817
          38 |             39088169
          39 |             63245986
          40 |            102334155
          41 |            165580141
          42 |            267914296
          43 |            433494437
          44 |            701408733
          45 |           1134903170
          46 |           1836311903
          47 |           2971215073
          48 |           4807526976
          49 |           7778742049
          50 |          12586269025
          51 |          20365011074
          52 |          32951280099
          53 |          53316291173
          54 |          86267571272
          55 |         139583862445
          56 |         225851433717
          57 |         365435296162
          58 |         591286729879
          59 |         956722026041
          60 |        1548008755920
          61 |        2504730781961
          62 |        4052739537881
          63 |        6557470319842
          64 |       10610209857723
          65 |       17167680177565
          66 |       27777890035288*/