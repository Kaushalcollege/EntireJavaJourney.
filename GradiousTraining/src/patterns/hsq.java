package patterns;

import java.util.Scanner;

public class hsq {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        int n = v.nextInt();
        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=n; j++)
            {
                if(i == 1 || i==5 || j == 1 || j==5)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print(" 5\t");
                }
            }
            System.out.println("\n");
        }
    }
}
