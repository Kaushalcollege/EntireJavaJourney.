package arrayquestions;

import java.util.Scanner;

public class FindthelargestDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println(maxdiff1(arr));
    }
    // Brute force method.
//    static int maxdiff(int[] arr) {
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++)
//        {
//            for (int j = i + 1; j < arr.length; j++)
//            {
//                int diff = Math.abs(arr[i] - arr[j]);
//                if (diff > max)
//                            max = diff;
//            }
//        }
//        return max;
//    }
    public static int maxdiff1(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return max - min;
    }
}
