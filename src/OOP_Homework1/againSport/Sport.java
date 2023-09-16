package OOP_Homework1.againSport;

import java.io.Serializable;

public class Sport implements Serializable {
public String getName(){
  return "General Sport";
}
public  String  getNumberOfTeamMembers(){
  return "C" + this.getName();
}
}
/*Сега в друг пакет копирайте класа Sport и го направете да е Java Bean
 със следните атрибути name и numberOfTeamMembers.
Копирайте и клас Soccer. Направете и него на Java Bean.
Направете така, че в Soccer винаги numberOfTeamMembers ще е 11, а името ще е “Soccer”.
В SportTest клас създайте обект “soccer” от тип Sport който е инстанция на Soccer
Създайте също обект “sport” от тип Sport който е инстанция на класа Sport.
Изведете в конзолата soccer.getName(), soccer.getNumberOfTeamMembers(),
soccer.getClass(), soccer.getClass().getSuperclass()
Изведете в конзолата sport.getName(), sport.getNumberOfTeamMembers(),
sport.getClass(), sport.getClass().getSuperclass()
Разгледайте и се опитайте да си обясните двата изхода..*/