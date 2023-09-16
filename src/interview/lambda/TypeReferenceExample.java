package interview.lambda;

public class TypeReferenceExample {

  public static void main(String[] args) {
    StringLengthLambda myLambda=  s -> s.length();
    System.out.println(myLambda.getLength("Hello world!"));
    printLambda(s->s.length());
  }
 public  static void printLambda (StringLengthLambda l){
   System.out.println(l.getLength("Hello world!"));
    }
  interface StringLengthLambda{
    int getLength (String s);
  }
  Runnable rn= new Runnable() {
    @Override
    public void run() {

    }
  };


}
/*This is type reference:
Not explayned what a the types it take it from the interfece declaration*/