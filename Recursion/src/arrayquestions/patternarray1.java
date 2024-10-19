package arrayquestions;

import java.util.Scanner;

public class patternarray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
        for (int i : seq(arr)) {
            System.out.print(i + " ");
        }
    }
    public static int[] seq(int[] arr) {
       int[] seq = new int[arr.length];
       for (int i = 1; i < 5; i++) {
           seq[i-1] = arr[arr.length-1] + i*2;
       }
       return seq;
}
}
