package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class FireFang extends SpecialMove {
    public FireFang() {
        super(Type.FIRE, 65, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        if (!p.hasType(Type.FIRE) && Math.random() <= 0.1) {
            Effect.burn(p);
        }
        if (Math.random() <= 0.1) {
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe() {
        return "move FireFang";
    }
}
