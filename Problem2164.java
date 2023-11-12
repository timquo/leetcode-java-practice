import java.util.Arrays;

public class Problem2164 {
    public static void main(String[] args) {
        /*
            You are given a 0-indexed integer array nums. Rearrange the values of nums according
            to the following rules:

            Sort the values at odd indices of nums in non-increasing order.
            For example, if nums = [4,1,2,3] before this step, it becomes [4,3,2,1] after. The
            values at odd indices 1 and 3 are sorted in non-increasing order.
            Sort the values at even indices of nums in non-decreasing order.
            For example, if nums = [4,1,2,3] before this step, it becomes [2,1,4,3] after. The
            values at even indices 0 and 2 are sorted in non-decreasing order.
            Return the array formed after rearranging the values of nums.
         */
        int[] nums = {4,1,5,2,3};
        nums = solve(nums);
        System.out.println("For the given input solution is: " + Arrays.toString(nums));
    }

    public static int[] solve(int[] nums) {
        rearrangeArray(nums);
        return nums;
    }

    public static void rearrangeArray(int[] nums) {
        int[] oddSubarray = extractSubarray(nums, false);
        int[] evenSubarray = extractSubarray(nums, true);

        Arrays.sort(oddSubarray);
        reverse(oddSubarray);

        Arrays.sort(evenSubarray);

        mergeArrays(nums, evenSubarray, oddSubarray);
    }

    private static int[] extractSubarray(int[] nums, boolean isEven) {
        int subarraySize = (nums.length + (isEven ? 1 : 0)) / 2;
        int[] subarray = new int[subarraySize];

        for (int i = 0, j = (isEven ? 0 : 1); i < subarraySize; i++, j += 2) {
            subarray[i] = nums[j];
        }
        return subarray;
    }


    private static void mergeArrays(int[] original, int[] evenSubarray, int[] oddSubarray) {
        int n = original.length;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                original[i] = evenSubarray[i / 2];
            } else {
                original[i] = oddSubarray[i / 2];
            }
        }
    }

    private static void reverse(int[] arr) {
        for (int i = 0; i < (arr.length / 2); i++) {
            int j = arr.length - i - 1;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
