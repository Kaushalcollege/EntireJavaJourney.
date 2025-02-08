package arrayquestions;

import java.util.Scanner;

public class prodofarr {
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
        for (int i : prodexceptself1(arr) )
        {
            System.out.print(i + " ");
        }
    }
//    static int[] prodexceptself(int[] arr)
//    {
//        int[] answer = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            int product = 1;
//            for (int j = 0; j < arr.length; j++) {
//                if (i != j) {
//                    product *= arr[j];
//                }
//            }
//            answer[i] = product;
//        }
//        return answer;
//    }
    static int[] prodexceptself1(int[] arr)
    {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    product *= arr[j];
                }
            }
            answer[i] = product;
        }
        return answer;
    }
}
