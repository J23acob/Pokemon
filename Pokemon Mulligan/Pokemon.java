public class Pokemon extends Card {
    private int healthPoints;
    private String type;
    private String attackName;
    private int attackDamage;

    public Pokemon(String name, int healthPoints, String type, String attackName, int attackDamage) {
        super(name);
        this.healthPoints = healthPoints;
        this.type = type;
        this.attackName = attackName;
        this.attackDamage = attackDamage;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public String getType() {
        return type;
    }

    public void heal(int amount) {
        this.healthPoints += amount;
    }

    public String getAttackName() {
        return attackName;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void attack(Pokemon opponent) {
        opponent.healthPoints -= this.attackDamage;
    }
}
