package Arrayskaushal;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    /*
        1 2 3
        4 5 6
        7 8 9

     */
        // syntax
        // data_type[][] var_name = new data_type[size][size];
        /* The most interesting thing about the above declaration is that the no. of columns need not be
           specified. Why?
         */
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arr1 = {
                {1, 2, 3},// 0th index
                {4, 5, 6, 7}, // 1st index
                {8, 9} // 2nd index
        };
        int[][] arr2 = new int[3][3];
        System.out.println(arr2.length); // Will give you no.of rows.

        // input of 2D array.
        for(int row = 0; row < arr2.length; row++) {
            //for each col in every row.
            for(int col = 0; col < arr2[row].length; col++) {
                    arr2[row][col] = sc.nextInt();
            }
        }
        //output
//        for (int[] ints : arr2) {
//            //for each col in every row.
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }

        //or
//        for (int[] a : arr2) {
//            System.out.println(Arrays.toString(a));
//        }// using enhanced for loop.

        for(int row = 0; row < arr2.length; row++) {
            System.out.println(Arrays.toString(arr2[row]));
        }
    }
}
