package com.kaushal;

public class twosum {
    // Renamed from `main` to `findTwoSum` for clarity
    public int[] findTwoSum(int[] nums, int target) {
        int[] result = new int[2];  // Array to store the result indices

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;  // Store the first index
                    result[1] = j;  // Store the second index
                    return result;  // Return the result array
                }
            }
        }
        return null;  // Return null if no solution is found
    }

    // This is the required main method
    public static void main(String[] args) {
        twosum ts = new twosum();

        // Example usage (You can replace this with your own inputs)
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = ts.findTwoSum(nums, target);

        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
