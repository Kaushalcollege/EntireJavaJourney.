import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        System.out.println("Enter a array in ascending order:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element:");
        int tar = sc.nextInt();
        System.out.println(binsearch(arr, tar));
    }
    // returns the index:
    // returns -1 if the element does not exist.
    public static int binsearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            // int mid = (start + end) / 2; // this might exceed the max integer value if the array size is too much.
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1; // if target is present in the left half of the array.
            }
            else if (target > arr[mid]) {
                start = mid + 1; // if target is present in the right half of the array.
            }
            else {
                return mid + 1;
            }
        }
        return -1; // target not found
    }
}
