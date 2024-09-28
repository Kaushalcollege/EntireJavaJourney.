import java.util.Scanner;

public class problem17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(secondpeak(arr));
    }
    private static int secondpeak(int[] arr) {
        // 3200 700 600
        int max = 0;
        int max2 = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max2 = max;
                max = i;
            }
            else if (max2 == -1 || arr[i] > arr[max2]) {
                max2 = i;
            }
        }
        return arr[max2];
    }
}
