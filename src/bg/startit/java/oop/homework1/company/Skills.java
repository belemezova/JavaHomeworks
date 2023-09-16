package bg.startit.java.oop.homework1.company;

public class Skills {
  private final String skill1 = "Computer competence";
  private final String skill2 = "Teamwork";
  private final String skill3 = "Ambition";
  private final String skill4 = "Clinical thinking";

  public String getSkill1() {
    return skill1;
  }

  public String getSkill2() {
    return skill2;
  }

  public String getSkill3() {
    return skill3;
  }

  public String getSkill4() {
    return skill4;
  }

  @Override
  public String toString() {
    return "Skills{" +
        "skill 1 = '" + skill1 + '\'' +
        ", skill 2 = '" + skill2 + '\'' +
        ", skill 3 = '" + skill3 + '\'' +
        ", skill 4 = '" + skill4 + '\'' +
        '}';
  }
}
