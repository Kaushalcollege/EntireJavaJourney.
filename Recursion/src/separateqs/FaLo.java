package separateqs;

import java.util.Scanner;

public class FaLo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] result = falo(a, m);
        System.out.print(result[0] + " " + result[1]);
    }

    public static int[] falo(int[] a, int m) {
        int[] b = new int[2]; // b[0] for first occurrence, b[1] for last occurrence
        b[0] = -1; // Initialize to -1 to signify not found
        b[1] = -1; // Initialize to -1 to signify not found

        // Find first occurrence
        for (int i = 0; i < a.length; i++) {
            if (a[i] == m) {
                b[0] = i+1; // Store the index of the first occurrence
                break; // No need to continue searching
            }
        }

        // Find last occurrence
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == m) {
                b[1] = i+1; // Store the index of the last occurrence
                break; // No need to continue searching
            }
        }

        return b;
    }
}
