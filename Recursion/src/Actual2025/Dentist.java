package Actual2025;

import java.util.Scanner;

public class Dentist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dentist = new int[N];
        for (int i = 0; i < N; i++) {
            dentist[i] = sc.nextInt();
        }
        System.out.println("Total Earnings: " + earnings(dentist));
    }
    public static int earnings(int[] dentist) {
        int total = 0;
        for (int i : dentist) {
            if (i < 18) {
                total += 200;
            }
            else if (i >= 18 && i <= 50) {
                total += 400;
            }
            else if (i > 50) {
                total += 300;
            }
        }
        return total;
    }
}
