public class NestBall {
    public void use(Deck deck, Bench bench) {
        Pokemon basicPokemon = deck.draw();
        if (basicPokemon != null) {
            bench.addPokemon(basicPokemon);
        }
        deck.shuffle();
    }
}
