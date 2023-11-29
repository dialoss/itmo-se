package output;

public class Description<T> {
    T[] properties;
    public Description(T[] properties) {
        this.properties = properties;
    }
    public String describe() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < properties.length; i++) {
            builder.append(properties[i]);
            if (i != properties.length - 1) {
                builder.append(", ");
            }
        }
        return builder.toString();
    }
}