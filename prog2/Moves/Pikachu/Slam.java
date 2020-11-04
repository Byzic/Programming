package Moves.Pikachu;

import ru.ifmo.se.pokemon.*;

public class Slam extends PhysicalMove {//Удар наносит урон без дополнительных эффектов.
    public Slam(){
        type = Type.NORMAL;
        power = 80;
        accuracy = 75;
    }
    @Override
    protected String describe() {
        return "использует атаку Power Whip Slam ";
    }
}
