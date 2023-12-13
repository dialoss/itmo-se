package exceptions;

public class CharacterItemNotFound extends RuntimeException {
    public CharacterItemNotFound(String message) {
        super(message);
    }
}
