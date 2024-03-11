public class Charmander extends Pokemon {
    public Charmander() {
        super("Charmander", 70); // Assigning a name and HP to Charmander
    }

    // Charmander's move
    public void ember(Pokemon target) {
        System.out.println("Charmander uses Ember on " + target.getName() + "!");
    }
}

