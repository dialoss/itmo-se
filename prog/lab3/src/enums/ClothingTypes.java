package enums;

public enum ClothingTypes {
    HAT("шляпа"),
    PANTS("штаны"),
    DRESS("блуза"),
    SQUARES("заплатками"),
    MACHRI("махрами"),
    HOLE("дырками"),
    OLD("протёртостями"),
    FIELDS("полями");

    private String type;

    ClothingTypes(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return this.type;
    }
}