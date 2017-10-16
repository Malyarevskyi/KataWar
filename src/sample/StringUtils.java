package sample;

public class StringUtils {

    public static String toAlternativeString(String string) {
        StringBuilder encoded = new StringBuilder();
        for (char i : string.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append(Character.toLowerCase(i));
                } else {
                    encoded.append(Character.toUpperCase(i));
                }
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }
}

