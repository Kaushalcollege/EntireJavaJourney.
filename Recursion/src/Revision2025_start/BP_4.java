package Revision2025_start;

import java.util.Scanner;

public class BP_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int count = 0;
        for (int i = x; i <= y; i++) {
            if(i % 3 == 0){
                count ++;
            }
        }
        System.out.println(count);
    }
}
