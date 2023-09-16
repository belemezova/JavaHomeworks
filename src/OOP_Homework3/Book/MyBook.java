package OOP_Homework3.Book;

public class MyBook extends Book {

  private String title;
  private String author;
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

  public double getPrice() {
    return price;
  }

  public MyBook(String title, String author, double price) {
    setTitle(title);
    setAuthor(author);
    setPrice(price);
  }

  public void setPrice(double price) {
    if (price > 0) {
      this.price = price;
    } else {
      System.out.println("Invalid value");
    }
  }

  public MyBook() {
  }

  @Override
  void display() {
    System.out.println(" Title: < "+getTitle()+ " >. Author: < "+getAuthor()+" >. Price: < "+getPrice()+" >.");
  }

}
/*Създайте клас MyBook който: 2.1 Наследява Book
2.2 Има конструктор с параметри title, author, price
2.3 Имплементира display() т. че да той да извежда конзолата следният изход:
 Title: <title>. Author: <author>. Price: <price>.
Създайте клас BookTest който чете книги от конзолата
 (преценете кога да спре четенето) и след това извежда книгите в конзолата.*/