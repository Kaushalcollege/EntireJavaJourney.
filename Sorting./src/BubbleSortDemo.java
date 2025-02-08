import java.util.Scanner;
public class BubbleSortDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        bubbleSort(arr);
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void bubbleSort(int[] arr) { // sorts the array in place.
        // run the steps in n-1 times.
        for (int i = 0; i < arr.length; i++) {

            // for each step, max item will be pushed to the last respective index.
            for (int j = 1; j < arr.length - i ; j++) {
                // swap if the item is smaller than the previous item.
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}