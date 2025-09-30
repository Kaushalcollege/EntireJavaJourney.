package RecursionGradiousDSA5;

import java.util.Scanner;

public class RevNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(rev(N,0));
    }
    public static int rev(int N, int reverse) {
        if (N == 0) return reverse;
        return rev(N / 10, reverse * 10 + N % 10);
    }
}
