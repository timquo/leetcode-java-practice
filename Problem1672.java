public class Problem1672 {
    public static void main(String[] args) {
        /*
            You are given an m x n integer grid accounts where accounts[i][j] is the amount of money
            the i-th customer has in the j-th bank. Return the wealth that the richest customer has.

            A customer's wealth is the amount of money they have in all their bank accounts. The
            richest customer is the customer that has the maximum wealth.
        */
        int[][] accounts = {{1, 5}, {7, 3}, {3, 10}};
        System.out.println("For the given input solution is: " + findMaxWealth(accounts));
    }

    private static int findMaxWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int[] customerAccounts : accounts) {
            int currentWealth = 0;

            for (int account : customerAccounts) {
                currentWealth += account;
            }

            maxWealth = Math.max(maxWealth, currentWealth);
        }

        return maxWealth;
    }
}
