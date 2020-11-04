package Pokemons;
import Moves.Lickilicky.*;
import Moves.Lickitung.*;
import ru.ifmo.se.pokemon.Type;
public class Lickilicky extends Lickitung{
    public Lickilicky(String name, int level) {
        super(name, level);
        setStats(110, 85,95,80,95,50);
        setType(Type.NORMAL);
        setMove(new PowerWhip(), new Thunder(), new RockSlide(),new FocusBlast());
    }
}
