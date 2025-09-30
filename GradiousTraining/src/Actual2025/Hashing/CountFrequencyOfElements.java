package Actual2025.Hashing;

import java.util.*;

public class CountFrequencyOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        CountFrequencyOfElements(arr);
    }

    public static void CountFrequencyOfElements(int[] arr) {
        HashMap<Integer, Integer> countTable;
        countTable = new HashMap<>();
        for (int i : arr) {
            countTable.put(i, countTable.getOrDefault(i, 0) + 1);
        }
        System.out.println(countTable);
        int index = 0;
        int[] newarr = new int[countTable.size()];
        for (int i : countTable.values()) {
            newarr[index++] = i;
        }
        System.out.println(Arrays.toString(newarr));
    }
}
