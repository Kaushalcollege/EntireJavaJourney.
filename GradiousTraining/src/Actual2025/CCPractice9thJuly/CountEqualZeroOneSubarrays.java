package Actual2025.CCPractice9thJuly;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountEqualZeroOneSubarrays {
    public static void main(String[] args) {

        int[] arr = {1,0,0,1,0,1,1};

        System.out.println(countSubarraysWithEqualZerosAndOnes(arr));
    }

    public static int countSubarraysWithEqualZerosAndOnes(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        int prefixSum = 0;
        int count = 0;

        freq.put(0, 1);

        for (int value : arr) {
            prefixSum += (value == 1) ? 1 : -1;
            count += freq.getOrDefault(prefixSum, 0);
            freq.put(prefixSum, freq.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static int countSubarraysWithEqualZerosAndOnes1 (int arr[]) {  
          int count = 0;
          for (int i = 0; i < arr.length; i++){
              for (int j = i + 1; j <= arr.length; j++){
                  if (contains(Arrays.copyOfRange(arr, i, j))) count++;
              }
          }
          return count;
      }
      
      private static boolean contains(int arr[]){
          int zc = 0;
          int oc = 0;
          for (int i : arr){
              if (i == 0) zc++;
              else oc++;
          }
          return zc == oc;
      }
}
