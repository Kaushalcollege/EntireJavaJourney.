package Revision2025_start;

import java.util.Scanner;

public class BP_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = N; i >= 1; i--) {
            for (int j = N; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
