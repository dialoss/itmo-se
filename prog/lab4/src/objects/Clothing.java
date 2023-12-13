package objects;

import enums.ItemConditions;
import enums.ItemTypes;
import output.Description;

public class Clothing extends Item {
    private final Defect[] defects;
    public Clothing(ItemTypes type, ItemConditions condition, Defect[] defects) {
        super(type, condition);
        this.defects = defects;
    }

    @Override
    public String toString() {
        return String.format("%s %s ", condition, type) + Description.describe(defects);
    }
}
