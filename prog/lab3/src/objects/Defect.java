package objects;

import enums.ClothingCondition;
import enums.ClothingTypes;

public class Defect extends Item {
    String place;
    public Defect(ClothingTypes type, ClothingCondition condition, String place) {
        super(type, condition);
        this.place = place;
    }

    @Override
    public String toString() {
        return String.format("с %s %s %s", condition, type, place);
    }
}