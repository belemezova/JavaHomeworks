package Lecture_Homework;

import java.util.Scanner;

public class TimeOfMeeting {

  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Please enter the distance between two cities: ");
    double distanceBetweenCities= scanner.nextDouble();
    System.out.println("Please enter the speed of first car: ");
    double speedCarA= scanner.nextDouble();
    System.out.println("Please enter the speed of second car: ");
    double speedCarB= scanner.nextDouble();
    double timeOfMeeting=((distanceBetweenCities)/(speedCarB+speedCarA))*60;
    timeOfMeeting=Math.round(timeOfMeeting);
    int hours=(int)timeOfMeeting/60;
    int minutes=(int)timeOfMeeting%60;
    System.out.printf("The time of meeting is %d hours and %d minutes after the strat: \n", hours,minutes);
    System.out.printf("The meeting will be at %.2f km after first driver left town A: ", (timeOfMeeting*speedCarA)/60);
  }
}
