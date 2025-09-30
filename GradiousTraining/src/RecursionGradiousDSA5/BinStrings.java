package RecursionGradiousDSA5;

import java.util.Scanner;

public class BinStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        binstr(N, "");
    }
    // no of strings == 2^N.
    private static void binstr(int N, String s) {
        if (N <= 0)
        {
            System.out.println(s);
            return;
        }
       binstr(N - 1, s + "0");
       binstr(N - 1 , s + "1");
    }
}
