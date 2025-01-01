package Hashmap;

//Bạn được cung cấp một danh bạ điện thoại gồm tên của mọi người và số điện thoại tương ứng.
//Sau đó, bạn sẽ nhận được một số truy vấn về tên của người cần tìm.
//Đối với mỗi truy vấn, in ra số điện thoại của người đó.
//
//Định dạng đầu vào:
//Dòng đầu tiên là một số nguyên n, biểu thị số lượng mục trong danh bạ điện thoại.
//Mỗi mục trong danh bạ bao gồm hai dòng:
//Dòng thứ nhất là tên của người.
//Dòng thứ hai là số điện thoại của người đó.
//Tiếp theo là một loạt truy vấn, mỗi truy vấn chứa một tên người.
//Đọc các truy vấn cho đến khi gặp EOF (end-of-file).
//
//Định dạng đầu ra:
//Với mỗi truy vấn:
//Nếu tên người đó không có trong danh bạ, in "Not found".
//Nếu tên người đó có trong danh bạ, in tên và số điện thoại theo định dạng:


import java.util.HashMap;
import java.util.Scanner;

public class PhoneName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.nextLine();
        HashMap<String,String> phoneBook = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String phone = scanner.nextLine();
            phoneBook.put(name,phone);
        }

        while (scanner.hasNextLine()){
            String key = scanner.nextLine();
            if (phoneBook.containsKey(key)){
                System.out.println(key + "=" + phoneBook.get(key));
            } else {
                System.out.println("Not found");
            }
        }

//        System.out.println(phoneBook);

    }
}
