package pokemons;


import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import specialmoves.Blizzard;
import specialmoves.Bubble;
import statusmoves.Swagger;

public class Eevee extends Pokemon {
    public Eevee(String name, int level){
        super(name, level);
        setType(Type.NORMAL);
        setStats(55, 55, 50, 45, 65, 55);
        setMove(new Swagger(), new Blizzard(), new Bubble());

    }
}

