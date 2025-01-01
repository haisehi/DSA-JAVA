package List_Map_Hashset;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai1 {
//    Bài toán yêu cầu bạn thực hiện 2 loại truy vấn trên một danh sách (List):
//    Thêm một phần tử vào danh sách tại vị trí chỉ định:
//    Cú pháp: Insert x y
//    Chèn giá trị y vào danh sách tại chỉ số x.
//    Xóa một phần tử khỏi danh sách tại vị trí chỉ định:
//    Cú pháp: Delete x
//    Xóa phần tử tại chỉ số x khỏi danh sách.
//    Sau khi thực hiện xong tất cả các truy vấn, in danh sách đã được sửa đổi ra một dòng duy nhất,
//    với các phần tử cách nhau bởi một khoảng trắng.
//
//    Input:
//    5
//    12 0 1 78 12
//    2
//    Insert
//    5 23
//    Delete
//    0
//
//    Output:
//    0 1 78 12 23

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        nhap so luong list
        int n = scanner.nextInt();
        List<Integer> array = new ArrayList<>();
//        nhap phan tu trong list
        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }
//        nhap so lan truy van
        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            String test = scanner.next();

            if (test.equals("Insert")) {
                int x = scanner.nextInt(); // Vi tri
                int y = scanner.nextInt(); // Gia tri
                array.add(x, y);
            } else if (test.equals("Delete")) {
                int x = scanner.nextInt(); // Vi tri
                if (x >= 0 && x < array.size()) {
                    array.remove(x);
                }
            }
        }

        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
