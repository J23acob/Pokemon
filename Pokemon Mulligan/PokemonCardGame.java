import java.util.ArrayList;
import java.util.Random;

/**
 * Represents a simulation of the Pokémon card game.
 */
public class PokemonCardGame {
    private ArrayList<Card> deck; // The deck of cards
    private ArrayList<Card> hand; // The player's hand

    /**
     * Constructs a new PokemonCardGame object with a predefined deck composition.
     */
    public PokemonCardGame() {
        deck = new ArrayList<Card>();
        hand = new ArrayList<Card>();
        int numPokemon = 1;
        int numRareCandies = 3;

        // Add the specified number of Pokemon cards to the deck
        for (int i = 0; i < numPokemon; i++) {
            deck.add(new Pokemon("Pikachu", 100, "Electric", "Thunderbolt", 50));
        }

        // Add the specified number of Rare Candies to the deck
        for (int i = 0; i < numRareCandies; i++) {
            deck.add(new Trainer("Rare Candy", "Evolve a Pokemon", 50));
        }

        // Fill the rest of the deck with Energy cards
        int deckSize = 60;
        for (int i = numPokemon + numRareCandies; i < deckSize; i++) {
            deck.add(new Energy("Electric Energy", "Electric"));
        }
    }

    /**
     * Draws a card from the deck.
     *
     * @return The drawn card.
     */
    public Card drawCard() {
        Random rng = new Random();
        int cardIndex = rng.nextInt(deck.size());
        Card drawnCard = deck.get(cardIndex);
        deck.remove(cardIndex);
        return drawnCard;
    }


    public void run() {
        drawHand();
        System.out.println("Has Pokemon: " + evaluateOpeningHand());
    }

    /**
     * Draws a hand of 7 cards.
     */
    public void drawHand() {
        for (int i = 0; i < 7; i++) {
            hand.add(drawCard());
        }
    }

    /**
     * Evaluates if the opening hand contains at least one Pokemon card.
     *
     * @return True if the opening hand contains a Pokemon card, false otherwise.
     */
    public boolean evaluateOpeningHand() {
        for (Card currentCard : hand) {
            if (currentCard instanceof Pokemon) {
                return true;
            }
        }
        return false;
    }

    /**
     * Simulates the process of taking mulligans to find a playable opening hand.
     * Mulligans are taken until a playable hand containing at least one Pokemon card is drawn.
     *
     * @return The average number of mulligans needed to find a playable hand.
     */
    public double simulateMulligans() {
        int totalMulligans = 0; // Total number of mulligans taken across all simulations
        int simulations = 1000; // Number of simulation runs

        for (int i = 0; i < simulations; i++) {
            drawHand(); // Draw a hand of 7 cards

            // Continue taking mulligans until a playable hand is drawn
            while (!evaluateOpeningHand()) {
                totalMulligans++; // Increment the mulligan counter
                // Return the cards from the hand back to the deck
                deck.addAll(hand);
                hand.clear(); // Clear the hand
                drawHand(); // Draw a new hand
            }

            deck.addAll(hand); // Return the remaining cards to the deck
            hand.clear(); // Clear the hand for the next simulation
        }

        // Calculate the average number of mulligans needed
        double averageMulligans = (double) totalMulligans / simulations;
        return averageMulligans;
    }

    /**
     * Simulates the likelihood of drawing a Rare Candy card in the opening hand.
     *
     * @return The average probability of drawing a Rare Candy in the opening hand.
     */
    public double simulateRareCandies() {
        int totalBricks = 0; // Total number of times a Rare Candy is drawn in the opening hand
        int simulations = 1000; // Number of simulation runs

        for (int i = 0; i < simulations; i++) {
            drawHand(); // Draw a hand of 7 cards
            // Check if the hand contains at least one Rare Candy
            if (handContainsRareCandy()) {
                totalBricks++; // Increment the counter if a Rare Candy is found
            }
            // Return the cards from the hand back to the deck
            deck.addAll(hand);
            hand.clear(); // Clear the hand for the next simulation
        }

        // Calculate the average probability of drawing a Rare Candy
        double averageBricks = (double) totalBricks / simulations;
        return averageBricks;
    }

    /**
     * Checks if the hand contains at least one Rare Candy card.
     *
     * @return True if the hand contains a Rare Candy card, false otherwise.
     */
    private boolean handContainsRareCandy() {
        for (Card currentCard : hand) {
            if (currentCard instanceof Trainer && "Rare Candy".equals(currentCard.getName())) {
                return true;
            }
        }
        return false;
    }
}
