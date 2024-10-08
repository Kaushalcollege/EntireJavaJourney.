public class ColnoFixed {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 3},// 0th index
                {4, 5, 6, 7}, // 1st index
                {8, 9} // 2nd index
        };
        // traditional way.
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
