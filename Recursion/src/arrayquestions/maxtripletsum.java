package arrayquestions;

import java.util.Scanner;

public class maxtripletsum {
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
        System.out.println(maxtriplesum(arr));
    }
    static int maxtriplesum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

        }
        return sum;
    }
}
