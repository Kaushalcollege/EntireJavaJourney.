package separateqs;

import java.util.Scanner;

public class twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int target = sc.nextInt();
        int[] b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        for (int i : twosum1(b,target))
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static int[] twosum1(int[] a, int target) {
        int[] b = new int[2];
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target) {
                    b[0] = i;
                    b[1] = j;
                    return b;
                }
            }
        }
        return null;
    }
}
