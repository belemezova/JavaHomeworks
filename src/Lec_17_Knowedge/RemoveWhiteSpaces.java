package Lec_17_Knowedge;

import java.util.Scanner;

public class RemoveWhiteSpaces {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String strSent=scanner.nextLine();
    String strRepl=strSent.replaceAll("\\s","");

    System.out.println(strRepl);
  }
}
/*Направете програма, която очаква от потребителя да въведе изречение.

След въвеждане на изречението,
вашата програма трябва да премахне всички празни
символи и табулация от изречението и да го отпечата на екрана.*/