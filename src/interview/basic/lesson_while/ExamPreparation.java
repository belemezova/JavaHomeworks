package interview.basic.lesson_while;

import java.util.Scanner;

public class ExamPreparation {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numberValues = Integer.parseInt(sc.nextLine());
    int counterBadGrade = 0;
    int counterGrade = 0;
    int sumGrade=0;
    double averageGrade = 0.0;
    String lastProblem="";
    while (true) {
      String nameProblem = sc.nextLine();
      if ("Enough".equals(nameProblem)) {
        System.out.printf("Average score: %.2f%n", averageGrade);
        System.out.println("Number of problems: " + counterGrade);
        System.out.println("Last problem: " + lastProblem);
        break;
      }
      lastProblem=nameProblem;
      int grade = Integer.parseInt(sc.nextLine());
      counterGrade += 1;
      sumGrade+=grade;
      averageGrade=sumGrade*1.0/counterGrade;
      if (grade <= 4) {
        counterBadGrade += 1;
      }
      if (counterBadGrade == numberValues) {
        System.out.printf("You need a break, %d poor grades.%n", counterBadGrade);
        break;
      }
    }
  }
}
/*Напишете програма, в която Марин решава задачи от изпити,
докато не получи съобщение "Enough" от лектора си.
При всяка решена задача, той получава оценка.
Програмата трябва да приключи прочитането на данни при команда "Enough"
или ако Марин получи определеният брой незадоволителни оценки.
Незадоволителна е всяка оценка, която е по-малка или равна на 4.
Вход
•	На първи ред - брой незадоволителни оценки - цяло число в интервала [1…5]
•	След това многократно се четат по два реда:
o	Име на задача - текст
o	Оценка - цяло число в интервала [2…6]
Изход
•	Ако Марин стигне до командата "Enough", отпечатайте на 3 реда:
o	"Average score: {средна оценка}"
o	"Number of problems: {броя на всички задачи}"\
o	"Last problem: {името на последната задача}"
•	Ако получи определения брой незадоволителни оценки:
o	"You need a break, {брой незадоволителни оценки} poor grades."
Средната оценка да бъде форматирана до втория знак след десетичната запетая.
*/