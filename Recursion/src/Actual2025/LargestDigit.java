package Actual2025;

import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(maxdigit(n));
    }
    public static int maxdigit(int n){
        int num = 0;
        while (n != 0) {
            int rem = n % 10;
            n /= 10;
            if (num < rem) {
                num = rem;
            }
        }
        return num;
    }
}
