package ArrayList;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Truy vấn trên mảng động với ArrayList
//Ví dụ đầu vào:
//        5
//        5 41 77 74 22 44
//        1 12
//        4 37 34 36 52
//        0
//        3 20 22 33
//        5
//        1 3
//        3 4
//        3 1
//        4 3
//        5 5
//Ví dụ đầu ra:
//        74
//        52
//        37
//        ERROR!
//        ERROR!


public class baitap11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số dòng dữ liệu
        int n = scanner.nextInt();
        scanner.nextLine();
        List<List<Integer>> data = new ArrayList<>();

        // Đọc dữ liệu cho từng dòng
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt(); // Số phần tử trong dòng
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                row.add(scanner.nextInt());
            }
            data.add(row); // Thêm dòng vào danh sách
        }

        // Nhập số lượng truy vấn
        int q = scanner.nextInt();
        scanner.nextLine();
        List<int[]> queries = new ArrayList<>();

        // Đọc các truy vấn
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            queries.add(new int[]{x, y});
        }

        // Đóng scanner
        scanner.close();


        // Xử lý các truy vấn
        for (int[] query : queries) {
            int x = query[0];
            int y = query[1];

            // Kiểm tra và in kết quả
            if (x <= data.size() && x > 0 && y > 0 && y <= data.get(x - 1).size()) {
                System.out.println(data.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}
