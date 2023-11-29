package objects;

import enums.ClothingCondition;
import enums.ClothingTypes;

abstract class Item {
    ClothingTypes type;
    ClothingCondition condition;

    Item(ClothingTypes type, ClothingCondition condition) {
        this.type = type;
        this.condition = condition;
    }

    @Override
    public int hashCode() {
        return type.hashCode() + condition.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return item.type == this.type && item.condition == this.condition;
    }
}