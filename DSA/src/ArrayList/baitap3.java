package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

//Exercise 3: Reverse a List
//        Write a program to:
//
//        Enter a list of strings (ArrayList<String>).
//        Reverse the order of the elements in the list and print the reversed list.
//        For example:
//
//        Input: ["Java", "Python", "C++", "Go"]
//        Output: ["Go", "C++", "Python", "Java"]
public class baitap3 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i =0 ; i < n; i++){
            arrayList.add(scanner.nextLine());
        }
        // first way
        System.out.println("Result of first way, using arrayList.reversed(): " +arrayList.reversed());
        // second way
        ArrayList<String> arrayList2 = new ArrayList<>();
        int right = arrayList.size()-1;
        while (right >= 0){
            String str = arrayList.get(right);
            arrayList2.add(str);
            right--;
        }

        System.out.println("Result of second way : " +arrayList2);
    }
}
