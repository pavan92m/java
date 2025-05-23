import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ComparableMain {
    public static void main(String[] args) {
        int[] numbers = { 5, 3, 8, 2, 1 };
        System.out.println("Original array: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        char[] characters = { 'o', 'i', 'e', 'u', 'a' };
        System.out.println("Original array: " + Arrays.toString(characters));

        Arrays.sort(characters);
        System.out.println("Sorted array: " + Arrays.toString(characters));

        ArrayList<String> wordsList = new ArrayList<>();
        wordsList.add("banana");
        wordsList.add("apple");
        wordsList.add("cherry");
        wordsList.add("date");
        System.out.println("Original list: " + wordsList);

        Collections.sort(wordsList);
        System.out.println("Sorted list: " + wordsList);
    }
}
