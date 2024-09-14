package patterns;
import java.util.Scanner;
public class p4 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        int n = v.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=n; j>=1; j--)
            {
                if(j<=i)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print(" \t");
                }
            }
            System.out.println("\n");
        }
    }
}
