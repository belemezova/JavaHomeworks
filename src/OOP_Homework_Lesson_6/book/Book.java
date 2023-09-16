package OOP_Homework_Lesson_6.book;

public class Book {

  public static int counter = 0;

  private String title;
  private String author;
  private String isbn;
  private int pages;
  private String publisher;
  private double price;

  public String getTitle() {
   return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {

    this.isbn = isbn;
  }

  public int getPages() {
    return pages;
  }

  public void setPages(int pages) {

    this.pages = pages;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public Book() {
    counter++;
  }

  public Book(String title, String author, String isbn, int pages, String publisher, double price) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.pages = pages;
    this.publisher = publisher;
    this.price = price;
  }

  public void printBook(Book book) {

    System.out.printf("Заглавие: %s\n", book.getTitle());
    System.out.printf("Автор: %s\n", book.getAuthor());
    System.out.printf("ISBN: %s\n", book.getIsbn());
    System.out.printf("Pages: %s\n", book.getPages());
    System.out.printf("Publisher: %s\n", book.getPublisher());
    System.out.printf("Price: %s\n", book.getPrice());


  }


  public void toString(Book book) {
    System.out.printf("Заглавие: %s\n", book.getTitle());
    System.out.printf("Автор: %s\n", book.getAuthor());
    System.out.printf("ISBN: %s\n", book.getIsbn());
    System.out.printf("Pages: %s\n", book.getPages());
    System.out.printf("Publisher: %s\n", book.getPublisher());
    System.out.printf("Price: %s\n", book.getPrice());


  }

 /* @Override
  protected void finalize() {
    System.out.printf("%s This book will be delete.\n", getTitle());
    super.finalize();
  }*/


}
