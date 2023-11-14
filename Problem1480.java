import java.util.Arrays;

public class Problem1480 {
    public static void main(String[] args) {
        /*
            Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
            Return the running sum of nums.

            Example 1:
            Input: nums = [1,2,3,4]
            Output: [1,3,6,10]
            Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
        */
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("For the given input solution is: " + Arrays.toString(convertArrayToRunningSum(nums)));
    }

     private static int[] convertArrayToRunningSum(int[] nums) {
         if (nums == null || nums.length == 0) {
             return new int[0];
         }

         int[] runningSum = new int[nums.length];
         runningSum[0] = nums[0];

         for (int i = 1; i < nums.length; i++) {
             runningSum[i] = runningSum[i - 1] + nums[i];
         }

         return runningSum;
     }
}