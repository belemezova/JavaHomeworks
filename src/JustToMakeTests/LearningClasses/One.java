package JustToMakeTests.LearningClasses;

 class One {

  int i = 1;

  public One() {
    System.out.println("class 1");
  }

  public int getInt() {
    return i;
  }
  public static void print(){
    System.out.println("1");
  }
  public static void print(int i){
    System.out.println("Parent");
  }
  public void process(){
    System.out.println("Paren");
  }
}
