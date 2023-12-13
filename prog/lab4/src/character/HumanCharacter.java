package character;

import enums.Emotions;
import exceptions.CharacterHasNoClothesException;
import interfaces.ICanSee;
import interfaces.IEmotional;
import interfaces.IHaveDress;
import interfaces.IWalkable;
import objects.Clothing;
import output.Description;

public abstract class HumanCharacter extends Character implements
        IHaveDress,
        IEmotional,
        ICanSee,
        IWalkable {

    protected Emotions[] moodState;
    protected Clothing[] clothes;

    public HumanCharacter(String name) {
        super(name);
    }

    public HumanCharacter(String name,  Clothing[] clothes) {
        super(name);
        this.clothes = clothes;
    }

    @Override
    public String walk() {
        return name + " пришёл";
    }

    @Override
    public String lookAt(Character character, String place) {
        class SpecialSentence {
            final String place;
            final Character character;

            public SpecialSentence(Character character, String place) {
                this.place = place;
                this.character = character;
            }

            @Override
            public String toString() {
                return getName() + " посмотрел на " + place + " " + character.getName();
            }
        }
        return new SpecialSentence(character, place).toString();
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
    public String toString() {
        return describeEmotions();
    }

    @Override
    public String describeDress() throws CharacterHasNoClothesException {
        if (clothes != null && clothes.length > 0) {
            return "На нём: " + Description.describe(clothes);
        } else {
            throw new CharacterHasNoClothesException("У " + name + " нет одежды!");
        }
    }
}
