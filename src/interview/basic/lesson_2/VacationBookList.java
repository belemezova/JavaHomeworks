package interview.basic.lesson_2;

import java.util.Scanner;

public class VacationBookList {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int pages = Integer.parseInt(sc.nextLine());
    int readingPages = Integer.parseInt(sc.nextLine());
    int days = Integer.parseInt(sc.nextLine());
    int pagesPerDay=pages/days;
    int hoursPerDay=pagesPerDay/readingPages;
    System.out.println(hoursPerDay);

  }
}
/*
вашата задача е да му помогнете да изчисли колко часа на ден трябва да отделя,
за да прочете необходимата литература.
Вход
От конзолата се четат 3 реда:
1.	Брой страници в текущата книга – цяло число в интервала [1…1000]
2.	Страници, които прочита за 1 час – цяло число в интервала [1…1000]
3.	Броят на дните, за които трябва да прочете книгата – цяло число в интервала [1…1000]
Изход
Да се отпечата на конзолата броят часове, които Жоро трябва да отделя за четене всеки ден.
*/