import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        System.out.println(calculateBill(n));
    }
    public static double calculateBill(float n) {
        double f = 0, o = 0, t = 0, tg =0;
        if (n <= 50) {
            f = 0.5 * n;
        }
        else if (n > 50 && n <= 150){
            o = 0.75 * n;
        }
        else if (n > 150 && n <= 250){
            t = 1.20 * n;
        } else if (n > 250) {
            tg = 1.50 * n;
        }
    }
}
