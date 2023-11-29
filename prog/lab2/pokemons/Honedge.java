package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Honedge extends Pokemon {
    public Honedge(String name, int level) {
        super(name, level);
        this.setStats(45, 80, 100, 35, 37, 28);
        this.setType(Type.STEEL, Type.GHOST);
        this.setMove(new DoubleTeam(), new ShadowClaw());
    }
}
