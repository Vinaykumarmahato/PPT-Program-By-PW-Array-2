import java.util.Arrays;

public class MaximumProduct {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        // Case 1: All numbers are positive or zero
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        // Case 2: There are negative numbers
        int product2 = nums[0] * nums[1] * nums[n - 1];

        // Return the maximum product
        return Math.max(product1, product2);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int maxProduct = maximumProduct(nums);
        System.out.println("Maximum product: " + maxProduct);
    }
}
