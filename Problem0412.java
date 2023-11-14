import java.util.ArrayList;
import java.util.List;

public class Problem0412 {
    public static void main(String[] args) {
        /*
            You are given an m x n integer grid accounts where accounts[i][j] is the amount of money
            the i-th customer has in the j-th bank. Return the wealth that the richest customer has.

            A customer's wealth is the amount of money they have in all their bank accounts. The
            richest customer is the customer that has the maximum wealth.
        */
        int number = 17;
        System.out.println("For the given input solution is: " + fizzBuzz(17));
    }

    private static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            String s = "";

            if (divisibleBy3) {
                s += "Fizz";
            }

            if (divisibleBy5) {
                s += "Buzz";
            }

            if (s.isEmpty()) {
                s +=  String.valueOf(i);
            }

            result.add(s);
        }
        return result;
    }

}
