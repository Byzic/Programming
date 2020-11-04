package Pokemons;

import Moves.Latias.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Latias extends Pokemon {
    public Latias(String name, int level) {
        super(name, level);
        setStats(80, 80,90,110,130,110);
        setType(Type.DRAGON, Type.PSYCHIC);
        setMove(new MistBall(), new ShadowClaw(), new DreamEater(), new DragonPulse());
    }
}
