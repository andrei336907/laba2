package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import specialmoves.IceBeam;
import specialmoves.SludgeBomb;
import statusmoves.Growl;
import statusmoves.Rest;

public class TapuBulu extends Pokemon {
    public TapuBulu(String name, int level){
        super(name, level);
        setType(Type.GRASS, Type.FAIRY);
        setStats(70, 130, 115, 85, 95, 75);
        setMove(new IceBeam(), new Growl(),new SludgeBomb(),new Rest());

    }
}
