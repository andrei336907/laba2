package specialmoves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DreamEater extends SpecialMove {
    public DreamEater(){
        super(Type.PSYCHIC, 100, 100);
    }
    @Override
    protected String describe() {
        return "использует Dream Eater";
    }
}
