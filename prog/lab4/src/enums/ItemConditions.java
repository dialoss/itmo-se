package enums;

public enum ItemConditions {
    DEFAULT(""),
    BLUE("синий"),
    WHITE("белыми"),
    DIRT("грязновато-серые"),
    BLACK("черными"),
    GRAY("седой"),
    DAMAGED("оборванными"),
    OLD("старая"),
    BRANCH("сучковатую"),
    PART("клочок");

    private String condition;

    ItemConditions(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return this.condition;
    }
}