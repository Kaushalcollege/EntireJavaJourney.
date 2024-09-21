import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        loop(x,y);
    }
    static void loop(int x, int y) {
        for (int i = x; i <= y; i++) {
            if (i % 11 == 0)
            {
                break;
            }
            System.out.print(i + " ");
        }
    }
}
