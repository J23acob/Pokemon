public class GameEngine {
    // Declare two Player objects to represent the players in the game.
    private Player player1;
    private Player player2;
    
    // Declare a GameController to handle attacks and interactions between players.
    private GameController gameController;

    // Constructor for the GameEngine class.
    public GameEngine() {
        // Initialize player1 and player2 with names "Player 1" and "Player 2".
        player1 = new Player("Player 1");
        player2 = new Player("Player 2");
        
        // Initialize the GameController.
        gameController = new GameController();

        // Draw initial hands of 7 cards for each player at the start of the game.
        player1.drawInitialHand(7);
        player2.drawInitialHand(7);
    }

    // The main method to run the game logic.
    public void run() {
        System.out.println("Game Start!");

        // Here, player1 draws a card to use as the attacker.
        Pokemon attacker = player1.drawCard();
        
        // Use the GameController to perform the attack from player1 to player2.
        // If player2 loses (indicated by performAttack returning true), player1 wins. Otherwise, player2 wins.
        if (gameController.performAttack(attacker, player2)) {
            System.out.println("Game Over! " + player1.getName() + " wins!");
        } else {
            System.out.println("Game Over! " + player2.getName() + " wins!");
        }
    }


    public static void main(String[] args) {
        GameEngine gameEngine = new GameEngine();
        gameEngine.run(); // Executes the run method to start the game
    }
}
