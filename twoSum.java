import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Test the solution
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + Arrays.toString(result));
        // Output: Indices: [0, 1]
    }
    
    public static int[] twoSum(int[] nums, int target) {
        // Check every pair of numbers
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        
        // Return empty array if no solution found
        return new int[] {};
    }
}
