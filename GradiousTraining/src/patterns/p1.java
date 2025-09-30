package patterns;
import java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        int n = v.nextInt();
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                System.out.print("*\t");
            }
            System.out.println("\n");
        }
    }
}
