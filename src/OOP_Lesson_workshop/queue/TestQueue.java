package OOP_Lesson_workshop.queue;

import java.util.InputMismatchException;

public class TestQueue {

  public static void main(String[] args) {
    Queue queue = new Queue();
    queue.offer(5);
    queue.offer(4);
    queue.offer(3);
    queue.poll();
   queue.offer(11);
    queue.offer(15);
    queue.poll();
    queue.offer(6);
    System.out.println(queue.size());

    System.out.println(queue);
    System.out.println();
    queue.poll();
   System.out.println(queue.size());
    System.out.println(queue.getCounter());
    System.out.println(queue.peek());
    System.out.println(queue.getCounter());
    System.out.println(queue.contains(4));
    System.out.println(queue.contains(8));
    queue.offer(19);
    System.out.println(queue.isFull());
    System.out.println(queue.getCounter());
    System.out.println(queue.size());
    queue.offer(24);
    System.out.println(queue.size());

    queue.offer(32);
    queue.peek();
    queue.offer(28);
    queue.poll();
    queue.peek();
    queue.poll();
    queue.poll();
    queue.peek();
    System.out.println(queue.size());
    queue.poll();
    queue.poll();
    queue.offer(11);

    queue.offer(15);
    System.out.println(queue);
   System.out.println(queue.getCounter());

    System.out.println();
   /* queue.clear();
    System.out.println(queue);*/

  }
}
