package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
                {1,2,3,-90},
                {4,5,6,7},
                {34,67,89,23},
                {44,55,61,62,45},
        };
        int res = max(arr);
        int res2 = max2(arr);
        System.out.println(res);
        System.out.println(res2);
    }
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int[][] res = new int[1][1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    static int max2(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int i : ints){
                if (i > max) {
                    max = i;
                }
            }
        }
        return max;
    }
}
