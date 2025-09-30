package arrayquestions;

import java.util.Scanner;

public class RotateArrayLeft {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int[] a = new int[n]; //declaration of array
        // Input of the array from user:
        for (int i = 0; i < n; i++) {
            a[i] = x.nextInt();
        }
        //displaying the array:
        for (int i : a)
        {
            System.out.print(i + " ");
        }
        int k = x.nextInt();
        for (int i : rotateby(a, k))
        {
            System.out.print(i + " ");
        }
    }
    /*
    Explanation of what the idea is :
        let us assume we are given an array [1,2,3,4,5,6,7,8].
        if we are asked to rotate the array by 2 elements then, the resultant array we obtain is :
        [7,8,1,2,3,4,5,6]
     */
    static int[] rotateby(int[] a, int k)
    {
        k = k % a.length; // to handle the cases where the rotation by the number of
        // elements are greater than length.
        for (int i = 0; i < k; i++) // this outer for loop is the counting loop as this counts the number of elements rotated.
        {
            int temp = a[0]; // storing the last element.
            for (int j = 1; j < a.length; j++)
            {
                a[j-1] = a[j];
            }
            a[a.length-1] = temp;
        }
        return a;
    }
}


// This is by brute force method.


// initialize arr of k size
// fill this new arr from the end till k
// shift old array by k
// fill old arr with k