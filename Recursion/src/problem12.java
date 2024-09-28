import java.util.Scanner;

public class problem12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println();
        for ( int j : absval(arr))
        {
            System.out.print(j + " ");
        }
    }
    static int[] absval(int[] arr)
    {
        int[] res = new int[arr.length];
        for (int i = 0; i < res.length; i++)
        {
            if (arr[i] < 0)
            {
                res[i] = -arr[i];
            }
            else
            {
                res[i] = arr[i];
            }
        }
        return res;
    }
}
