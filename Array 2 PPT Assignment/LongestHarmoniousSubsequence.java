import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {
    public static int findLHS(int[] nums) {
        // Create a HashMap to count the frequency of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each number in the array
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxLength = 0;
        // Iterate through the array and check if the current number and its adjacent numbers form a harmonious subsequence
        for (int num : nums) {
            int count = frequencyMap.getOrDefault(num, 0);
            int adjacentCount1 = frequencyMap.getOrDefault(num + 1, 0);
            int adjacentCount2 = frequencyMap.getOrDefault(num - 1, 0);

            if (adjacentCount1 != 0) {
                maxLength = Math.max(maxLength, count + adjacentCount1);
            }

            if (adjacentCount2 != 0) {
                maxLength = Math.max(maxLength, count + adjacentCount2);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int longestSubsequenceLength = findLHS(nums);
        System.out.println("Length of the longest harmonious subsequence: " + longestSubsequenceLength);
    }
}
