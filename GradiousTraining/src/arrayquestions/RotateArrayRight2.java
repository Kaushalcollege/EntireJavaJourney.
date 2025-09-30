package arrayquestions;

import java.util.Scanner;

public class RotateArrayRight2 {
     public static int[] rotateby(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);        
        reverse(nums, 0, k - 1);                
        reverse(nums, k, nums.length - 1);  
        return nums;    
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int[] a = new int[n]; // Declaration of array

        // Input of the array from user:
        for (int i = 0; i < n; i++) {
            a[i] = x.nextInt();
        }

        // Displaying the original array:
        System.out.print("Original array: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Input the value of k (number of rotations):
        int k = x.nextInt();

        // Rotate and display the rotated array:
        System.out.print("Array after rotation: ");
        for (int i : rotateby(a, k)) {
            System.out.print(i + " ");
        }
    }
}
