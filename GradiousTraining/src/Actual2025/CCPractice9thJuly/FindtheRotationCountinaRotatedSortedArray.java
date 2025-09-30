package Actual2025.CCPractice9thJuly;

public class FindtheRotationCountinaRotatedSortedArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        System.out.println(new FindtheRotationCountinaRotatedSortedArray().findRotationIndex(arr));
    }

    public static int findRotationIndex (int arr[]){
        int low = 0, high = arr.length - 1;

        while(low < high){
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[high]){
                low = mid + 1;
            }
            else high = mid;
        }

        return low;
    }

}
