package Array_1;

public class MoveZeroesToEndOfAnArray {
    public static void main(String[] Args) {
        // Initialize the array
        System.out.println("Initial array:");
        int[] num1 = {0, 1, 0, 4, 12};
        printArray(num1);

        // Variable `j` keeps track of the first zero position
        int j = 0;
        System.out.println("\nStarting process...");

        for (int i = 0; i < num1.length; i++) {
            System.out.println("\nChecking i = " + i + ", j = " + j);

            // Swap elements if num1[i] is non-zero and num1[j] is zero
            if (num1[i] != 0 && num1[j] == 0) {
                System.out.println("Swapping num1[i] = " + num1[i] + " with num1[j] = " + num1[j]);
                int temp = num1[i];
                num1[i] = num1[j];
                num1[j] = temp;

                // Show the array state after swapping
                System.out.println("Array after swapping:");
                printArray(num1);
            }

            // Increment `j` if num1[j] is non-zero
            if (num1[j] != 0) {
                System.out.println("num1[j] = " + num1[j] + " (non-zero), moving j forward");
                j++;
            }
        }

        // Final result
        System.out.println("\nFinal result:");
        printArray(num1);
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
