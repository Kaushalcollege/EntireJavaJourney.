package Actual2025.CCPractice9thJuly;

public class MinimumNumberofJumpstoReachEnd {

    public static void main(String[] args) {
        int[] arr = {1,1,3,2,1,2,1,3,1,0};

        System.out.println(minJumpsToEnd(arr));
    }

    public static int minJumpsToEnd(int[] arr) {
    int n = arr.length;
    if (n <= 1) return 0;
    if (arr[0] == 0) return -1;

    int maxReach = arr[0];
    int steps = arr[0];
    int jumps = 1;

    for (int i = 1; i < n; i++) {
        if (i == n - 1)
            return jumps;

        maxReach = Math.max(maxReach, i + arr[i]);
        steps--;

        if (steps == 0) {
            jumps++;
            if (i >= maxReach)
                return -1;
            steps = maxReach - i;
        }
    }
    return -1;
}


}
