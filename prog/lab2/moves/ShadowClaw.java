package moves;

import ru.ifmo.se.pokemon.*;

public class ShadowClaw extends PhysicalMove {
    public ShadowClaw() {
        super(Type.GHOST, 70, 100);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        double ratio = 1 / 8.0;
        return super.calcCriticalHit(att, def);
    }

    @Override
    protected String describe() {
        return "move ShadowClaw";
    }
}
