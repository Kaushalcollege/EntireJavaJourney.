import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println(fact(N));
    }
    static int fact(int N) {
        int fact = 1;
        if (N == 0)
        {
            return fact;
        }
        for (int i = 1; i <= N; i++) {
            fact *= i;
        }
        return fact;
    }
}
