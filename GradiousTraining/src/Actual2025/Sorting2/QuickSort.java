package Actual2025.Sorting2;

import problems.problem16;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = {6, 17, 4, 15, 14, 1, 8, 11, 5, 10};

        System.out.println("Original Array:");
        printArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("\nSorted Array:");
        printArray(array);
    }

    // Main function that implements QuickSort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // pi is the partitioning index, array[pi] is now at the right place
            int pi = partition(array, low, high);

            // Recursively sort elements before and after partition
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    // Function to partition the array and return the partition index
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];  // Pivot element is taken as the last element
        int i = (low - 1);  // Index of the smaller element

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (array[j] <= pivot) {
                i++;

                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i + 1] and the pivot element (array[high])
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    // Utility function to print an array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}