package matrix;

import java.util.Scanner;

public class MatrixInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhập kích thước ma trận
        System.out.println("Nhập số Hàng");
        int row = scanner.nextInt();
        System.out.println("Nhập số cột");
        int cols = scanner.nextInt();
        int [][] matrix = new int[row][cols];

        System.out.println("Nhập các phần tử ma trận");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Phần tử ["+i+"]["+j+"]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        //In ra ma trận
        System.out.println("Ma trận vừa nhập vào là:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
