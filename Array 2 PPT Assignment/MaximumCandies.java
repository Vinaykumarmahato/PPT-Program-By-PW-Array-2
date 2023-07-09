import java.util.HashSet;
import java.util.Set;

public class MaximumCandies {
    public static int maxCandies(int[] candyType) {
        // Create a set to store the different types of candies
        Set<Integer> uniqueCandies = new HashSet<>();

        // Add each candy type to the set
        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }

        // Return the minimum value between the number of unique candy types and n/2
        return Math.min(uniqueCandies.size(), candyType.length / 2);
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        int maxTypes = maxCandies(candyType);
        System.out.println("Maximum number of different types of candies: " + maxTypes);
    }
}
