package specialmoves;

import ru.ifmo.se.pokemon.*;

public class Bubble extends SpecialMove {
    public Bubble() {
        super(Type.WATER, 40, 100);
    }
    @Override
    protected String describe() {
        return "использует Bubble";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.1) {
            pokemon.setMod(Stat.SPEED, -1);
        }
    }
}