package character;


import enums.ItemConditions;
import enums.ItemTypes;
import objects.Clothing;

public class Neznaika extends HumanCharacter {
    public Neznaika(String name) {
        super(name);
        Clothing dress = new Clothing(ItemTypes.DRESS, ItemConditions.OLD);
        Clothing pants = new Clothing(ItemTypes.PANTS, ItemConditions.DIRT);
        Clothing hat = new Clothing(ItemTypes.HAT, ItemConditions.OLD);

        clothes = new Clothing[]{dress, pants, hat};
    }
}
