package OOP_Homework1.mutable;

public final class ImmutableStudent {
private final int age;
private final String name;


public ImmutableStudent(int age, String name){
  this.age=age;
  this.name=name;
}
public ImmutableStudent setName(String name){
  return new ImmutableStudent(age, name);
}
  public ImmutableStudent setAge(int age){
    return new ImmutableStudent(age, name);
  }
}
