package Moves.Lickilicky;

import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove { //Focus Blast наносит урон и имеет 10%
    public FocusBlast(){  // шанс понизить специальную защиту цели на один уровень.
        type = Type.FIGHTING;
        power = 120;
        accuracy = 70;
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
        p.addEffect(e);
    }
    @Override
    protected String describe() {
        return "использует атаку Focus Blast";
    }
}
