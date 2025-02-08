package ArraysLevel4;

import java.util.Arrays;

public class ArraysLevel4_2 {
    public static void main(String[] args) {
        String arrStr = args[0];
        String[] arrStrArr;

        // Check if input string is empty array "[]"
        if (arrStr.equals("[]")) {
            arrStrArr = new String[0];
        } else {
            // Corrected variable name and regex
            arrStrArr = arrStr.replaceAll("[\\[\\]\"\\s]", "").split(",");
        }

        // Convert the string array to an integer array
        int[] arr = new int[arrStrArr.length];
        for (int i = 0; i < arrStrArr.length; i++) {
            arr[i] = Integer.parseInt(arrStrArr[i].trim());
        }

        System.out.print(Arrays.toString(MoveZeros(arr)));
    }

    static int[] MoveZeros(int[] arr) {
        int index = 0;
        for (int i : arr){
            if (i != 0){
                arr[index++] = i;
            }
        }
        Arrays.sort(arr, 0 , index);
        while (index < arr.length){
            arr[index++] = 0;
        }
        return arr;
    }
}
