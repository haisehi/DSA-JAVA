package Sort;

public class insert_sorting {
    public static void main(String[] args) {
        int arrays[] = {80, 70, 60, 50, 95};
        int length = arrays.length;

        for (int i = 1; i < length; i++) {
            int insert_element = arrays[i];
            int insert_position = i;

            // Duyệt ngược để tìm vị trí thích hợp cho phần tử cần chèn
            while (insert_position > 0 && insert_element < arrays[insert_position - 1]) {
                arrays[insert_position] = arrays[insert_position - 1];
                insert_position--;
            }

            // Chèn phần tử tại vị trí tìm được
            arrays[insert_position] = insert_element;

            // In trạng thái mảng sau mỗi bước sắp xếp
            System.out.print("Step " + i + ": ");
            printArray(arrays);
        }

        System.out.println("Sorted array: ");
        printArray(arrays);
    }

    // Hàm tiện ích để in mảng
    public static void printArray(int[] arrays) {
        for (int array : arrays) {
            System.out.print(array + " ");
        }
        System.out.println();
    }
}
