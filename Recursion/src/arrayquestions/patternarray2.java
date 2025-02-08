package arrayquestions;

import java.util.Scanner;

public class patternarray2 {
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
        for (int i : seq2(arr)) {
            System.out.print(i + " ");
        }
    }
//    public static int[] seq(int[] arr) {
//        int[] seq = new int[arr.length];
//        for (int i = 1; i < 5; i++) {
//            seq[i-1] = arr[arr.length-1] + i*4;
//        }
//        return seq;
    public static int[] seq2(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[arr.length - 1] + i*5;
        }
        return res;
    }
    }
