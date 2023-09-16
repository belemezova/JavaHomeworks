package project2;

public enum Role {
  TERRORIST(20, 0), COUNTER_TERRORIST(0, 10);
  int health;
  int dmg;

  Role(int health, int dmg) {
    this.health = health;
    this.dmg = dmg;
  }
}
