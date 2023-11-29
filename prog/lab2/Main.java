import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        b.addAlly(new Mawile("Izochen", 1));
        b.addAlly(new Doublade("Brainiaceleven", 1));
        b.addAlly(new Gligar("Redshock", 1));

        b.addFoe(new Gliscor("Olupishebi", 1));
        b.addFoe(new Honedge("Ramzess", 1));
        b.addFoe(new AegislashBlade("Kolyan", 1));

        b.go();
    }
}
