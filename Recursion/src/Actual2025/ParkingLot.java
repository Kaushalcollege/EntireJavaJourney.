package Actual2025;

import java.util.Arrays;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int sum = 0;
        int max = 0, row = 0;
        int[][] ParkingLot = new int[N][M];
        for (int i = 0; i < N ; i++) {
            for (int j = 0; j < M ; j++) {
                ParkingLot[i][j] = sc.nextInt();
                sum += ParkingLot[i][j];
            }
            if (max < sum){
                max = sum;
                row = i;
            }
            sum = 0;
        }
        System.out.println(Arrays.deepToString(ParkingLot));
        System.out.println(row + 1);
    }
    public static int mostoccupied(int[][] ParkingLot, int N, int M) {
        int max = 0, row = 0;
        for (int i = 0; i < N; i++) {
            if (max < ParkingLot[i][M - 1])
            {
                max = ParkingLot[i][M - 1];
                row = i;
            }
        }
        return row + 1;

    }
}
