package objects;

import enums.ItemConditions;
import enums.ItemTypes;

abstract class Item {
    ItemTypes type;
    ItemConditions condition;

    Item(ItemTypes type, ItemConditions condition) {
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