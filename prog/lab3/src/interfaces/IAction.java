package interfaces;

import character.Character;
import enums.Emotions;

public interface IAction {
    void emote(Emotions emotion);
    String walk();
    String lookAt(Character character, String place);
    String talk(String speech);
}