package bg.startit.java.oop.homework1.time;

public class Time {
private int hour;
private int minute;
private int second;

  public int getHour() {
    return hour;
  }

  public void setHour(int hour) {
    if (hour<0&&hour>24){
      this.hour = 0;
      System.out.println("Please enter correct value!");
    }else {
    this.hour = hour;}
  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) {
    if (minute<0&&minute>60){
      this.minute = 0;
      System.out.println("Please enter correct value!");
    }else {
    this.minute = minute;}
  }

  public int getSecond() {
    return second;
  }

  public void setSecond(int second) {if (second<0&&second>60){
    this.second = 0;
    System.out.println("Please enter correct value!");
  }else {
    this.second = second;}
  }
  public void tick(int hour, int minute, int second){
    setSecond(second+1);
    if(getSecond()>=60){
      setSecond(0);
      setMinute(minute+1);
      if(getMinute()>=60){
        setMinute(0);
        setHour(hour+1);
        if(getHour()>=24){
          setHour(hour-24);
        }
      }
    }
      }
      public void print(){
        System.out.printf("<%02d>:<%02d>:<%02d>",this.hour, this.minute, this.second );
      }
}
/*Направете клас Time, който притежава следните private атрибути - hour, minute, second.
Трябва да има публични setters, които валидират подадените данни.
Ако данните са грешни, слагат стойността на 0 и печатат на екрана съобщение за грешка.

Добавете метод tick(), който увеличава времето с 1 секунда.
Имайте предвид, че това може да увеличи минутите и часовете.

Добавете метод print() ,
 който отпечатва времето във формат <hour>:<minute>:<second>

Направете клас TimeTest. Опитайте се да илюстрирате максимално употребата на класа.
Помислете за особенни случаи, когато tick() метода би трябвало да работи по по-особен начин.*/