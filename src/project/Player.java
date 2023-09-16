package project;

public class Player {

  private Role role;
  private int hp;
  private Vest vest;
  private String username;
  private int numberOfKill=0;
  private int numberOfDeads=0;
  private Weapon weapon;
  private int cash;

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public Vest getVest() {
    return vest;
  }

  public void setVest(Vest vest) {
    this.vest = vest;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public int getNumberOfKill() {
    return numberOfKill;
  }

  public void setNumberOfKill(int numberOfKill) {
    this.numberOfKill = numberOfKill;
  }

  public int getNumberOfDeads() {
    return numberOfDeads;
  }

  public void setNumberOfDeads(int numberOfDeads) {
    this.numberOfDeads = numberOfDeads;
  }

  public Weapon getWeapon() {
    return weapon;
  }

  public void setWeapon(Weapon weapon) {
    this.weapon = weapon;
  }

  public int getCash() {
    return cash;
  }

  public void setCash(int cash) {
    this.cash = cash;
  }

  public boolean isDead() {
    return isDead;
  }

  public void setDead(boolean dead) {
    isDead = dead;
  }

  private boolean isDead = false;

  public Player(Role role, String username, int cash) {
    this.role = role;
    this.hp = 100;
    this.username = username;
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