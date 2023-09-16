package JustToMakeTests;
import java.util.Arrays;
import java.util.Scanner;
public class TestCode {
  static String[] boxes = {"   @   ", "  @@@  ", " @@@@@ ", "   |   "};

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int moves = 0;
    int[][] matrix = {{0, 1, 2}, {3, 3, 3}, {3, 3, 3}};

    while (Arrays.stream(matrix[1]).sum() > 3 && Arrays.stream(matrix[2]).sum() > 3) {
      printTower(matrix);
      System.out.println( "Make your move: from + (space) + to");
      String[] tokens = scanner.nextLine().split(" ");
      int from = Integer.parseInt(tokens[0]) - 1;
      int to = Integer.parseInt(tokens[1]) - 1;
      if (from < 0 || from > 2 || to > 2 || to < 0) {
        continue;
      }

      int ring = 3;
      int ringIndex = -1;
      for (int i = 0; i < matrix[from].length; i++) {
        if (matrix[from][i] != 3) {
          ring = matrix[from][i];
          ringIndex = i;
          break;
        }
      }

      for (int i = matrix[to].length - 1; i >= 0; i--) {
        if (matrix[to][i] < ring) {
          break;
        }
        if (matrix[to][i] == 3) {
          matrix[to][i] = ring;
          matrix[from][ringIndex] = 3;
          moves++;
          break;
        }
      }
    }

    printTower(matrix);
    System.out.printf("You won! Total moves: %d\n", moves);
  }

  static void printTower(int[][] tower) {
    System.out.println();
    for (int i = 0; i < tower.length; i++) {
      for (int[] ints : tower) {
        System.out.printf("%-7s", boxes[ints[i]]);
      }
      System.out.println();
    }
    System.out.printf("%s\n", "#".repeat(21));
  }

}
