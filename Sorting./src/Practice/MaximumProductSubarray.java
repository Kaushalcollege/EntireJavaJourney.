package Practice;

public class MaximumProductSubarray {
    public static int maxProduct(int[] arr) {
        int maxProduct = arr[0], minProduct = arr[0], result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int temp = maxProduct;
            maxProduct = Math.max(arr[i], Math.max(maxProduct * arr[i], minProduct * arr[i]));
            minProduct = Math.min(arr[i], Math.min(temp * arr[i], minProduct * arr[i]));
            result = Math.max(result, maxProduct);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] arr1 = { 6, 7, 8, 9};
        System.out.println(maxProduct(arr1));
    }
}
