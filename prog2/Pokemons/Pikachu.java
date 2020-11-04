package Pokemons;
import Moves.Pichu.*;
import Moves.Pikachu.Slam;
import ru.ifmo.se.pokemon.Type;
public class Pikachu extends Pichu{
    public Pikachu(String name, int level) {
        super(name, level);
        setStats(35, 55,40,50,50,90);
        setType(Type.ELECTRIC);
        setMove(new Swagger(), new ChargeBeam(),new Slam());
    }
}
