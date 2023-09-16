package OOP_Lesson_workshop.queue;

public class Queue {

  public int[] memory;
  private int pointerTail;
  private int pointerHead;
  private int length = 5;
  private int counter;
  private boolean isDoubled = false;
  private int snapshot;


  public Queue() {
    memory = new int[length];
    pointerHead = -1;
    pointerTail = -1;
  }


  public boolean isEmpty() {
    return (pointerHead == -1) && (pointerTail == -1);
  }

  public boolean isFull() {
    return (pointerTail + 1) % length == pointerHead;
  }

  public int size() {
    return this.counter;
  }

  @Override
  public String toString() {
    String elements = "";
    if (pointerHead > pointerTail) {
      for (int i = pointerHead; i < length; i++) {
        elements += memory[i] + " ";
      }
      for (int i = 0; i <= pointerTail; i++) {
        elements += memory[i] + " ";
      }
    } else {
      if (isDoubled) {

        if (pointerHead > snapshot) {
          for (int i = pointerHead; i <  length / 2; i++) {
            elements += memory[i] + " ";
          }
          for (int i = 0; i <= snapshot; i++) {
            elements += memory[i] + " ";
          }
          for (int i =  length / 2; i <= pointerTail; i++) {
            elements += memory[i] + " ";
          }
        } else {
          for (int i = pointerHead; i <= snapshot+1; i++) {
            elements += memory[i] + " ";
          }
          for (int i =  length / 2; i <= pointerTail; i++) {
            elements += memory[i] + " ";
          }
        }

      } else if(pointerHead==snapshot){
        elements += memory[snapshot] + " ";
        elements += memory[snapshot+1] + " ";
        for (int i =  length / 2; i <= pointerTail; i++) {
          elements += memory[i] + " ";
        }
      }else {
        for (int i = pointerHead; i <= pointerTail; i++) {
          elements += memory[i] + " ";
        }
      }
    }

    return "Queue{" + elements +
        '}';
  }


  public int getCounter() {
    return counter;
  }

  public void offer(int element) {

    if (isFull()) {

      int[] newMemory = new int[2 * length];
      for (int i = 0; i < length; i++) {
        newMemory[i] = memory[i];
      }
      snapshot = pointerTail;
      pointerTail = length;
      isDoubled = true;
      memory = newMemory;
      length = length * 2;

    } else if (isEmpty()) {
      pointerHead = 0;
      pointerTail = 0;
    } else {
      pointerTail = (pointerTail + 1) % length;
    }
    memory[pointerTail] = element;
    counter++;
  }

  public int getPointerHead() {

    return pointerHead;
  }

  public int poll() {
    if (isEmpty()) {
      return -1;
    } else if (pointerTail == pointerHead) {

      pointerHead = -1;
      pointerTail = -1;
    } else {
      if (isDoubled)  {

        pointerHead = (pointerHead + 1) %  (length / 2);
        if (pointerHead == snapshot) {
          isDoubled = false;

        }

      }  else if(pointerHead==snapshot){
        pointerHead=length/2;
      }else {
        pointerHead = (pointerHead + 1) % length;
      }
    }
    counter--;
    return pointerHead;
  }

  public int peek() {
    if (isEmpty()) {
      return (Integer) null;
    }
    return memory[pointerHead];
  }

  public void clear() {
    for (int i = pointerHead; i <= pointerTail; i++) {
      this.poll();
    }
  }

  public boolean contains(int element) {
    boolean contain = false;
    if (pointerHead > pointerTail) {
      for (int i = pointerHead; i < length; i++) {
        if (memory[i] == element) {
          return true;
        }
      }
      for (int i = 0; i <= pointerTail; i++) {
        if (memory[i] == element) {
          return true;
        }
      }
    } else {
      for (int i = pointerHead; i <= pointerTail; i++) {
        if (memory[i] == element) {
          return true;
        }
      }
    }
    return contain;
  }

}


