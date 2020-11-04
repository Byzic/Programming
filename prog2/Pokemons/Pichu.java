package Pokemons;
import Moves.Pichu.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Pichu extends Pokemon {
    public Pichu(String name, int level) {
        super(name, level);
        setStats(20, 40,15,35,35,60);
        setType(Type.ELECTRIC);
        setMove(new Swagger(), new ChargeBeam());
    }
}
