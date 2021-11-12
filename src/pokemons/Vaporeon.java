package pokemons;

import physicalmoves.BodySlam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import specialmoves.Blizzard;
import specialmoves.Bubble;
import statusmoves.Swagger;

public class Vaporeon extends Pokemon {
    public Vaporeon(String name, int level){
        super(name, level);
        setType(Type.WATER);
        setStats(130, 65, 60, 110, 95, 65);
        setMove(new Swagger(), new Blizzard(), new Bubble(), new BodySlam());

    }
}