package matrix;

import java.util.Scanner;

public class MatrixAdditionSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap kich thuoc hang");
        int row = scanner.nextInt();
        System.out.println("Nhap kich thuoc cot");
        int cols = scanner.nextInt();

        int [][] matrixA = new int [row][cols];
        int [][] matrixB = new int [row][cols];

        System.out.println("Nhap ma tran A");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Nhap ma tran B");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }
        int [][] sum = new int[row][cols];
        int [][] difference = new int[row][cols];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
                difference[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }

        System.out.println("Tong 2 ma tran");
        print(sum);
        System.out.println("Hieu 2 ma tran");
        print(difference);


    }

    public static void print(int[][] matrix){
        for(int[] row: matrix){
            for (int val: row){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
