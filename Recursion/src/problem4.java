import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println(isprime(N));
    }
    public static boolean isprime(int N) {
        int count = 0;
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                count++;
            }
        }
//        if (count == 0) {
//            return true;
//        }
//        return false;
        return count == 0;
    }
}
