package Questions;

import java.util.Scanner;

public class min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
                {1,2,3,-90},
                {4,5,6,7},
                {34,67,89,23},
                {44,55,61,62,45},
        };
        int res = min(arr);
        int res2 = min2(arr);
        System.out.println(res);
    }
    static int min(int[][] arr) {
        int min = Integer.MAX_VALUE;
        int[][] res = new int[1][1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
    static int min2(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for(int[] ints : arr)
        {
            for (int i : ints){
                if (i < min)
                {
                    min = i;
                }
            }
        }
        return min;
    }
}