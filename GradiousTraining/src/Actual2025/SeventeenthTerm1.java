package Actual2025;

import java.util.Arrays;
import java.util.Scanner;
//Optimal solution.
public class SeventeenthTerm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = 0, l = 0;
        int[] arr = new int[N];
        arr[0] = k;
        arr[1] = l;
        for (int i = 2; i < N; i++) {
            if (i % 2 == 0) {
                k += 3;
                arr[i] = k;
            }
            else {
                l += 2;
                arr[i] = l;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
