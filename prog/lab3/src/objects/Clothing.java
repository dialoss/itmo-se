package objects;

import enums.ClothingCondition;
import enums.ClothingTypes;
import output.Description;

public class Clothing extends Item {
    private final Defect[] defects;
    public Clothing(ClothingTypes type, ClothingCondition condition, Defect[] defects) {
        super(type, condition);
        this.defects = defects;
    }

    @Override
    public String toString() {
        return String.format("%s %s ", condition, type) + new Description<>(defects).describe();
    }
}
