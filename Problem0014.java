public class Problem0014 {
    public static void main(String[] args) {
        /*
            Write a function to find the longest common prefix string amongst an array of strings.
            If there is no common prefix, return an empty string "".
        */
        String[] wordList = {"flower","flow","flight"};
        System.out.println("For the given input solution is: " + findCommonPrefix(wordList));
    }

    private static String findCommonPrefix (String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while (j < prefix.length() && j < strs[i].length() && prefix.charAt(j) == strs[i].charAt(j)) {
                j++;
            }

            prefix = prefix.substring(0, j);

            if (prefix.isEmpty()) {
                break;
            }
        }

        return prefix;
    }
}
