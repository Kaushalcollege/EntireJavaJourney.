import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ActualExecution2 {
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
        System.out.println("Element found : " + (ans));
    }
    static int ls(int[] arr, int target) {
        if (arr.length == 0){
            return Integer.MAX_VALUE;
        }
        for (int i : arr) {
            if (i == target) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}
