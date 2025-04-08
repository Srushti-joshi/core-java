package internal;

public class Mutant {
    private String power;
    private int strengthLevel;
    private boolean isHero;
    private String origin;
    private String weakness;
    public String getPower() { return power; }
    public int getStrengthLevel() { return strengthLevel; }
    public boolean isHero() { return isHero; }
    public String getOrigin() { return origin; }
    public String getWeakness() { return weakness; }

    void setPower(String power) { this.power = power; }
    void setStrengthLevel(int strengthLevel) { this.strengthLevel = strengthLevel; }
    void setHero(boolean hero) { isHero = hero; }
    void setOrigin(String origin) { this.origin = origin; }
    void setWeakness(String weakness) { this.weakness = weakness; }
}

