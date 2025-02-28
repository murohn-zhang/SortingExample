import java.util.Random;

public class Main {
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
            System.out.println("FAILED");
        } else {
            System.out.println("PASSED");
        }
    }

    public static void testSelectionSort(int[] data) {
        data = data.clone();
        SortingAlgorithms.selectionSort(data);

        // Check if it's sorted
        System.out.print("Selection Sort: ");
        if(!SortTester.isSorted(data)) {
            System.out.println("FAILED");
        } else {
            System.out.println("PASSED");
        }
    }

    public static void testMergeSort(int[] data) {
        data = data.clone();
        SortingAlgorithms.mergeSort(data);

        // Check if it's sorted
        System.out.print("Merge Sort: ");
        if(!SortTester.isSorted(data)) {
            System.out.println("FAILED");
        } else {
            System.out.println("PASSED");
        }
    }

    public static void main(String[] args) {
        // Generate testing data
        int[] data = generateRandomArray(SortingAlgorithms.TEST_SIZE);

        // Test Bubble Sort
        testBubbleSort(data);

        // Test Selection Sort
        testSelectionSort(data);

        // Test Merge Sort
        SortingAlgorithms.mergeSort(data);
    }

    // Generate a random array of a given size
    private static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(10000); // Random numbers between 0 and 9999
        }
        return arr;
    }
}