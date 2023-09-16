package OOP_Lesson_workshop.thread;

public class MyRunnable implements  Runnable{

  @Override
  public void run() {
    for (int i = 1; i < 100; i++) {
      System.out.println(" countied to: " +i);
  }}
}
