public class Problem0070 {
    public static void main(String[] args) {
        /*
            You are climbing a staircase. It takes n steps to reach the top.
            Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
        */
        int staircaseSteps = 6;
        System.out.println("For the given input solution is: " + climbingVariations(staircaseSteps));
    }

    private static int climbingVariations (int steps) {
        if (steps <= 2) {
            return steps;
        }

        // climbingVariations(x) == climbingVariations(x - 1) + climbingVariations (x + 2), hence the solution:
        int[] dp = new int[steps + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= steps; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[steps];
    }
}