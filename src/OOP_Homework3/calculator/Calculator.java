package OOP_Homework3.calculator;

public class Calculator implements AdvancedArithmetic{
 public double sum;
 public double[] numbers;

  public void setNumbers(double[] numbers) {
    this.numbers = numbers;
  }

  public double[] getNumbers() {
    return numbers;
  }

  @Override
  public double divisorSum(int n) {
    for (int i = 0; i < numbers.length; i++) {
      if(numbers[i]%n==0){
        sum+=numbers[i];
      }
    }
    return sum;
  }
}
/*Създайте клас Calculator който имплементира
AdvancedArithmetic т. че divisorSum(n)
да връща сбора на всички числа които делят n.*/