package ArraysLevel4;

public class ArraysLevel4_1 {
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

        System.out.print(maxDifference(arr));
    }

    // Method to calculate the maximum difference
    // the below method is the most time efficient, most optimal method with time complexity O(n).
    public static int maxDifference(int[] arr) {
        if (arr.length < 2) {
            return 0;  // Return 0 if there are fewer than 2 elements
        }

        int minElement = arr[0];
        int maxDiff = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            maxDiff = Math.max(maxDiff, arr[i] - minElement);
            minElement = Math.min(minElement, arr[i]);
        }

        return maxDiff;
    }
    // the below method is Brute force, most basic method with time complexity O(n^2).
//    public static int maxDifference(int[] arr) {
//        int md = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (Math.abs(arr[i] - arr[j]) > md) {
//                    md = Math.abs(arr[i] - arr[j]);
//                }
//            }
//        }
//        return md;
//    }

}
