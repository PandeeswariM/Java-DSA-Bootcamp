package Recursion;

public class TargetSum {
    public static void main(String[] args) {
        System.out.println(Math.pow(2.00000,10));
        int[] nums = new int[]{1,1,1,1,1};
        int target = 3;
        System.out.println(findTargetSumWays(nums,target));
    }

    public static int findTargetSumWays(int[] nums, int target) {
        return helper(nums, 0, 0, target);
    }

    private static int helper(int[] nums, int index, int curSum, int target) {
        // Base case: when we reach the end of the array
        if (index == nums.length) {
            // Check if we have reached the target sum
            if (curSum == target) {
                return 1; // Return 1 to indicate that we have found a valid combination
            } else {
                return 0; // Return 0 to indicate that we have not found a valid combination
            }
        }

        // Recursive case: we can either add or subtract the current number to the current sum
        int left = helper(nums, index + 1, curSum + nums[index], target); // Add the current number to the current sum
        int right = helper(nums, index + 1, curSum - nums[index], target); // Subtract the current number from the current sum
        return left + right; // Return the sum of the results obtained from the left and right subproblems
    }

}
