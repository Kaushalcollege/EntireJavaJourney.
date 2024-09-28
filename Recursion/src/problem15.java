import java.util.Scanner;

public class problem15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // size of array
        int[] arr = new int[n];// Declaration of array
        for(int i = 0; i < n; i++){ // array elements initialization
            arr[i] = in.nextInt();
        }
        System.out.println(maxint(arr));
    }
    public static int maxint(int[] arr){
        int min = arr[0];
        for (int i : arr)
        {
            if (i < min)
            {
                min = i;
            }
        }
        return min;
    }
}
