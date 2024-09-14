import java.util.Scanner;

public class sumofodd {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        int n = h.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
