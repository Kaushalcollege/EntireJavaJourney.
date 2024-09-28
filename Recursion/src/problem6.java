//Progression sum
import java.util.Scanner;
public class problem6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = N; i > 0; i--) {
            for (int j = 0; j <= i ; j++) {
                i = i-j;
                if (i < 50) {
                    break;
                }
                System.out.println(i);
            }
        }
    }
}
