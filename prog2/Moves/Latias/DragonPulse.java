package Moves.Latias;

import ru.ifmo.se.pokemon.*;

public class DragonPulse extends SpecialMove {  //Пульс дракона наносит урон без дополнительных эффектов.
    public DragonPulse(){
        type = Type.DRAGON;
        power = 85;
        accuracy = 100;
    }
    @Override
    protected String describe() {
        return "использует атаку Dragon Pulse";

    }
}
