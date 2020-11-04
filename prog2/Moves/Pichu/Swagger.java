package Moves.Pichu;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {//Swagger сбивает цель с толку и увеличивает ее атаку на два уровня.
    public Swagger(){
        type = Type.NORMAL;
        accuracy = 85;
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.confuse(p);
        Effect e = new Effect().stat(Stat.ATTACK, +2);
        p.addEffect(e);
    }
    @Override
    protected String describe() {
        return "использует атаку Power Whip Swagger ";
    }
}
