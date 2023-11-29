package enums;

public enum ClothingCondition {
    DEFAULT(""),
    BLUE("синий"),
    WHITE("белыми"),
    DIRT("грязновато-серые"),
    BLACK("черными"),
    GRAY("седой"),
    DAMAGED("оборванными"),
    OLD("старая");

    private String condition;

    ClothingCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return this.condition;
    }
}