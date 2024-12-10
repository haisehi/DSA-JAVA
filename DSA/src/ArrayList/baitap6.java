package ArrayList;

//Exercise 6: Delete even numbers
// Write a program to:
//
// Input a list of integers (using ArrayList).
// Remove all even numbers from the list and print the list after deletion.
// Example:
//
// Input: [1, 2, 3, 4, 5, 6]
// Output: [1, 3, 5]

import java.util.ArrayList;
import java.util.Scanner;

public class baitap6 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrNum = new ArrayList<>();
        System.out.println("Input initial value");
        int n = scanner.nextInt();
        System.out.println("Input list value");
        for (int i=0; i< n;i++){
            arrNum.add(scanner.nextInt());
        }
        ArrayList<Integer> arrNum2 = new ArrayList<>();
        for (int num:arrNum){
            if(num %2 !=0){
                arrNum2.add(num);
            }
        }
        System.out.println("Result: " +arrNum2);

    }
}
