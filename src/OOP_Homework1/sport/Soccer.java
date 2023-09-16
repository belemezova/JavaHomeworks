package OOP_Homework1.sport;

public class Soccer extends Sport {
@Override
  public String getName(){
  return "Soccer";
}

@Override
  public String getNumberOfTeamMembers(){
  return "11";
}
}
/* Класът Soccer override-ва getName() т.
че той да връща “Soccer”.
В Soccer същот се Override-ва и getNumberOfTeamMembers() т че той да връща 11.
.*/