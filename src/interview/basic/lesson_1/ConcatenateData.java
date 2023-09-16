package interview.basic.lesson_1;

import java.util.Scanner;

public class ConcatenateData {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String firstName=sc.nextLine();
    String lastName=sc.nextLine();
    int age=Integer.parseInt(sc.nextLine());
    String town=sc.nextLine();
    System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, town);

  }

}
/*Напишете програма, която прочита от конзолата име, фамилия, възраст и
град и печата следното съобщение:
"You are <firstName> <lastName>,
 a <age>-years old person from <town>."*/