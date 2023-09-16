package JustToMakeTests.Lec02072022;

import java.util.ArrayList;

public class Course {
  private ArrayList<Student> listOfStudents = new ArrayList<>();

  public ArrayList<Student> getListOfStudents() {
    return listOfStudents;
  }

  public void setListOfStudents(ArrayList<Student> listOfStudents) {
    this.listOfStudents = listOfStudents;
  }

  public void addStudent(Student student){
    this.listOfStudents.add(student);
  }


  public void removeStudents(ArrayList<String> names, ArrayList<Integer> grades){

    for (int i = grades.size() - 1; i >= 0; i--) {
      if (grades.get(i) == 2){
        grades.remove(i);
        names.remove(i);
      }
    }
  }

  public  static void removeGrades(ArrayList<Integer> grades){

    while (grades.contains(2)){
      grades.remove(Integer.valueOf(2));
    }

  }
  public static void bonusGrade(ArrayList<Integer> grades){

    int oldGrade;
    for (int i = 0; i < grades.size(); i++) {
      if (grades.get(i) == 2 || grades.get(i) == 3) {
        oldGrade = grades.get(i);
        grades.set(i, oldGrade + 1);
      }
    }
  }
  public double getAverageGrade() {

    double sum = 0;

    for (Student student : listOfStudents) {
      sum += student.getGrade();
    }

    return sum / listOfStudents.size();
  }

  public static int getHighestGrade(ArrayList<Integer> grades) {

    int highest = 2;

    for (int grade : grades) {
      if (grade > highest) {
        highest = grade;
      }
    }

    return highest;
  }

  public static int getNumberWithHighestGrade(ArrayList<Integer> grades) {

    int highest = getHighestGrade(grades);
    int counter = 0;

    for (int i = 0; i < grades.size(); i++) {

      if (grades.get(i) == highest) {
        counter++;
      }
    }
    return counter;
  }

  public String printNames() {

    StringBuilder failedStudents = new StringBuilder();

    for (int i = 0; i < listOfStudents.size(); i++) {
      if (listOfStudents.get(i).getGrade() == 2) {
        failedStudents.append(listOfStudents.get(i).getName() + " ");
      }
    }
    return failedStudents.toString();
  }

}
