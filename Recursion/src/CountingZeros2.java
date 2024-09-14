import java.util.Scanner;

public class CountingZeros2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countingZeros(n));
    }
    public static int countingZeros(int n) {
        int c = 0, r;
        while (n != 0) {
            r = n % 10;
            if (r == 0) {
                c++;
            }
            n /= 10;
        }
        return c;
    }
}
