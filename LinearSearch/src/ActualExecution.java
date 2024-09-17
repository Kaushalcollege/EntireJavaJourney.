import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ActualExecution {
    public static void main(String ...args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = i.nextInt();
        int[] arr = new int[n];
        //Input of the array.
        for(int k = 0;  k < arr.length; k++)
        {
            arr[k] = i.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the element to search: ");
        int e = i.nextInt();
        int ans = ls(arr, e);
        System.out.println("Element found at index: " + (ans+1));
    }
    static int ls(int[] arr, int target) {
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
