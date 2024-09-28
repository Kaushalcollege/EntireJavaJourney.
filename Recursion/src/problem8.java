import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = 0;
        while(N > 0)
        {
            N /= 10;
            K++;
        }
        System.out.println(K);
    }
}
