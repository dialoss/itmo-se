package pokemons;

import moves.DoubleTeam;
import moves.MetalSound;
import moves.ShadowClaw;
import ru.ifmo.se.pokemon.Type;

public class AegislashBlade extends Doublade {
    public AegislashBlade(String name, int level) {
        super(name, level);
        this.setStats(60, 140, 50, 140, 50, 60);
        this.setType(Type.STEEL, Type.GHOST);
        this.setMove(new DoubleTeam(), new ShadowClaw(), new MetalSound());
    }
}
