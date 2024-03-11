import java.util.ArrayList;
import java.util.List;

public class Player {
    // Attributes to hold the player's name, their deck of Pokémon cards, and the cards in their hand.
    private String name;
    private Deck deck;
    private List<Pokemon> hand;

    // Constructor that initializes the player with a name, a new deck, and an empty hand.
    public Player(String name) {
        this.name = name;
        this.deck = new Deck();
        this.hand = new ArrayList<>();
        populateDeck(); // Populate the player's deck with Pokémon cards.
    }

    // Method to add Pokémon to the player's deck to ensure a varied initial hand draw.
    public void populateDeck() {
        for (int i = 0; i < 7; i++) {
            this.deck.addPokemon(new Pikachu());
            this.deck.addPokemon(new Bulbasaur());
            this.deck.addPokemon(new Charmander());
        }
        this.deck.shuffle(); // Shuffle the deck after adding the Pokémon to ensure random order.
    }

    // Method to draw a specified number of cards (n) from the deck into the player's hand.
    public void drawInitialHand(int n) {
        for (int i = 0; i < n; i++) {
            this.drawCard(); // Draw a single card from the deck and add it to the hand.
        }
    }

    // Method to draw a single card from the deck. If the deck isn't empty, add the card to the hand.
    public Pokemon drawCard() {
        if (!this.deck.isEmpty()) {
            Pokemon card = this.deck.draw();
            this.hand.add(card); // Add the drawn card to the hand.
            return card; // Return the drawn card.
        }
        return null; // Return null if the deck was empty and no card could be drawn.
    }

    // Getter method to retrieve the player's name.
    public String getName() {
        return name;
    }

    // Getter method to retrieve the player's deck.
    public Deck getDeck() {
        return deck;
    }

}
