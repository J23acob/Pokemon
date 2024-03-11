public class Pikachu extends Pokemon {
    public Pikachu() {
        super("Pikachu", 70); // Assigning a name and HP to Pikachu
    }

    // Pikachu's move
    public void thunderShock(Pokemon target) {
        System.out.println("Pikachu uses ThunderShock on " + target.getName() + "!");
    }
}

