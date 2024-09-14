import java.util.Scanner;
public class mulof3 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        int x = v.nextInt();
        int y = v.nextInt();
        multiples(x,y);
    }
    public static void multiples(int x, int y) {
        for(int i =x; i<=y ; i++)
        {
            if(i%3==0)
            {
                System.out.print(i+ " ");
            }
        }
    }
}
