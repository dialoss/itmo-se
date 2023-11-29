package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.Type;

public class Gliscor extends Gligar {
    public Gliscor(String name, int level) {
        super(name, level);
        this.setStats(75, 95, 125, 45, 75, 95);
        this.setType(Type.GROUND, Type.FLYING);
        this.setMove(new QuickAttack(), new Swagger(), new SandAttack(), new FireFang());
    }
}
