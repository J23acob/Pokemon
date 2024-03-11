public class GameController {
    // Simplified for demonstration; implement according to your game's rules
    public boolean performAttack(Pokemon attacker, Player opponent) {
        // For simplicity, assume any attack results in a loss
        System.out.println(attacker.getName() + " attacks " + opponent.getName() + "'s Pokémon!");
        return true; // Assume the opponent loses their Pokémon
    }
}


