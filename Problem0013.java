import java.util.HashMap;
import java.util.Map;

public class Problem0013 {
    public static void main(String[] args) {
        /*
            Given a roman numeral, convert it to an integer.
        */
        System.out.println("For the given input solution is: " + romanToInt("IX"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentValue = values.get(currentChar);

            // Check if subtractive notation is used (IV, IX, etc.)
            if (i < s.length() - 1) {
                char nextChar = s.charAt(i + 1);
                int nextValue = values.get(nextChar);

                if (nextValue > currentValue) {
                    // Subtract the current value because it's part of a subtractive notation
                    result -= currentValue;
                    continue;
                }
            }

            result += currentValue;
        }

        return result;
    }
}