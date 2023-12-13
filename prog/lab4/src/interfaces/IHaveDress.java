package interfaces;

import exceptions.CharacterHasNoClothesException;

public interface IHaveDress {
    String describeDress() throws CharacterHasNoClothesException;
}