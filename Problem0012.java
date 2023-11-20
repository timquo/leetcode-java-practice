public class Problem0012 {
    public static void main(String[] args) {
        /*
            Given an integer, convert it to a roman numeral.
        */
        System.out.println("For the given input solution is: " + intToRoman(2345));
    }

    private static String intToRoman(int num) {
        if (num < 1 || num > 3999) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                result.append(numerals[i]);
            }
        }

        return result.toString();
    }
}
