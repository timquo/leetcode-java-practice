public class Problem0011 {
    public static void main(String[] args) {
        /*
            You are given an integer array height of length n. There are n vertical lines drawn such that the two
            endpoints of the ith line are (i, 0) and (i, height[i]). Find two lines that together with the x-axis
            form a container, such that the container contains the most water. Return the maximum amount of water
            a container can store.
            Notice that you may not slant the container.
        */
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("For the given input solution is: " + maxArea(height));
    }

    private static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int result = Math.min(height[left], height[right]) * (height.length - 1);

        while (left < right) {
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
            int tempArea = Math.min(height[left], height[right]) * (right - left);
            result = Math.max(result, tempArea);
        }

        return result;
    }
}
