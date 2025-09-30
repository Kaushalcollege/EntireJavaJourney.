package patterns;
import java.util.Scanner;
public class p3 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        int n = v.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=n; j>=i; j--)
            {
                System.out.print("*\t");
            }
            System.out.println("\n");
        }
    }
}
