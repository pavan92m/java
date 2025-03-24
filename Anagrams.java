import java.util.stream.Collectors;
public class Anagrams {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        // Normalize: remove spaces, convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Sort and compare
        String sortedStr1 = str1.chars()
                .sorted()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        String sortedStr2 = str2.chars()
                .sorted()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        return sortedStr1.equals(sortedStr2);
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("Listen", "Silent")); // true
        System.out.println(areAnagrams("Java", "Vaja"));     // true
        System.out.println(areAnagrams("Test", "Best"));     // false
    }


}
