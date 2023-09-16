package Lecture_Homework;

public class Matrix {

  public static void main(String[] args) {
    int[] arr = {3, 10,11, 7, 2, 2, 5, 6, 7, 8,9, 3, 0, 0, 1, 5, 6,7,8,9,10,12,15,16,18};
    int minElem = arr[0];
    int counter = 1;
    int index=0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j <arr.length ; j++) {
        if (minElem<arr[j+1]){
          minElem=arr[j];
          index=j;
        }
      }

    }
  /*  int index=0;

    for (int i = 0; i < arr.length - 1; i++) {

      if (arr[i] < arr[i + 1]) {
       counter++;
        if (counter > maxCount) {
          maxCount = counter;
        index=i+1;
        }
      } else {
        counter = 1;
      }
    }
    System.out.println(maxCount);
    System.out.println(index);
    for (int i = index-maxCount+1; i <= index; i++) {

    System.out.print(arr[i]+" ");
    }*/
  }
}