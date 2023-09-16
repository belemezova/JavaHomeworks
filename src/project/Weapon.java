package project;

public enum Weapon {
  M249(1996, 31),
  CV_47(1700, 35),
  MAGNUM_SNIPER_RIFLE(1750, 115),
  MAVERICK_M4A1_CARBINE(1100, 31),
  INGRAM_MAC_10(1400, 28),
  NIGHT_HAWK_50C(650, 53),
  LEONE_YG1265_AUTO_SHOTGUN(1000, 171),
  LEONE_12_GAUGE_SUPER(1600, 171),
  ES_C90(1350, 25),
  BULLPUP(1300, 31);

  private double price;
  private int dmg;

  Weapon(double price, int dmg) {
    this.price = price;
    this.dmg = dmg;
  }
}
