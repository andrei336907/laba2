package specialmoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Blizzard extends SpecialMove {
    public Blizzard(){
        super(Type.ICE, 110, 70);
    }
    @Override
    protected String describe() {
        return "использует Blizzard";
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.1){
            Effect.freeze(pokemon);
        }
    }
}
