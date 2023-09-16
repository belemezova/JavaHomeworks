/*
package Lecture_Homework;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

  public static void main(String[] args) {
    int[] arr = new int[10];
    Random ran = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = ran.nextInt(100);
    }
    System.out.println("Before: " + Arrays.toString(arr));
    quickSort(arr, 0, arr.length - 1);
    System.out.println("After: " + Arrays.toString(arr));

  }


  public static void quickSort(int[] ar*/
/**//*
r, int indexL, int indexR) {
    if (indexR-indexL==0) {
      return;
    }
    int pivot ;

    while (indexL < indexR) {
      while (pivot <= arr[indexR] && indexL < indexR) {
        indexR--;
      }
      changePoss(arr, indexL, indexR);//pivot->indexR;
      while (pivot >= arr[indexL] && indexL < indexR) {
        indexL++;
      }


      changePoss(arr, indexR, indexL);//pivot->indexL;

    }

*/
/*if (indexL==0){
  quickSort(arr, 1, arr.length-1);
}else if(indexR== arr.length-1){
  quickSort(arr, 0, arr.length-2);
}else {
  quickSort(arr, 0, indexL-1);
  quickSort(arr, indexL+1, arr.length-1);
}*//*




    return;
  }

  public static void changePoss(int[] arr, int indexL, int indexR) {
    int temp = arr[indexL];
    arr[indexL] = arr[indexR];
    arr[indexR] = temp;
  }
}

//Example of Quick Sort:
//44  33  11  55  77  90  40  60  99  22  88
//Let 44 be the Pivot element and scanning done from right to left
//
//Comparing 44 to the right-side elements, and if right-side elements are smaller than 44, then swap it. As 22 is smaller than 44 so swap them.
//
//  22	33	11	55	77	90	40	60	99	44	88
//Now comparing 44 to the left side element and the element must be greater than 44 then swap them. As 55 are greater than 44 so swap them.
//
//22	33	11	44	77	90	40	60	99	55	88
//Recursively, repeating steps 1 & steps 2 until we get two lists one left from pivot element 44 & one right from pivot element.
//
//22	33	11	40	77	90	44	60	99	55	88
//Swap with 77:
//
//22	33	11	40	44	90	77	60	99	55	88
//Now, the element on the right side and left side are greater than and smaller than 44 respectively.
*/
