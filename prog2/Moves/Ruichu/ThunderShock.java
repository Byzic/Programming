package Moves.Ruichu;

import ru.ifmo.se.pokemon.*;

public class ThunderShock extends SpecialMove {//Thunder Shock наносит урон и имеет 10% шанс парализовать цель.
    public ThunderShock(){                // Покемонов электрического типа нельзя парализовать.
        type = Type.ELECTRIC;
        power = 40;
        accuracy = 100;
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random()>0.1){
            Effect.paralyze(p);
        }
    }
    @Override
    protected String describe() {
        return "использует атаку Power Whip Thunder Shock ";
    }
}
