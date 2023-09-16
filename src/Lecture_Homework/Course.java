package Lecture_Homework;

import java.util.ArrayList;

public class Course {

    private ArrayList<Student> listOfStudents=new ArrayList<>();
    public ArrayList<Student>getListOfStudents(){
      return listOfStudents;
    }

  public void setListOfStudents(ArrayList<Student> listOfStudents) {
    this.listOfStudents = listOfStudents;
  }
}
