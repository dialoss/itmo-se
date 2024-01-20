package objects;

import enums.ItemConditions;
import enums.ItemTypes;
import output.Description;

public class Clothing extends Item {
    private Defect[] defects;

    protected class Defect extends Item {
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

    public Clothing(ItemTypes type, ItemConditions condition) {
        super(type, condition);
        switch (type) {
            case DRESS ->
                this.defects = new Defect[]{new Defect(ItemTypes.OLD, ItemConditions.WHITE, "на локтях")};
            case PANTS ->
                this.defects = new Defect[]{
                        new Defect(ItemTypes.MACHRI, ItemConditions.DEFAULT, "внизу"),
                        new Defect(ItemTypes.SQUARES, ItemConditions.BLACK, "на коленках"),
                };
            case HAT ->
                this.defects = new Defect[]{
                        new Defect(ItemTypes.HOLE, ItemConditions.DEFAULT, "на самом видном месте"),
                        new Defect(ItemTypes.FIELDS, ItemConditions.DAMAGED, "по краям"),
                };
            default -> this.defects = new Defect[]{};
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s ", condition, type) + Description.describe(defects);
    }
}
