package arrayquestions;

import java.util.Scanner;

public class arrayquestion1 {
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
       int[] temp = new int[n];
       for(int i = 0 ; i < n ; i++){
           temp[( i + k ) % n] = a[i];
       }
       return temp;
    }
}
