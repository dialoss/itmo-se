package pokemons;
import moves.DoubleTeam;
import moves.IceBeam;
import moves.Slam;
import moves.SludgeBomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Mawile extends Pokemon {
    public Mawile(String name, int level) {
        super(name, level);
        this.setStats(50, 85, 85, 55, 55, 50);
        this.setType(Type.STEEL, Type.FAIRY);
        this.setMove(new IceBeam(), new Slam(), new DoubleTeam(), new SludgeBomb());
    }
}
