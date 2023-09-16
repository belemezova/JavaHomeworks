package OOP_Homework3.iterator;

import java.util.Iterator;
import java.util.List;

public class MyListIterator<T> implements Iterator {
  private List<T> list=null;
  private int index=0;
  public MyListIterator(List<T>list){
    this.list=list;
  }

  @Override
  public boolean hasNext() {
    return this.index< list.size();
  }

  @Override
  public T next() {
    return this.list.get(index++);
  }
}
