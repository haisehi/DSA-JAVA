package matrix;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước ma trận A
        System.out.print("Nhập số hàng của ma trận A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận A: ");
        int colsA = scanner.nextInt();

        // Nhập kích thước ma trận B
        System.out.print("Nhập số hàng của ma trận B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận B: ");
        int colsB = scanner.nextInt();

        // Kiểm tra điều kiện nhân
        if (colsA != rowsB) {
            System.out.println("Không thể nhân hai ma trận! Số cột của A phải bằng số hàng của B.");
            return;
        }

        // Nhập ma trận A và B
        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];

        System.out.println("Nhập ma trận A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Nhập ma trận B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Tính tích hai ma trận
        int[][] product = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    product[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // In kết quả
        System.out.println("Tích hai ma trận:");
        printMatrix(product);
    }

    // Hàm in ma trận
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
