package moves;

import ru.ifmo.se.pokemon.*;

import java.util.Arrays;

public class SandAttack extends StatusMove {
    public SandAttack() {
        super(Type.GROUND, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        p.setMod(Stat.ACCURACY, -1);
    }

    @Override
    protected String describe() {
        return "move SandAttack";
    }
}
