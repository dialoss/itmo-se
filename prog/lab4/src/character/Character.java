package character;

import exceptions.CharacterNameException;
import interfaces.*;

import java.util.Objects;

public abstract class Character implements ITalkable {
    protected String name;

    @Override
    public String talk(String speech) {
        return name + " говорит: " + speech;
    }

    public String getName() {
        return name;
    }

    public Character(String name) throws CharacterNameException {
        if (name.length() == 0) {
            throw new CharacterNameException("Введите имя персонажа!");
        }
        this.name = name;
    }

    @Override
    public String greeting(Character character) {
        return this.talk("Привет, " + character.getName());
    }

    @Override
    public String ask(String question) {
        return name + " спросил: " + question;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Character character = (Character) obj;
        return Objects.equals(name, character.name);
    }
}
