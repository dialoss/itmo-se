package output;

public class Description {
    public static <T> String describe(T[] properties) {
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