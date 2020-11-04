package Moves.Latias;

import ru.ifmo.se.pokemon.*;

public class ShadowClaw extends PhysicalMove {//Shadow Claw наносит урон и имеет повышенный
    public ShadowClaw(){      //  коэффициент критического удара ( 1 ⁄ 8 вместо 1 ⁄ 24 )
        type = Type.GHOST;
        power = 70;
        accuracy = 100;
    }
    @Override
    protected double calcCriticalHit(Pokemon var1, Pokemon var2) {
        if (3 * var1.getStat(Stat.SPEED) / 512.0D > Math.random()) {
            return 2.0D;
        } else {
            return 1.0D;
        }
    }
    @Override
    protected String describe() {
        return "использует атаку Shadow Claw";

    }
}

