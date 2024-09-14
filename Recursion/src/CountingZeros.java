import java.util.Scanner;

public class CountingZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.println(countingZeros(n));
    }
    public static int countingZeros(String n) {
        int c=0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '0') {
                c++;
            }
        }
        return c;
    }
}
