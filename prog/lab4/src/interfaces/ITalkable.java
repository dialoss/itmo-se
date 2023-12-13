package interfaces;

import character.Character;

public interface ITalkable {
    String talk(String speech);
    String greeting(Character character);
    String ask(String question);
}