import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {

    public static void main(String[] args){
        Battle b = new Battle();
        Pokemon p1 = new TapuBulu("tapu", 1);
        Pokemon p2 = new Timburr("TIMUR", 1);
        Pokemon p3 = new Gurdurr("Gurdurr", 1);
        Pokemon p4 = new Conkeldurr("Conkeldurr", 1);
        Pokemon p5 = new Eevee("Eevee", 1);
        Pokemon p6 = new Vaporeon("Vapo", 1);
        b.addAlly(p1);
        b.addAlly(p5);
        b.addAlly(p6);
        b.addFoe(p2);
        b.addFoe(p3);
        b.addFoe(p4);
        b.go();
    }

}
