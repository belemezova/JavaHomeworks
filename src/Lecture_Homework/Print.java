package Lecture_Homework;

import java.util.Arrays;

public class Print {

  public static void printHangPlatform(int mistakes) {
    Character[] body = new Character[7];
    Arrays.fill(body, ' ');
    switch (mistakes) {
      case 6:
        body[6] = '\\';

      case 5:
        body[5] = '/';

      case 4:
        body[4] = '\\';

      case 3:
        body[3] ='/';

      case 2:
        body[2] ='|';

      case 1:
        body[1] = ')';
        body[0] = '(';
        break;
      default:
        break;

    }
    System.out.printf("\t _________\n" +
            "\t|         |\n" +
            "\t|         |\n" +
            "\t|        %c %c\n" +
            "\t|        %c%c%c\n" +
            "\t|        %c %c\n" +
            "\t|             \n" +
            "\t|             \n" +
            "\t|             \n" +
            "\t\b======            \n", body[0], body[1], body[3],
        body[2], body[4], body[5], body[6]);
  }

  public static void main(String[] args) {

    printHangPlatform(5 );
  }
}
