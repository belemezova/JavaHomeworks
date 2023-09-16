package bg.startit.java.oop.homework1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<String> words1=new LinkedList<String>();
    List<String> words = new ArrayList<>();
    ArrayList<String> word2 = new ArrayList<>();
    LinkedList<String> word3 = new LinkedList<>();
    test(words);
    test(words1);
    test(word2);
    test(word3);



    List<Object> words6=new ArrayList<>();
  }

  public static void test(List<String> me) {
    System.out.println();
  }
}