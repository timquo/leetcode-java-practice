public class Problem0136 {
    public static void main(String[] args) {
        /*
            Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
            You must implement a solution with a linear runtime complexity and use only constant extra space.
        */
        int[] arr = {1, 1, 3, 4, 4, 5, 5};
        System.out.println("For the given input solution is: " + findSingleNumber(arr));
    }

    public static int findSingleNumber(int[] nums) {
        int result = 0;

        // XOR all elements in the array
        for (int num : nums) {
            result ^= num;
        }

        return result;
    }
}