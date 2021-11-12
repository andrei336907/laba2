package physicalmoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class RockTomb extends PhysicalMove {
    public RockTomb(){
        super(Type.ROCK, 60, 95);
    }
    @Override
    protected String describe() {
        return "использует Rock Tomb";
    }

}
