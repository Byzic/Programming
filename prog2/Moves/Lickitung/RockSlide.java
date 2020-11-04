package Moves.Lickitung;

import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {//Rock Slide наносит урон и с вероятностью 30%
    public RockSlide(){                    // заставит цель вздрогнуть .
        type = Type.ROCK;
        power = 75;
        accuracy = 90;
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random()<=0.3){
            Effect.flinch(p);
        }
    }
    @Override
    protected String describe() {
        return "использует атаку Power Whip Rock Slide ";
    }

}
