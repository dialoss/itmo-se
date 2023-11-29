package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Gligar extends Pokemon {
    public Gligar(String name, int level) {
        super(name, level);
        this.setStats(65, 75, 105, 35, 65, 85);
        this.setType(Type.GROUND, Type.FLYING);
        this.setMove(new QuickAttack(), new Swagger(), new SandAttack());
    }
}
