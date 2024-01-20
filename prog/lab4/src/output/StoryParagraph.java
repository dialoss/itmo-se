package output;

public class StoryParagraph {
    protected String text;
    protected String type;
    protected String heading;

    public StoryParagraph(String type) {
        this.type = type;
    }

    public void compose() {
        this.text = "";
        this.heading = "";
    }

    @Override
    public String toString() {
        return heading.toUpperCase() + "\n" + text;
    }
}
