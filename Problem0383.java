import java.util.HashMap;
import java.util.Map;

public class Problem0383 {
    public static void main(String[] args) {
        /*
            Given two strings ransomNote and magazine, return true if ransomNote can be constructed
            by using the letters from magazine and false otherwise.
            Each letter in magazine can only be used once in ransomNote.
        */
        String ransomNote = "hello!";
        String magazine = "this is a style magazine that readers highly enjoy!";
        System.out.println("Solution for the given input is: " + canConstruct(ransomNote, magazine));
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }

        return true;
    }
}