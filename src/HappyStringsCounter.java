import java.util.List;

public class HappyStringsCounter {

    public static void main(String[] args) {
        List<String> strings = List.of("abbcc", "abc", "abcabc", "cabcbb");
        int result = numberOfHappyStrings(strings);
        System.out.println("Result: " + result);
    }

    public static int numberOfHappyStrings(List<String> strings) {
        int happyCount = 0;

        for (String str : strings) {
            if (isHappyString(str)) {
                happyCount++;
            }
        }

        return happyCount;
    }

    public static boolean isHappyString(String str) {
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                return false; // Not a happy string
            }
        }
        return true; // Happy string
    }
}
