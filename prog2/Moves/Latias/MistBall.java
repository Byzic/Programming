package Moves.Latias;

import ru.ifmo.se.pokemon.*;

public class MistBall extends SpecialMove {//Mist Ball наносит урон и с вероятностью 50%
    public MistBall() {            // снижает специальную атаку цели на один уровень.
        type = Type.PSYCHIC;
        power = 70;
        accuracy = 100;
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.5).stat(Stat.SPECIAL_ATTACK, -1);
        p.addEffect(e);
    }
    @Override
    protected String describe() {
        return "использует атаку Mist Ball";

    }
}
