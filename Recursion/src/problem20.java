import java.util.Scanner;

public class problem20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println();
        for( int i : rotate(arr))
        {
            System.out.print(i + " ");
        }
    }
    private static int[] rotate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            swap(arr, i, arr.length - 1);
        }
        return arr;
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
