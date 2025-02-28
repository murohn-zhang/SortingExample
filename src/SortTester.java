/**
 * A file to test the sort functions using the same
 * provided data. The size of the data is stored in
 * SortingAlgorithms.java so that students need only
 * modify a single file.
 *
 * @author: Nandhini Namasivayam
 * @version: February 2024
 */

import java.util.Random;

public class SortTester {
    /**
     * Tests bubble sort without modifying data
     * @param data
     */
    public static void testBubbleSort(int[] data) {
        data = data.clone();
        SortingAlgorithms.bubbleSort(data);

        // Check if it's sorted
        System.out.print("Bubble Sort: ");
        if(!SortTester.isSorted(data)) {
            System.out.println("FAILED - output:");
            printArray(data);
        } else {
            System.out.println("PASSED");
        }
    }

    /**
     * Tests selection sort without modifying data
     * @param data
     */
    public static void testSelectionSort(int[] data) {
        data = data.clone();
        SortingAlgorithms.selectionSort(data);

        // Check if it's sorted
        System.out.print("Selection Sort: ");
        if(!SortTester.isSorted(data)) {
            System.out.println("FAILED - output:");
            printArray(data);
        } else {
            System.out.println("PASSED");
        }
    }

    /**
     * Tests merge sort without modifying data
     * @param data
     */
    public static void testMergeSort(int[] data) {
        data = data.clone();
        SortingAlgorithms.mergeSort(data);

        // Check if it's sorted
        System.out.print("Merge Sort: ");
        if(!SortTester.isSorted(data)) {
            System.out.println("FAILED - output:");
            printArray(data);
        } else {
            System.out.println("PASSED");
        }
    }

    // Generate a random array of a given size
    private static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(SortingAlgorithms.MAX_NUMBER_SIZE);
        }
        return arr;
    }

    /**
     * Determines if the array is sorted
     * in ascending order
     * @param arr
     * @return True if sorted and False other
     */
    public static boolean isSorted(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    // Utility method to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Generate testing data
        int[] data = generateRandomArray(SortingAlgorithms.TEST_SIZE);

        // Test Bubble Sort
        testBubbleSort(data);

        // Test Selection Sort
        testSelectionSort(data);

        // Test Merge Sort
        // TODO: Uncomment to run this test
//        testMergeSort(data);
    }
}