public class Problem0007 {
    public static final int MAX_DIV_10 = Integer.MAX_VALUE % 10;
    public static final int MIN_DIV_10 = Integer.MIN_VALUE % 10;

    public static void main(String[] args) {
        /*
            Given a signed 32-bit integer x, return x with its digits reversedNum.
            If reversing x causes the value to go outside the signed 32-bit integer
            range [-231, 231 - 1], then return 0. Assume the environment does not
            allow you to store 64-bit integers (signed or unsigned).
        */
        System.out.println("For the given input solution is: " + reverse(34567));
    }

    private static int reverse(int number) {
        int reversedNum = 0;

        while (number != 0) {
            int digit = number % 10;

            // Check for overflow before updating the reversedNum integer
            if (reversedNum > Integer.MAX_VALUE / 10 || (reversedNum == Integer.MAX_VALUE / 10 && digit > MAX_DIV_10)) {
                return 0;
            }
            if (reversedNum < Integer.MIN_VALUE / 10 || (reversedNum == Integer.MIN_VALUE / 10 && digit < MIN_DIV_10)) {
                return 0;
            }

            reversedNum = reversedNum * 10 + digit;
            number /= 10;
        }

        return reversedNum;
    }
}
