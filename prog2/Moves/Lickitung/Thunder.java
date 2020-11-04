package Moves.Lickitung;

import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {  // наносит урон и имеет 30% шанс парализовать цель.
    public Thunder(){          // Покемонов электрического типа нельзя парализовать.
        type = Type.ELECTRIC;
        power = 110;
        accuracy = 70;
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random()<=0.3){
            Effect.paralyze(p);
        }
    }
    @Override
    protected String describe() {
        return "использует атаку Power Whip Thunder ";
    }
}
