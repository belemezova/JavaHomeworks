package OOP_Lesson_workshop.thread;

public class MyThread extends Thread{

  public MyThread() {
    super();

  }

  public MyThread(String name) {
    super(name);
  }

  public void run(){
  for (int i = 1; i < 100; i++) {
    System.out.println(getName()+ " countied to: " +i);
  }
}
}
