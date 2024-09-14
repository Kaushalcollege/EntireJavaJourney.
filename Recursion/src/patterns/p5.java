package patterns;

import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        int n = v.nextInt();
        for(int i=n; i>=1; i--)
        {
            for(int j=1; j<=n; j++)
            {
                if(i+j<=5)
                {
                    System.out.print(" \t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }
            System.out.println("\n");
        }
    }
}
