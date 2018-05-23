package util;

public class StringUtils {

    public static String convert(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int item : array) {
            sb.append(item);
        }
        return sb.toString();
    }
}
