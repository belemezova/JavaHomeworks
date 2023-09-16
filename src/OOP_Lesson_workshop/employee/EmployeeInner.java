package OOP_Lesson_workshop.employee;

public class EmployeeInner {

  private String name;
  private double salary;

  public void raiseSalary(double byPercent) {
    if (salary >= 2000 && salary < 3000) {
      salary *= 1.05;
    } else if (salary >= 3000 && salary < 4500) {
      salary *= 1.15;
    } else if (salary >= 4500 && salary < 6000) {
      salary *= 1.25;
    } else {
      salary *= 1.32;
    }
  }
}
/*В EmployeeTest дефинирайте вложени класа - EmployeeNameComparator
implements Comparator<Employee>
и EmployeeSalaryComparator implements Comparator<Employee>.
Използвайте тези класове за да сортирате и изпечатате масива със
служителите съответно в азбучен ред, или сортирани спрямо заплатата им.

Направете клас и добавете метод който изчислява средно аритметично на подадените обекти.
Използвайте го за да изчислите средната заплата на служителите.

Measurablesdouble average(Measurable[] objects)

Към класа, добавете и метод .
Използвайте този метод да откриете служителя с най-голяма заплата.
Отпечатайте името на служителя.

MeasurablesMeasurable largest(Measurable[] objects)
Направете клас Employee, с атрибути String name и double salary.
Добавете метод raiseSalary(double byPercent).

EmployeeArrays.sort()Comparator
Направете клас TestEmployee, в който създавате няколко Employee обекта и ги слагате в масив.
След това отпечатвате масива.

Направете интерфейс Measurable с метод double getMeasure().
Направете Employee implement Measurable.

В TestEmployee добавете метод double average(Measurable[] objects)
 който изчислява средната стойност на заплатата на служителите.

В TestEmployee добавете метод Measurable largest(Measurable[] objects).
Използвайте го да намерите служителя с най-голяма заплата.*/