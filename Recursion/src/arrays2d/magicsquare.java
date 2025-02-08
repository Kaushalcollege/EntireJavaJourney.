package arrays2d;

import java.util.Scanner;

public class magicsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println(checkms(a));
    }
    public static boolean checkms(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        //principle diagonal.
        for (int i = 0; i < m; i++) {
            sum1 += a[i][i];// reference sum.
        }
        //dual diagonal.
        for (int i = 0; i < m; i++) {
            sum2 += a[i][n - 1];
            if(sum2 == sum1)
            {
                return true;
            }
        }
        // all rows:
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                sum3 += a[i][j];
                if (sum3 == sum1) {
                    return true;
                }
            }
        }
        // all columns:
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                sum4 += a[j][i];
                if (sum4 == sum1) {
                    return true;
                }
            }
        }
        return false;
    }
}
