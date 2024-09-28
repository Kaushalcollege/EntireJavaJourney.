import java.util.Scanner;

public class problem16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        for (int i : sort_array(arr)) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(arr[n-2]);
    }
    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static int[] sort_array(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    swap(arr, i, j);
                }
            }
        }
        return arr;
    }
}
