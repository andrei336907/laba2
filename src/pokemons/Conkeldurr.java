package pokemons;

import physicalmoves.Facade;
import physicalmoves.FeintAttack;
import physicalmoves.RockTomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import specialmoves.DreamEater;

public class Conkeldurr extends Pokemon {
    public Conkeldurr(String name, int level){
        super(name, level);
        setType(Type.FIGHTING);
        setStats(105, 140, 95, 55, 65, 45);
        setMove(new RockTomb(), new Facade(), new DreamEater(), new FeintAttack());

    }

}