package separateqs;

import java.util.HashMap;
import java.util.Scanner;

public class twosum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int target = sc.nextInt();
        int[] b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        for (int i : twoSum(b,target))
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // Hash map to store the number and its index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Find the complement of the current number

            // Check if the complement is already in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i }; // Return the indices if complement is found
            }

            // If complement is not found, add the current number and its index to the map
            map.put(nums[i], i);
        }

        return null; // Return null if no solution is found
    }
}
