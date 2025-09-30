package Actual2025.CCPractice9thJuly;

import java.util.*;
public class Findthenext5elementsinthegivenarray {
    public static void main(String[] args) {
        int[] arr = {-1, -2, -3, -4, -5};

        System.out.println(Arrays.toString(new Findthenext5elementsinthegivenarray().nextFiveElements(arr)));
    }

    public int[] nextFiveElements(int[] arr) {
        int[] extended = Arrays.copyOf(arr, arr.length + 5);
        int diff = arr[1] - arr[0];

        for (int i = arr.length; i < extended.length; i++) {
            extended[i] = extended[i - 1] + diff;
        }

        return extended;
    }
}
