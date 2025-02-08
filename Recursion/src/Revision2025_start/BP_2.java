package Revision2025_start;

import java.util.Scanner;

public class BP_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
