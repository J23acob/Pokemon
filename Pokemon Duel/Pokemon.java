public class Pokemon {
    private String name;
    private int hp;

    public Pokemon(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for HP
    public int getHp() {
        return hp;
    }

    // Setter for HP, in case it's needed for game logic
    public void setHp(int hp) {
        this.hp = hp;
    }
}


