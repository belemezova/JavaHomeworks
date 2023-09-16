package OOP_Lesson_workshop.thread;

public class Main {

  public static void main(String[] args) {
 /*   Thread mainThread = Thread.currentThread();
    MyThread t1 = new MyThread();
    MyThread t2 = new MyThread();
    t1.setName("Counter1");
    t2.setName("Counter2");
    mainThread.setName("Main Thread");
    t1.setPriority(1);
    t2.setPriority(10);
    System.out.println(t1.getName() + " has priority: " + t1.getPriority());
    System.out.println(Thread.currentThread().getName() + " has priority: " + Thread.currentThread()
        .getPriority());

    System.out.println(t2.getName() + " has priority: " + t2.getPriority());
    t1.start();
    t2.start();*/


    Runnable run=new MyRunnable();
    Thread t1= new Thread(run);
    Thread t2= new Thread(run);
    t1.start();
    t1.start();


  }
}
