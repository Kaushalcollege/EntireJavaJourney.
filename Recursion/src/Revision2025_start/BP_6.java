package Revision2025_start;

import java.util.Scanner;
import java.lang.*;

public class BP_6 {
    public static void main(String[] args) {
        int n = 376;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        while (n >= k) {
            System.out.print(n + ", ");
            n -= i;
            i++;
        }
    }
}
