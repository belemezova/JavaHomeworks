package interview.lambda;

public class ThisReferenceExample {

  public void doProcess(int i, Process p) {
    p.process(i);
  }
public void execute(){
    doProcess(10,i -> {
      System.out.println("Value of i is:" + i);
      System.out.println(this);
      //point to the reference this method is called;=> to object-ex
    });
    }

  public static void main(String[] args) {
    ThisReferenceExample ex = new ThisReferenceExample();
    ex.doProcess(10, new Process() {
      @Override
      public void process(int i) {
        System.out.println("Value of i is:" + i);
        System.out.println(this);//point to this inner anonymous class
      }

      @Override
      public String toString() {
        return "This is the Anonymous inner class";
      }
    });

    ex.doProcess(22, i -> {
      System.out.println("Value of i is:" + i);
    });
    ex.execute();
  }
  public String toString(){
    return "This is tha main ThisReferenceExample class instance";
  }
}
