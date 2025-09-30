package separateqs;

import java.util.Scanner;

public class FaLo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i : falo(a, m)){
            System.out.print(i + " ");
        }
    }
    public static int[] falo(int[] a, int m) {
        int[] b = new int[2];
        b[0] = -1;
        b[1] = -1;
        for (int i = 0; i <= a.length-1; i++) {
            if (a[i] == m) {
                b[0] = i;
            } else if (a[(a.length-1) - i] == m) {
                b[1] = (a.length-1) - i;
            }
        }
        return b;
    }
}