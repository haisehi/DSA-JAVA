package Sort;

public class QuickSort {

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            System.out.println("\nQuickSort called on range [" + low + ", " + high + "]");

            // Chọn pivot và phân chia mảng
            int partitionIndex = partition(array, low, high);

            // Hiển thị trạng thái mảng sau khi phân chia
            System.out.print("After partition (pivot at index " + partitionIndex + "): ");
            printArray(array);

            // Sắp xếp phần bên trái pivot
            quickSort(array, low, partitionIndex - 1);

            // Sắp xếp phần bên phải pivot
            quickSort(array, partitionIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Chọn phần tử cuối làm pivot
        System.out.println("Pivot: " + pivot + " at index " + high);
        int i = low - 1; // Vị trí phần tử nhỏ hơn pivot

        System.out.println("Partitioning range [" + low + ", " + high + "]");

        for (int j = low; j < high; j++) {
            System.out.println("Comparing: " + array[j] + " and pivot " + pivot);
            if (array[j] <= pivot) {
                i++;
                // Hoán đổi phần tử nhỏ hơn pivot sang bên trái
                System.out.println("Swapping " + array[i] + " and " + array[j]);
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                System.out.print("Array after swapping: ");
                printArray(array);
            }
        }

        // Hoán đổi pivot vào đúng vị trí
        System.out.println("Placing pivot at correct position: Swapping " + array[i + 1] + " and " + array[high]);
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        System.out.print("Array after placing pivot: ");
        printArray(array);

        return i + 1; // Trả về vị trí của pivot
    }

    public static void main(String[] args) {
        int[] array = {60, 50, 95, 80, 70, 45, 20, 100, 75, 10, 30};

        System.out.println("Initial array:");
        printArray(array);

        // Gọi Quick Sort
        quickSort(array, 0, array.length - 1);

        System.out.println("\nSorted array:");
        printArray(array);
    }

    // Hàm tiện ích để in mảng
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
