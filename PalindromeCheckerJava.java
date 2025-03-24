import java.util.stream.IntStream;

public class PalindromeCheckerJava {
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        // Normalize: remove spaces, convert to lowercase, and remove non-alphanumeric chars
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if it reads the same forward and backward
        return IntStream.range(0, cleanedStr.length() / 2)
                .allMatch(i -> cleanedStr.charAt(i) == cleanedStr.charAt(cleanedStr.length() - i - 1));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal, Panama")); // true
        System.out.println(isPalindrome("racecar")); // true
        System.out.println(isPalindrome("Java"));    // false
    }
}
