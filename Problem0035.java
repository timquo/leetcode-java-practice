public class Problem0035 {
    public static void main(String[] args) {
        /*
            Given a sorted array of distinct integers and a target value, return the index if the target is found.
            If not, return the index where it would be if it were inserted in order.
        */
        int[] arr = {1, 2, 4, 5, 6};
        System.out.println("For the given input solution is: " + searchInsert(arr, 17));
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }

        return nums.length;
    }
}
