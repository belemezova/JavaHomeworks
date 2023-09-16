package Lec_20_2dArray;



public class PascalTriangle {

  public static void main(String[] args) {

    int n=5;


    int [][]triangle=new int[n][];
    for (int i = 0; i < n; i++) {
      triangle[i]=new int[i+1];
      triangle[i][0]=1;
      triangle[i][i]=1;
      for (int j = 1; j < i; j++) {
        triangle[i][j]=triangle[i-1][j-1]+triangle[i-1][j];
      }
    }
    for (int i = 0; i < triangle.length; i++) {
      for (int j = 0; j < triangle[i].length; j++) {
        System.out.print(triangle[i][j]+" ");
      }
      System.out.println();
    }
  }

}
/*
1
1 1
1 2 1*/