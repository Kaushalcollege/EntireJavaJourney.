package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class searchin2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
                {1,2,3},
                {4,5,6,7},
                {34,67,89,23},
                {44,55,61,62,45},
        };
        int tar = sc.nextInt();
        int[] res = search(arr, tar);
        System.out.println(Arrays.toString(res));
    }
    public static int[] search(int[][] arr, int target) {
        int[][] res = new int[1][1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
