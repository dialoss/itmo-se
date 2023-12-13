package interfaces;

import enums.ItemTypes;
import exceptions.CharacterItemNotFound;

public interface IHaveItems {
    String describeItems();
    String itemAction(String action, ItemTypes itemType) throws CharacterItemNotFound;
}