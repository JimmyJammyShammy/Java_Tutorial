package jimmy;

public enum AdvMobAi {
    PASSIVE("Passive", "Do not harm anything", 0, 0),
    XPASSIVE("Exclusive Passive", "Passive to owner, netural to else", 10, 10),
    NEUTRAL("Neutral", "Harm attackers, incl ownder, else passive", 15, 25),
    HOSTILE("Hostile", "Attack everything including owner", 20, 45),
    XHOSTILE("Exclusive Hostile", "Attack everything, attack owner last", 30, 50),
    NXHOSTILE("Inverse Exclusive Hostile", "Attack everything, attack owner first", 50, 100);
// Add a semicolon to the last element to signal the end of the enum

    private String aiType;
    private String behavior;
    private int agroRange;
    private float damage;

    // Since this is only being used for this enum, public isn't needed for the constructor
    AdvMobAi(String aiType, String behavior, int agroRange, float damage){
        this.aiType = aiType;
        this.behavior = behavior;
        this.agroRange = agroRange;
        this.damage = damage;
    }
    // Since this class uses private variables, we need getters so other classes can use them

// Right click -> Generate -> Getter -> Shift-Click the last element -> OK

    public String getAiType() {
        return aiType;
    }

    public String getBehavior() {
        return behavior;
    }

    public int getAgroRange() {
        return agroRange;
    }

    public float getDamage() {
        return damage;
    }
}
