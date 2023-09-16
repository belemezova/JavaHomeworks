package project2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

  public static Random ran = new Random();
  static Scanner scanner = new Scanner(System.in);


  public static void main(String[] args) {
//    int numberOfWeapon = ran.nextInt(5) + 5;

    //Weapons
    List<Weapon> weapons = Arrays.asList(
        new Weapon("M249", 1996, 31),
        new Weapon("CV_47", 1700, 35),
        new Weapon("MAGNUM_SNIPER_RIFLE", 1750, 115),
        new Weapon("MAVERICK_M4A1_CARBINE", 1100, 31),
        new Weapon("INGRAM_MAC_10", 1400, 28),
        new Weapon("NIGHT_HAWK_50C", 650, 53),
        new Weapon("LEONE_YG1265_AUTO_SHOTGUN", 1000, 171),
        new Weapon("LEONE_12_GAUGE_SUPER", 1600, 171),
        new Weapon("ES_C90", 1350, 25),
        new Weapon("BULLPUP", 1300, 31));

    //Vests
    List<Vest> vests = Arrays.asList(
        new Vest("Vest1000", 900, 10),
        new Vest("Vest1500", 950, 15),
        new Vest("Vest2000", 1000, 20),
        new Vest("Vest2300", 1300, 25),
        new Vest("Vest2800", 1800, 30)
    );

//    while (true) {
//      int vestIndex = ran.nextInt(5);
//      int weaponIndex = ran.nextInt(5) + 5;
//      Vest vest = vests.get(vestIndex);
//      Weapon weapon = weapons.get(weaponIndex);
//      if (vest.getPrice() + weapon.getPrice() < money) {
//
//      }

    int playersOfTeam = ran.nextInt(5) + 5;
    for (int i = 0; i < playersOfTeam; i++) {
      int money = ran.nextInt(1000) + 1000;


    }

  }


}

/*Зареждат се (10 оръжия + 1нож(който се използва когато играча няма пари за оръжие)) и 5 vest.
Пада се random число [5-10] което ще репрезентира броя да играчите от отбор тоест ако се
падне 5 ще има общо 10 играча 5(Counter Terrorist) и 5(Terrorist).
Зареждат се играчите като те са randomTeamNumber*2
Всеки играч се разпределя на случаен принцип в кой от 2 отбора ще бъде.
Всеки играч започва с random пари [1000-2000]
Действия които да се случат (на рунд):
В началото на рунда на всеки играч се пада рандом Weapon (Тоест си купува оръжие)
Като трябва да се провери дали ще има достатъчно пари и ако има от неговите пари се вади
цената на оръжието.Ако няма достатъчно пари за оръжието което му се е паднало се пробва
пак с друго random оръжие като ако и за другото няма пари действието се повтаря до 5 опита
ако и за 5 опита няма пари той ще играе с нож.
Освен Оръжие му се пада и random Vest
Като трябва да се провери дали ще има достатъчно пари и ако има от неговите пари се вади
цената на жилетката(Vest). Ако няма достатъчно пари за Vest който му се е паднал се пробва
пак с друг random Vest като ако и за другия няма пари действието се повтаря до 3 опита ако и
за 3 опита няма пари той ще играе с без жилетка.
Ако играча играе с нож стъпката с падането на рандом жилетка се пропуска тъй като той явно е
в лошо финансово състояние.
След като всички са си купили оръжия и жилетки започват бойните действия:
Пада се random число [0-1] с което се определя кой отбор ще започне да стреля пръв.
Например:
0 -> Counter Terrorist 1-> Terrorist
Например пада се 0
От отбора на Counter Terrorist се пада случаен играч който на случаен принцип ще стреля срещу
случаен играч от отбора на Terrorist.
Като от hp на нападнатият (Terrorist) се вади dmg на Weapon на нападателя (Counter Terrorist)
Като първо dmg се вади от defense на Vest (Ако изобщо има жилетка и това трябва да се
проверява).Ако defense стане на – числото под – се вади от hp и играча остава с defense 0.
После действието се повтаря само че от страна на другия отбор (Terrorist в примера)
Играч умира когато hp му падне под 0 (Тоест умрял ли е този рунд повече не трябва да може да
атакува или да бъде атакуван).
 "M249" (5200, 31),
        "CV_47"(2700, 35),
        "MAGNUM_SNIPER_RIFLE"(4750,  115),
        "MAVERICK_M4A1_CARBINE" (3100, 31),
        "INGRAM_MAC_10" (1400, 28),
        "NIGHT_HAWK_50C"(650, 53),
        "LEONE_YG1265_AUTO_SHOTGUN"(3000, 171),
        "LEONE_12_GAUGE_SUPER"(1700, 171),
        "ES_C90" (2350, 25),
        "BULLPUP"(3300,31)));*/