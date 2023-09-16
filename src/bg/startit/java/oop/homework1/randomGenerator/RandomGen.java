package bg.startit.java.oop.homework1.randomGenerator;

import java.util.Random;

public class RandomGen extends Random {
  private double fromA;
  private double toB;

  public double getFromA() {
    return fromA;
  }

  public void setFromA(double fromA) {
    this.fromA = fromA;
  }

  public RandomGen(double fromA, double toB) {
    this.fromA = fromA;
    this.toB = toB;
  }

  public double getToB() {
    return toB;
  }

  public void setToB(double toB) {
    this.toB = toB;
  }

  private double nextNumber=fromA%toB;

public double generateNextDouble (double fromA, double toB){
  nextNumber=(nextNumber*(toB-fromA)/2+fromA)%(toB-1);
  if(nextNumber<=fromA){nextNumber=fromA%toB+fromA;
} else if (nextNumber>=toB)
  {nextNumber=toB-fromA%toB;  }
  return nextNumber;
}
}
/* double nextDouble(double origin, double bound) {    double r = nextDouble();
 r = r * (bound - origin) + origin;    if (r >= bound) //
 correct for rounding      r = Math.nextDown(bound);    return r;  }*/