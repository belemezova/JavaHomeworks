package OOP_Homework4.shape;

public class ResizableCircle extends Circle implements Resizable{

  @Override
  public void resize(int percent) {
    this.radius=super.radius+percent;
  }
}
