package moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Slam extends SpecialMove {
    public Slam() {
        super(Type.NORMAL, 80, 75);
    }

    @Override
    protected String describe() {
        return "move Slam";
    }
}
