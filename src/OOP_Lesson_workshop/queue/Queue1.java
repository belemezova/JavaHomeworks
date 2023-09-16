/*
package OOP_Lesson_workshop.queue;

public class Queue {

  public int[] memory;
  private int pointerTail;
  private int pointerHead;
  private int capacity = 5;
  private int counter;
  private boolean isDoubled = false;
  private int lastToBeGet;


  public int getCounter() {
    return counter;
  }

  public Queue() {
    memory = new int[capacity];
    pointerHead = 0;
    pointerTail = 0;
  }


  public void postPosition(int pointer){
    if ((pointer >= capacity) && (!isDoubled)) {
      pointer = pointer%capacity;
    } else if ((pointer >= capacity) && (isDoubled)) {
      while (pointer == lastToBeGet) {
        if (pointer >= capacity / 2) {
          pointer = pointer%( capacity / 2);
        }
      }
      if (pointer == lastToBeGet) {
        pointer += capacity;
        isDoubled = false;
      }

    }
  }
  public int getPointerTail() {
    if ((pointerTail >= capacity)&&(!isDoubled)) {
      pointerTail = pointerTail - capacity;
    }
    return pointerTail;
  }

  public int getPointerHead() {



    return pointerHead;
  }

  public boolean isEmpty() {
    return getPointerHead() == getPointerTail();
  }

  public boolean isFull() {
    return this.counter == capacity - 1;
  }

  public int size() {
    return this.counter;
  }

  @Override
  public String toString() {
    String elements = "";
    for (int i = getPointerHead(); i < getPointerTail(); i++) {
      elements += memory[i] + " ";
    }
    return "Queue{" + elements +
        '}';
  }

  public void moveToward(int element) {
    this.memory[getPointerTail()] = element;
    pointerTail=(getPointerTail()+1)%capacity;
    counter++;
  }

  public void offer(int element) {
    moveToward(element);
    if (isFull()) {
      lastToBeGet=pointerTail;
      int[] newMemory = new int[2 * capacity];
      for (int i = 0; i < capacity; i++) {
        newMemory[i] = memory[i];
      }

      this.memory = newMemory;
      this.capacity = 2 * capacity;
      isDoubled = true;
    }
  }

  public int poll() {
    if (isEmpty()) {
      return (Integer) null;
    }
    pointerHead=(getPointerHead()+1)%capacity;
    counter--;
    return pointerHead;
  }

  public int peek() {
    if (isEmpty()) {
      return (Integer) null;
    }
    return this.memory[getPointerHead()];
  }

  public void clear() {
    for (int i = getPointerHead(); i < getPointerTail(); i++) {
      this.poll();
    }
  }

  public boolean contains(int element) {
    boolean contain = false;
    for (int i = getPointerHead(); i < getPointerTail(); i++) {
      if (this.memory[i] == element) {
        return true;
      }
    }
    return contain;
  }

}
*/
