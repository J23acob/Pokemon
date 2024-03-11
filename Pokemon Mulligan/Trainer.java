
public class Trainer extends Card {
    private String effect;
    private int effectValue;

    public Trainer(String name, String effect, int effectValue) {
        super(name);
        this.effect = effect;
        this.effectValue = effectValue;
    }

    public String getEffect() {
        return effect;
    }

    public void useEffect(Pokemon pokemon) {
        if ("heal".equals(effect)) {
            pokemon.heal(effectValue);
        }

    }
}
