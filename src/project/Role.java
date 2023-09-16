package project;



import java.util.Arrays;
import java.util.Random;

public enum Role {
  TERRORIST(1),
  COUNTER_TERRORIST(0);
  int roleNumber;
Random ran=new Random();
  Role(int roleNumber) {
    this.roleNumber = roleNumber;

  }

  public int[] pickRole(){

    int[] playersRole = new int[10];
    int countZeros = 0;
    int countOnes = 0;
    int i = 0;
    int j = 0;
    for (; i < 10; i++) {
      int rand = ran.nextInt(2);
      switch (rand) {
        case 0:
          countZeros++;
          break;
        case 1:
          countOnes++;
          break;
      }
      playersRole[i] = rand;
      if (countOnes >= 5) {
        j = 0;
        break;
      } else if (countZeros >= 5) {
        j = 1;
        break;
      }else continue;


    }
    Arrays.fill(playersRole, i+1, playersRole.length, j);
    return playersRole;
}


public void getRole(int  value) {

 // return new Role(value);
  }
}
