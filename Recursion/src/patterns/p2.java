package patterns;
import java.util.Scanner;
public class p2 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        int n = v.nextInt();
        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print("*\t");
            }
            System.out.println("\n");
        }
    }
}
