package arrayquestions;

import java.util.Scanner;

public class RotateArrayRight1 {
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

    /*
    Explanation of what the idea is:
        let us assume we are given an array [1, 2, 3, 4, 5, 6, 7, 8].
        If we are asked to rotate the array by 2 elements to the right,
        the resultant array is: [7, 8, 1, 2, 3, 4, 5, 6].
     */
    static int[] rotateby(int[] a, int k) {
        int n = a.length;
        k = k % n; // To handle cases where k > n

        // Step 1: Save the last k elements
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = a[n - k + i];
        }

        // Step 2: Shift the rest of the array to the right by k positions
        for (int i = n - 1; i >= k; i--) {
            a[i] = a[i - k];
        }

        // Step 3: Copy the saved elements (temp) to the beginning of the array
        for (int i = 0; i < k; i++) {
            a[i] = temp[i];
        }

        return a;
    }
}
