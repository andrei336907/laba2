package physicalmoves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class FeintAttack extends SpecialMove {
    public FeintAttack(){
        super(Type.DARK, 60, 1000);
    }
    @Override
    protected String describe() {
        return "использует Feint Attack";
    }
}