package enums;

public enum ItemTypes {
    HAT("шляпа"),
    PANTS("штаны"),
    DRESS("блуза"),
    SQUARES("заплатками"),
    MACHRI("махрами"),
    HOLE("дырками"),
    OLD("протёртостями"),
    FIELDS("полями"),
    STICK("палку"),
    PAPER("газеты");

    private String type;

    ItemTypes(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return this.type;
    }
}