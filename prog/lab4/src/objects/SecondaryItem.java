package objects;


import enums.ItemConditions;
import enums.ItemTypes;

import java.util.Objects;


public class SecondaryItem extends Item {
    public SecondaryItem(ItemTypes type, ItemConditions condition) {
        super(type, condition);
    }
    @Override
    public String toString() {
        return String.format("%s %s ", condition, type);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof ItemTypes) return Objects.equals(this.type.toString(), o.toString());
        return false;
    }
}
