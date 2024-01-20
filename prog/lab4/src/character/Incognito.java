package character;

import enums.ItemConditions;
import enums.ItemTypes;
import enums.Emotions;
import exceptions.CharacterHasNoClothesException;
import exceptions.CharacterItemNotFound;
import interfaces.IHaveItems;
import objects.Clothing;
import objects.SecondaryItem;
import output.Description;

public class Incognito extends HumanCharacter implements IHaveItems {
    protected SecondaryItem[] items;
    public Incognito(String name) {
        super(name);

        Clothing dress = new Clothing(ItemTypes.DRESS, ItemConditions.OLD);
        Clothing pants = new Clothing(ItemTypes.PANTS, ItemConditions.DIRT);
        Clothing hat = new Clothing(ItemTypes.HAT, ItemConditions.OLD);

        clothes = new Clothing[]{dress, pants, hat};

        SecondaryItem stick = new SecondaryItem(ItemTypes.STICK, ItemConditions.BRANCH);
        SecondaryItem paper = new SecondaryItem(ItemTypes.PAPER, ItemConditions.PART);

        items = new SecondaryItem[]{stick, paper};

        moodState = new Emotions[]{
                Emotions.THIN, Emotions.DRIED, Emotions.SMUG, Emotions.STRICT, Emotions.HURT,
        };
    }

    @Override
    public String itemAction(String action, ItemTypes itemType) throws CharacterItemNotFound {
        for (SecondaryItem it : items) {
            if (it.equals(itemType)) {
                return name + " " + action + " " + Description.describe(new SecondaryItem[]{it});
            }
        }
        throw new CharacterItemNotFound(String.format("У %s нет предмета %s", name, itemType));
    }

    @Override
    public String describeItems() {
        return "свою " + Description.describe(items);
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
