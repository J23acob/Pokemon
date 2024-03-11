import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Pokemon> cards; // Assuming you're using a List to store Pokemon cards

    public Deck() {
        this.cards = new ArrayList<>();
    }

    // Add a Pokemon card to the deck
    public void addPokemon(Pokemon pokemon) {
        cards.add(pokemon);
    }

    // Draw a Pokemon card from the deck
    public Pokemon draw() {
        if (!cards.isEmpty()) {
            return cards.remove(0); // Adjust based on your deck's drawing logic
        }
        return null;
    }

    // Check if the deck is empty
    public boolean isEmpty() {
        return cards.isEmpty();
    }

    // Return the current size of the deck
    public int size() {
        return cards.size();
    }

    // Shuffle the deck
    public void shuffle() {
        Collections.shuffle(cards);
    }
}

