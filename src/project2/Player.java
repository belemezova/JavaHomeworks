package project2;

public class Player {

  private Role role;
  private int hp;
  private Vest vest;
  private String username;
  private int numberOfKill=0;
  private int numberOfDeads=0;
  private Weapon weapon;
  private int cash;
  private boolean isDead = false;

  public Player(Role role, String username, int cash) {
    this.role = role;
    this.hp = 100;
    this.vest = new Vest("No", 0, 0);
    this.username = username;
    this.weapon = new Weapon("KNIFE", 10, 0);
    this.cash = cash;
  }
}
/* o Role: Counter Terrorist or Terrorist
    o hp: (В началото на рунда е 100 по default (после се променя ако бъде уцелен с куршум))
    o Vest: (Ако играча има жилетка първо тя трябва да свърши и чак тогава играча започва да губи
    hp различните жилетки имат различен defense)
    o username: name of Player
    o numberOfKills:
    o numberOfDeads:
    o Weapon:
    o cash:
    o isDead: flag that indicate if the player is dead false by default
     (if he die for example on round 1 for round 2 (it have you need to reset it))*/