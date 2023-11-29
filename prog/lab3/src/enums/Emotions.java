package enums;

public enum Emotions {
    SAD("грустное"),
    SMILE("весёлое"),
    STRICT("строгое"),
    ALARM("настороженный"),
    ALERT("встревожженный"),
    THIN("худое"),
    DRIED("иссохшое"),
    SMUG("смуглое"),
    HURT("болезненное");

    private String type;

    Emotions(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}