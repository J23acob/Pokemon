public class Bulbasaur extends Pokemon {
    public Bulbasaur() {
        super("Bulbasaur", 70); // Assigning a name and HP to Bulbasaur
    }

    // Bulbasaur's move
    public void vineWhip(Pokemon target) {
        System.out.println("Bulbasaur uses Vine Whip on " + target.getName() + "!");
    }
}
