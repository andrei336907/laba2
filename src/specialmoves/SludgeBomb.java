package specialmoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class SludgeBomb extends SpecialMove {
    public SludgeBomb(){
        super(Type.POISON, 90 ,100);
    }
    @Override
    protected String describe() {
        return "использует Sludge Bomb";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.3){
            Effect.poison(pokemon);
        }
    }
}
