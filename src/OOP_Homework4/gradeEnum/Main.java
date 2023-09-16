package OOP_Homework4.gradeEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {

   Grade grade1=Grade.LOW;
    Grade grade2=Grade.EXCELENT;
    Grade grade3=Grade.SATISFACTORY;
    Grade grade4=Grade.BASIC;
    Grade grade5=Grade.VERY_GOOD;
    Grade grade6=Grade.LOW;
    Grade grade7=Grade.SATISFACTORY;
    Grade grade8=Grade.BASIC;
    Grade grade9=Grade.BASIC;
    Grade grade10=Grade.EXCELENT;
    List<Grade> grades=new ArrayList<>(
        Arrays.asList(grade1,grade2, grade3, grade4, grade5, grade6,grade7, grade8, grade9, grade10));

    grades.sort(null);
    System.out.println(grades);

    };



  }

/*

6 - Excellent 5 - Very good 4 - Satisfactory 3 - Basic 2 - Low
Демонстрирайте с десет оценки, които да сортирате
 с помощта на колекция по числовата им стойност.*/