package Sort;

public class select_sorting {

    public static void sort(int[] arrays) {
        int length = arrays.length;

        // Outer loop to iterate over each element
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i; // Assume the current index is the smallest
            for (int j = i + 1; j < length; j++) { // Look for a smaller element
                if (arrays[j] < arrays[minIndex]) {
                    minIndex = j; // Update the index of the smallest element
                }
            }
            // Swap if a smaller element was found
            if (i != minIndex) {
                int temp = arrays[i];
                arrays[i] = arrays[minIndex];
                arrays[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        // Initialize array with 5 elements
        int[] arrays = {60, 50, 95, 80, 70};
        sort(arrays);
        for (int array : arrays) {
            System.out.print(array + " ");
        }
    }
}
