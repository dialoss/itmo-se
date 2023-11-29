package character;

import enums.Emotions;
import interfaces.*;
import objects.Clothing;
import output.Description;

import java.util.Objects;

public abstract class Character implements
        IEmotional,
        ICanSee,
        ITalkable,
        IWalkable,
        IDescribable {

    protected String name;
    protected Emotions[] moodState;
    protected Clothing[] clothes;

    @Override
    public String talk(String speech) {
        return name + " говорит: " + speech;
    }

    @Override
    public String walk() {
        return name + " пришёл";
    }

    @Override
    public String lookAt(Character character, String place) {
        return name + " посмотрел на " + place + " " + character.name;
    }

    @Override
    public void emote(Emotions emotion) {
        moodState = new Emotions[]{emotion};
    }

    @Override
    public String describeEmotions() {
        return "У " + name + " " + Description.describe(moodState) + " лицо";
    }

    @Override
    public String describeDress() {
        if (clothes != null && clothes.length > 0) {
            return "На нём: " + Description.describe(clothes);
        } else {
            return "У " + name + " нет одежды";
        }
    }

    public String getName() {
        return name;
    }

    public Character(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return describeEmotions();
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
