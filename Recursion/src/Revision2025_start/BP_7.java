package Revision2025_start;

import java.util.Scanner;

public class BP_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = 3;
        int i = 1;
        while (n <= N) {
            System.out.print(n + ", ");
            i += 4;
            n = 3*i;
        }
    }
}
