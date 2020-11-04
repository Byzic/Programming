package Moves.Pichu;

import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove {//Charge Beam наносит урон и имеет 70% шанс
    public ChargeBeam(){   // повысить специальную атаку пользователя на один уровень.
        type = Type.ELECTRIC;
        power = 50;
        accuracy = 90;
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().chance(0.7).stat(Stat.SPECIAL_ATTACK, +1);
        p.addEffect(e);
    }
    @Override
    protected String describe() {
        return "использует атаку Charge Beam ";
    }
}
