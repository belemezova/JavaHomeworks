package OOP_Homework4.gradeEnum;

public enum Grade {
  EXCELENT(6),
  VERY_GOOD(5),
  SATISFACTORY(4),
  BASIC(3),
  LOW(2);

  private final int grade;

  Grade(int grade) {
    this.grade = grade;
  }

  public int getGrade() {
    return grade;
  }

  public boolean pass() {
    boolean pass = true;
    if (name().equals(LOW)) {
      pass = false;
    }
    return pass;
  }
}
/*6 - Excellent 5 - Very good 4 - Satisfactory 3 - Basic 2 - Low

Създайте enum Grade за оценките Слаб, Среден, Добър, Много Добър, Отличен.
С поле за числова оценка и get метод.
 Добавете и метод pass(), който връща false за първата оценка и true за всички останали.
 Демонстрирайте с десет оценки, които да сортирате с помощта на колекция по числовата им стойност.*/