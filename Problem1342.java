public class Problem1342 {
    public static void main(String[] args) {
        /*
            You are given an m x n integer grid accounts where accounts[i][j] is the amount of money
            the i-th customer has in the j-th bank. Return the wealth that the richest customer has.

            A customer's wealth is the amount of money they have in all their bank accounts. The
            richest customer is the customer that has the maximum wealth.
        */
        int number = 17;
        System.out.println("For the given input solution is: " + countStepsToReduceNum(number));
    }

    private static int countStepsToReduceNum(int n) {
        int steps = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n--;
            }

            steps++;
        }

        return steps;
    }
}