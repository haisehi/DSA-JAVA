package Array_1;

import java.util.Scanner;

//Ví dụ: Với mảng A=[1,−2,4,−5,1], các mảng con là
//        [1], [-2], [4], [-5], [1],
//        [1, -2], [-2, 4], [4, -5], [-5, 1],
//        [1, -2, 4], [-2, 4, -5], [4, -5, 1],
//        [1, -2, 4, -5], [-2, 4, -5, 1],
//        [1, -2, 4, -5, 1]
//        Mảng có tổng âm: Là mảng có tổng các phần tử nhỏ hơn 0
//        Đầu vào:
//        5
//        1 -2 4 -5 1
//        Đầu ra:
//        9

public class Subarray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String line = scanner.nextLine();
        String[] arr = line.split(" ");
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = Integer.parseInt(arr[i]);
        }

        int sum = 0;
        // Kiểm tra tất cả các mảng con
        for (int start = 0; start < arr2.length; start++) {
            int currentSum = 0;
            for (int end = start; end < arr2.length; end++) {
                currentSum += arr2[end];
                if (currentSum < 0) {
                    sum++;
                }
            }
        }

        System.out.println(sum);
    }
}
