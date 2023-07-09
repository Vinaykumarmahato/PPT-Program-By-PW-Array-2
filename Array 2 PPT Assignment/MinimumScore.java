public class MinimumScore {
    public static int minimumScore(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find the minimum and maximum values in the array
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Calculate the initial score
        int initialScore = max - min;

        // If the initial score is already 0, return 0
        if (initialScore == 0) {
            return 0;
        }

        // Update the minimum and maximum values
        min -= k;
        max += k;

        // Calculate the new score
        int newScore = max - min;

        return newScore;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        int minScore = minimumScore(nums, k);
        System.out.println("Minimum score: " + minScore);
    }
}
