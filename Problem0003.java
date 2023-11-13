import java.util.HashSet;

public class Problem0003 {
    public static void main(String[] args) {
        /*
            Given a string s, find the length of the longest substring
            without repeating characters.

            Example 1:
                Input: s = "abcabcbb"
                Output: 3
                Explanation: The answer is "abc", with the length of 3.
        */
        String s = "aaaabcdeeee";
        System.out.println("For the given input solution is: " + findLongestSubstring(s));
    }

    private static int findLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLen = 0;

        // Sliding window parsing
        while (right < n) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLen;
    }
}