package Actual2025.Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class AllElementsAppearingMoreThanOnce {
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
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(countTable);
        for (int i : countTable.keySet()) {
            if (countTable.get(i) > 1) {
                System.out.println(i);
                list.add(i);
            }
        }
        int index = 0;
        int[] arr1 = new int[list.size()];
        for (int i : list) {
            arr1[index++] = i;
        }
        System.out.println(arr1.toString());
    }
}
