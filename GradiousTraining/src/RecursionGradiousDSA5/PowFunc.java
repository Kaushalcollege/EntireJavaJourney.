package RecursionGradiousDSA5;

import java.util.Scanner;

public class PowFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(powhehe(N, k));
    }
    public static int powhehe(int N, int k) {
        if (k == 0) return 1;
        return N * powhehe(N, k - 1);
    }
}
