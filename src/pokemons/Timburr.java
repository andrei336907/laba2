package pokemons;

import physicalmoves.Facade;
import physicalmoves.RockTomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Timburr extends Pokemon {
    public Timburr(String name, int level){
        super(name, level);
        setType(Type.FIGHTING);
        setStats(75, 80, 55, 25, 35, 35);
        setMove(new RockTomb(), new Facade());

    }
}
