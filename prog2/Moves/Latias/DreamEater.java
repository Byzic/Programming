package Moves.Latias;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {//Пожиратель снов наносит урон только спящим противникам,
    public DreamEater(){    // а пользователь восстанавливает 50% потраченного здоровья.
        type = Type.PSYCHIC;
        power = 100;
        accuracy = 100;
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Pokemon p1= new Pokemon();
        Effect e = new Effect().condition(Status.SLEEP);
        p.addEffect(e);
        if (p.getCondition() == p1.getCondition()){
            Move.getNoMove();
        }
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.HP,-(int)(80-p.getHP())/2);
    }
    @Override
    protected String describe() {
        return "использует атаку Dream Eater";

    }
}
