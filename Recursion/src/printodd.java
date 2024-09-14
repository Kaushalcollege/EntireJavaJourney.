import java.util.Scanner;

public class printodd {
    public static void main(String[] args) {
        Scanner hello = new Scanner(System.in);
        int n = hello.nextInt();
        for(int i=1; i<n; i++){
            if(i%2!=0)
            {
                System.out.print(i+ " ");
            }
        }
    }
}
