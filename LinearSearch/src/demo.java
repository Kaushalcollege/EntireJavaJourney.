public class demo {
    public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,6,7,8,9};
    int target = 9;
    int ans = LinearSearch(nums, target);
        System.out.println(ans);
    }
    static int LinearSearch (int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        // this line will get executed if none of the return statements are executed.
        //target is not found.
        return -1;
    }
}
