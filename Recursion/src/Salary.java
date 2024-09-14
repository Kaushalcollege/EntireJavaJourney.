import  java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sal = sc.nextFloat();
        System.out.println(grossSalary(sal));
    }
    public static double grossSalary(float n) {
        if (n<=10000)
            return n+0.2*n+0.8*n;
        else if (n<=20000)
            return n+0.25*n+0.9*n;
        else
            return n+0.3*n+0.95*n;
    }
}
