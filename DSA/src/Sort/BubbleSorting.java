package Sort;

public class BubbleSorting {
    public static void main(String[] args) {
        // Initialize array with 5 elements
        int[] arrays = {60, 50, 95, 80, 70};

        System.out.println("Initial array: ");
        printArray(arrays);
        System.out.println();

        // Outer loop to control passes
        for (int i = 0; i < arrays.length - 1; i++) {
            System.out.println("Step " + (i + 1) + ":");
            boolean swapped = false;

            // Inner loop to compare adjacent elements
            for (int j = 0; j < arrays.length - i - 1; j++) {
                System.out.println("Comparing " + arrays[j] + " and " + arrays[j + 1]);
                if (arrays[j] > arrays[j + 1]) {
                    // Swap if elements are in the wrong order
                    System.out.println("Swapping " + arrays[j] + " and " + arrays[j + 1]);
                    int temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;
                    swapped = true;
                }
            }

            // Print array after each step
            System.out.print("Array after step " + (i + 1) + ": ");
            printArray(arrays);
            System.out.println();

            // If no swaps were made, array is sorted
            if (!swapped) {
                System.out.println("No swaps were made. Array is sorted.");
                break;
            }
        }

        System.out.println("Sorted array: ");
        printArray(arrays);
    }

    // Utility function to print the array
    public static void printArray(int[] arrays) {
        for (int array : arrays) {
            System.out.print(array + " ");
        }
        System.out.println();
    }
}
