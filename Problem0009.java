public class Problem0009 {
    public static void main(String[] args) {
        /*
            Given an integer x, return true if x is a palindrome, and false otherwise.
        */
        System.out.println("For the given input solution is: " + isPalindrome(1111));
    }

    private static boolean isPalindrome(int num){
        String numString = "" + num;
        int length = numString.length();

        for (int i = 0; i < (length / 2); i++) {
            if (numString.charAt(length - 1 - i) != numString.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
