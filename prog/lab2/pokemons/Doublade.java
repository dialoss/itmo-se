package pokemons;

import moves.DoubleTeam;
import moves.MetalSound;
import moves.ShadowClaw;
import ru.ifmo.se.pokemon.Type;

public class Doublade extends Honedge {
    public Doublade(String name, int level) {
        super(name, level);
        this.setStats(59, 110, 150, 45, 49, 35);
        this.setType(Type.STEEL, Type.GHOST);
        this.setMove(new DoubleTeam(), new ShadowClaw(), new MetalSound());
    }
}
