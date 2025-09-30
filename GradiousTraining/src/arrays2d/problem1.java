package arrays2d;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt(); // Enter one students marks at a time
            }
        }
        /*
        if no of subjects is not given then,
        int[][] arr = new int[n][];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt(); // Enter one students marks at a time
            }
        }
         */

        // This is using enhanced for loop.
        for(int[] arr1 : arr) {
            for(int arr2 : arr1) {
                System.out.print(arr2 + " ");
            }
            System.out.println();
        }
        int sub = in.nextInt();
        int student = in.nextInt();
        System.out.println(findhighmarksinsub(arr, sub));
        for (int i : higharr(arr))
        {
            System.out.print(i + " ");
        }
    }
    static int findhighmarksinsub(int[][] arr, int sub)
    {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][sub - 1] > max) {
                max = arr[i][sub];
            }
        }
        return max;
    }
    static int findmarks (int[][] arr, int row, int sub){
        return arr[row - 1][sub - 1];
    }
    static float findavgofsub (int[][] arr, int sub)
    {
        float avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg += arr[i][sub - 1];
        }
        return avg / sub;
    }
    static int[] higharr (int[][] arr)
    {
        int max = arr[0][0];
        int[] higharr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (arr[j][i] > max)
                {
                    max = arr[j][i];
                }
            }
            higharr[i] = max;
        }
        return higharr;
    }
}

