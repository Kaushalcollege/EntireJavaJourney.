package Actual2025.CCPractice9thJuly;


import java.util.*;

public class MaxSumWithRotation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(new MaxSumWithRotation().maxSumWithRotation(arr));
    }

    public static int maxSumWithRotation(int[] arr){

        int[] copyarr = Arrays.copyOf(arr, arr.length);
        int maxSum = Integer.MIN_VALUE;
        do{
            // first rotate the array:
            int temp = copyarr[copyarr.length - 1];
            for (int i = copyarr.length - 1; i > 0; i--){
                copyarr[i] = copyarr[i - 1];
            }
            copyarr[0] = temp;

            int currentRotatedArraySum = 0;
            // iterate through the array and then calculate the sum of elements multiplied with their indices:
            for (int i = 0; i < copyarr.length; i++){
                currentRotatedArraySum += copyarr[i] * i;
            }

            // Assign the max of both maxSum and currentRotatedArraySum to maxSum:
            maxSum = Math.max(maxSum, currentRotatedArraySum);

        }while(!Arrays.equals(arr, copyarr));

        return maxSum;
    }

}
