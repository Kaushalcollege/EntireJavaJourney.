package Actual2025;

import java.util.Scanner;
// This only works for Sorted Arrays.
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println("The index where the target is found is: " + (BS(arr, target) + 1));
    }
    public static int BS(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r){
            int mid = l + (r - l)/2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target){
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
