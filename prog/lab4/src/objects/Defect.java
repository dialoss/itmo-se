package objects;

import enums.ItemConditions;
import enums.ItemTypes;

public class Defect extends Item {
    String place;
    public Defect(ItemTypes type, ItemConditions condition, String place) {
        super(type, condition);
        this.place = place;
    }

    @Override
    public String toString() {
        return String.format("с %s %s %s", condition, type, place);
    }
}