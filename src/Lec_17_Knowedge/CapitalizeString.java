package Lec_17_Knowedge;

import java.util.Scanner;

public class CapitalizeString {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = new String (scanner.nextLine());
    String strUp;
    String last;
        if (str.charAt(0)!=str.toUpperCase().charAt(0)) {

      strUp=str.substring(0, 1).toUpperCase() + str.substring(1);
    }else strUp=str;
    if(strUp.charAt(strUp.length()-1)!='.'&& strUp.charAt(strUp.length()-1)!='!'
        &&strUp.charAt(strUp.length()-1)!='?'){
      last=strUp.concat(".");
    }else last=strUp;
    System.out.println(last);
  }

}
/*Направете програма, която очаква потребителят да въведе едно цяло изречение.
everybody loves java!
Нека вашата програма прочете изречението и след това,
 ако започва с малка буква да я смени на голяма.
Нека добави точка, ако изречението не завършва
със символ за край на изречението - точка, удивителна или въпросителна.*/