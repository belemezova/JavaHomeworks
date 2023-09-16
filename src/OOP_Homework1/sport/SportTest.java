package OOP_Homework1.sport;

public class SportTest {

  public static void main(String[] args) {
    Sport soccer=new Soccer();
    Sport sport=new Sport();
    System.out.println(soccer.getName().toString());
    System.out.println(soccer.getNumberOfTeamMembers().toString());
    System.out.println(soccer.getClass().toString());
    System.out.println(soccer.getClass().getSuperclass().toString());


    System.out.println(sport.getName().toString());
    System.out.println(sport.getNumberOfTeamMembers().toString());
    System.out.println(sport.getClass().toString());
    System.out.println(sport.getClass().getSuperclass().toString());

  }
}
/*В SportTest клас създайте обект “soccer” от тип Sport който е инстанция на класа Soccer.
Създайте също обект “sport” от тип Sport който е инстанция на класа Sport.
Изведете в конзолата soccer.getName(), soccer.getNumberOfTeamMembers(),
soccer.getClass(), soccer.getClass().getSuperclass()
Изведете в конзолата sport.getName(), sport.getNumberOfTeamMembers(),
sport.getClass(), sport.getClass().getSuperclass()
Разгледайте и се опитайте да си обясните двата изхода*/