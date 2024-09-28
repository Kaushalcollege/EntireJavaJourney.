import java.util.Scanner;

public class problem13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        peakvalues(arr);
    }
    public static void peakvalues(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i ==0)
            {
                if (arr[i] < arr[i+1])
                {
                    System.out.println(arr[i]);
                }
            }
            else if (i == arr.length-1) {
                if (arr[i] < arr[i - 1]) {
                    System.out.println(arr[i]);
                }
            }

            else {
                if (arr[i] < arr[i+1] && arr[i] < arr[i-1]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
