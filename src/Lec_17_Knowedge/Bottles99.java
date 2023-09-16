package Lec_17_Knowedge;

public class Bottles99 {

  public static void main(String[] args) {
    for (int i = 99; i >= 1; i--) {

      if (i != 1) {
        if (i != 2) {
          System.out.printf("%d bottles of beer on the wall, %d bottles of beer.%n", i, i);
          System.out.printf("Take one down and pass it around, %d bottles of beer on the wall.%n",
              (i - 1));
        } else if (i == 2) {
          System.out.printf("%d bottles of beer on the wall, %d bottles of beer.%n", i, i);
          System.out.printf("Take one down and pass it around, %d bottle of beer on the wall.%n",
              (i - 1));
        }

      } else {
        System.out.printf("%d bottle of beer on the wall, %d bottle of beer.%n", i, i);
        System.out.printf(
            "Take it down and pass it around, no more bottles of beer on the wall.%n");
      }
      System.out.println();
    }
    System.out.printf("No more bottles of beer on the wall, no more bottles of beer.%n");
    System.out.printf("Go to the store and buy some more, 99 bottles of beer on the wall.%n");

  }
}
/*Използвайте цикъл, за да направите програма, която отпечатва текста на класиката:

99 bottles of beer on the wall, 99 bottles of beer.
Take one down and pass it around, 98 bottles of beer on the wall.
…..
2 bottles of beer on the wall, 2 bottles of beer.
Take one down and pass it around, 1 bottle of beer on the wall.

1 bottle of beer on the wall, 1 bottle of beer.
Take it down and pass it around, no more bottles of beer on the wall.

No more bottles of beer on the wall, no more bottles of beer.
Go to the store and buy some more, 99 bottles of beer on the wall.
Важно е между всеки стих да има празен ред!*/