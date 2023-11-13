public class Problem0005 {
    public static void main(String[] args) {
        /*
            Given a string s, return the longest palindromic substring in s.
            Example 1:
                Input: s = "babad"
                Output: "bab"
                Explanation: "aba" is also a valid answer.
            Example 2:
                Input: s = "cbbd"
                Output: "bb"

            Constraints:
                1 <= s.length <= 1000
                s consist of only digits and English letters.
         */
        String s = "babad";
        System.out.println("For the given input solution is: " + findLongestPalindrome(s));
    }

    private static String findLongestPalindrome (String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return "";
        }

        int length = inputString.length();

        // Iterate through substrings of decreasing length in the input string
        for (int i = length; i > 0; i--) {
            for (int j = 0; j <= length - i; j++) {
                String currentSubstring = inputString.substring(j, j + i);
                if (isPalindrome(currentSubstring)) {
                    return currentSubstring;
                }
            }
        }
        return "";
    }

    private static Boolean isPalindrome (String substring) {
        int length = substring.length();
        for (int i = 0; i < length / 2; i++) {
            if (substring.charAt(i) != substring.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
//        return substring.contentEquals(new StringBuilder(substring).reverse()); // Too slow
    }
}