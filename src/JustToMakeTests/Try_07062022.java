package JustToMakeTests;

public class Try_07062022 {

  public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    //  System.out.println("Please enter number:");

    char ch = ' ';
    int n1 = 0b001000000;
    int n2 = 0b000000000;

    for (int i = 1; i <= 5; i++) {

      int index = 9;
      for (int j = 1; index >= 6&&j <= 5;  j++) {
        if ((i % 2 == 1) && (j % 2 == 1)) {
          index--;
            switch (i) {
              case 1:
                if ((n1 & (1 << (index-i+1))) != 0) {
                  ch = 'x';
                } else if ((n2 & (1 << (index-i+1))) != 0) {
                  ch = 'o';
                } else {ch=' ';}
                break;
              case 3:
                if ((n1 & (1 << (index-i))) != 0) {
                  ch = 'x';
                } else if ((n2 & (1 << (index-i))) != 0) {
                  ch = 'o';
                }else {ch=' ';}
                break;
              case 5:
                if ((n1 & (1 << (index-i-1))) != 0) {
                ch = 'x';
              } else if ((n2 & (1 << (index-i-1))) != 0) {
                ch = 'o';
              }else {ch=' ';}
                break;
            }
            System.out.printf("%c", ch);

        } else if ((i % 2 == 1) && (j % 2 == 0)) {
          System.out.print("|");
        } else if ((i % 2 == 0) && (j % 2 == 1)) {
          System.out.print("-");
        } else if ((i % 2 == 0) && (j % 2 == 0)) {
          System.out.print("+");
        }
      }
      System.out.println();
    }
  }

}
   /* int player1 = 0b011001001;

    for (int i = 0; i < 3; i += 1) {
      int b = 0b100100100 >> i;
      int num1 = player & (b);
      if (num1 - b == 0) {
        System.out.println("You win!");
        break;
      } else {
        continue;
      }
    }
  }*/

/*switch (count) {


        case 0b100100100:292
        case 0b010010010:146
        case 0b001001001:73
        case 0b100010001:273
        case 0b001010100:84
        */