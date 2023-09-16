package Lecture_Homework;

import java.util.Scanner;


public class CaeserCode {

  public static void main(String[] args) {


    Scanner myInput = new Scanner(System.in);
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("Въведете криптиране (1) или декриптиране (2): ");
    byte type = myInput.nextByte();
    System.out.println("Въведете код (n): ");
    int offset = myInput.nextInt();
    String choice = "";
    if (type == 1) {
      choice = "криптиране";
      offset = offset * 1;
    } else if (type == 2) {
      choice = "декриптиране";

      offset = offset * (-1);
    }
    System.out.printf("Въведете текст за %s: ", choice);
    String codeDecode = myInput.next().toUpperCase();
    System.out.println();
    String message = "";
    for (int i = 0; i <=codeDecode.length() - 1; i++) {
      char element;
      int key = alphabet.indexOf(codeDecode.charAt(i));
      if (key + offset >= 26) {
        key = Math.abs(key + offset - 26);
      } else if (key + offset < 0) {
        key = 26 - Math.abs(key + offset);
      }else {key=key+offset;}
      element=alphabet.charAt(key);
      message += element;
    }
    System.out.println(message);

    }
  }
