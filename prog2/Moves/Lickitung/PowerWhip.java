package Moves.Lickitung;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class PowerWhip extends PhysicalMove { //Power Whip наносит урон без дополнительных эффектов.
    public PowerWhip(){
        type = Type.GRASS;
        power = 120;
        accuracy = 85;
    }
    @Override
    protected String describe() {
        return "использует атаку Power Whip ";
    }
}
