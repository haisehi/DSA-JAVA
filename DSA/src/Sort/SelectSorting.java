package Sort;

public class SelectSorting {

    public static void sort(int[] arrays) {
        int length = arrays.length;

        // Outer loop to iterate over each element
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i; // Assume the current index is the smallest

            // Print the initial state of the step
            System.out.println("Step " + (i + 1) + ":");
            System.out.println("Initial array: ");
            System.out.println("Minimum value: "+arrays[i]);
            printArray(arrays);

            // Find the smallest element in the unsorted part
            for (int j = i + 1; j < length; j++) {
                System.out.println("Comparing " + arrays[minIndex] + " and " + arrays[j]);
                if (arrays[j] < arrays[minIndex]) {
                    minIndex = j; // Update the index of the smallest element
                    System.out.println("New minimum found: " + arrays[minIndex]);
                }
            }

            // Swap if a smaller element was found
            if (i != minIndex) {
                System.out.println("Swapping " + arrays[i] + " and " + arrays[minIndex]);
                int temp = arrays[i];
                arrays[i] = arrays[minIndex];
                arrays[minIndex] = temp;
            }

            // Print the current state of the array
            System.out.print("Array after step " + (i + 1) + ": ");
            printArray(arrays);
            System.out.println();
        }
    }

    // Utility function to print the array
    public static void printArray(int[] arrays) {
        for (int array : arrays) {
            System.out.print(array + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Initialize array with 5 elements
        int[] arrays = {60, 80, 95, 50, 70};
        System.out.println("Initial array: ");
        printArray(arrays);
        System.out.println();

        sort(arrays); // Sort the array

        System.out.println("\nSorted array: ");
        printArray(arrays);
    }
}
