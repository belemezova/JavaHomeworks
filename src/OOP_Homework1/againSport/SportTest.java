package OOP_Homework1.againSport;


public class SportTest {

  public static void main(String[] args) {
    Sport soccer = new Sport();
    Sport sport = new Sport();
    System.out.println(soccer.getName());
    System.out.println(soccer.getNumberOfTeamMembers());
    System.out.println(soccer.getClass());
    System.out.println(soccer.getClass().getSuperclass());

    System.out.println(sport.getName());
    System.out.println(sport.getNumberOfTeamMembers());
    System.out.println(sport.getClass());
    System.out.println(sport.getClass().getSuperclass());

  }
}
/*В SportTest клас създайте обект “soccer” от тип Sport който е инстанция на Soccer
Създайте също обект “sport” от тип Sport който е инстанция на класа Sport.
Изведете в конзолата soccer.getName(), soccer.getNumberOfTeamMembers(),
soccer.getClass(), soccer.getClass().getSuperclass()
Изведете в конзолата sport.getName(), sport.getNumberOfTeamMembers(),
sport.getClass(), sport.getClass().getSuperclass()
Разгледайте и се опитайте да си обясните двата изхода.*/