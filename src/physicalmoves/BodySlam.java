package physicalmoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class BodySlam extends PhysicalMove {
    public BodySlam(){
        super(Type.NORMAL, 85, 100);
    }
    @Override
    protected String describe() {
        return "использует Body Slam";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.3){
            Effect.paralyze(pokemon);
        }
    }
}