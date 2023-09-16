package JustToMakeTests.LearningClasses;

public abstract class Two extends One{
int i=2;

  public Two() {
    System.out.println("class 2");
  }

  @Override
  public int getInt() {
    return i;
  }
  public static void print(){
    System.out.println("2");
  }
  public static void print(int i){
    System.out.println("Child");
  }
  public abstract void process();

}
