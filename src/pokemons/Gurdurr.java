package pokemons;

import physicalmoves.Facade;
import physicalmoves.RockTomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import specialmoves.DreamEater;

public class Gurdurr extends Pokemon {
    public Gurdurr(String name, int level){
        super(name, level);
        setType(Type.FIGHTING);
        setStats(85, 105, 85, 40, 50, 40);
        setMove(new RockTomb(), new Facade(), new DreamEater());

    }

}
