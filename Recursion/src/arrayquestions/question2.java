package arrayquestions;

import java.util.Scanner;

public class question2 {
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
        for (int i : semisort(arr))
        {
            System.out.print(i + " ");
        }
    }
    static int[] semisort(int[] arr) {
        int j = 0;  // Pointer to place the next non-zero element

        // First, move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j++] = arr[i];  // Place non-zero element at position j and increment j
            }
        }

        // After all non-zero elements are placed, fill the remaining positions with zeros
        while (j < arr.length) {
            arr[j++] = 0;
        }

        return arr;
    }
}
