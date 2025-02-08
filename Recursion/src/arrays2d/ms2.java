package arrays2d;

import java.util.Scanner;

public class ms2 {
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
        int sum1 = 0;
        int sum2 = 0;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += a[0][i];
            }
        for (int i = 0; i < m; i++) {
            sum1 += a[i][i];// principle diagonal.
            sum2 += a[i][m - i- 1];// dual diagonal sum.
            int sum3 = 0;
            int sum4 = 0;
            for (int j = 0; j < m; j++) {
                sum3 += a[i][j];
                sum4 += a[j][i];
            }
            if (sum3 != sum || sum4 != sum) {
                return false;
            }
        }
        return sum1 == sum && sum2 == sum;
    }
}
