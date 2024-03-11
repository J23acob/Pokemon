
public class TestPokemonCardGame
{
    
    public static void main(String[] args){

        PokemonCardGame test = new PokemonCardGame();

        test.run();
        System.out.println("average mulligans list: ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++\n\n");

        for (int i = 1; i <= 60; i++) {
            System.out.println("Average mulligans for "+i +": "+test.simulateMulligans());
        }


        System.out.println("average rare candies list: ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++\n\n");
        for (int i = 1; i <= 60; i++) {
            System.out.println("Average rare candies for "+i +": "+test.simulateRareCandies());
        }


    }

}
