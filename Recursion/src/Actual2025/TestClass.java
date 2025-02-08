package Actual2025;

import java.util.Scanner;

public class TestClass {
    public static int SubarrayProductLessThanK (int nums[],int k) {  // Don't change the number of parameters
        // Please write your return statement here
        if(k<= 1){
            return 0;
        }
        int mul=1,count=0;
        for(int i=1;i<nums.length;i++){
            mul=1;
            for(int j=0;j<=i;j++){
                mul*=nums[j];
            }
            if(mul<k){
                count++;
            }else if(mul>k){
                return 0;
            }

            for(int j=i;j<nums.length;j++){
                mul=mul*nums[j]/nums[j-i];
                if(mul<k){
                    count++;
                }
                mul=1;
            }
        }
        return count;
    }

    //Please don't modify the below code

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(SubarrayProductLessThanK(arr,k));
    }
}
