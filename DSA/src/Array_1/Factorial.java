package Array_1;

import java.util.Scanner;

public class Factorial {
    // Hàm đệ quy tính giai thừa
    public static int factorial(int n) {
        if (n == 0 || n == 1) { // Điều kiện dừng
            return 1;
        }
        return n * factorial(n - 1); // Công thức đệ quy
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên n
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        // Kiểm tra giá trị hợp lệ
        if (n < 0) {
            System.out.println("Không tồn tại giai thừa cho số âm!");
        } else {
            // Tính và in kết quả
            System.out.println("Giai thừa của " + n + " là: " + factorial(n));
        }

        scanner.close();
    }
}
