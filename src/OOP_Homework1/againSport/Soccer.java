package OOP_Homework1.againSport;

import java.io.Serializable;

public class Soccer extends Sport implements Serializable {

  public final String getName(){
  return "Soccer";
}


  public final String getNumberOfTeamMembers(){
  return "11";
}
}
/* Копирайте и клас Soccer. Направете и него на Java Bean.
Направете така, че в Soccer винаги numberOfTeamMembers ще е 11, а името ще е “Soccer”.
.*/