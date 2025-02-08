package Questions;

import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class LC1295 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findNumbers(arr));
    }
    public static int findNumbers(int[] nums){
        int c=0;
        for(int i = 0; i < nums.length; i++) {
            if ((String.valueOf(nums[i]).length())%2 == 0)
            {
                c++;
            }
        }
        return c;
    }
}
