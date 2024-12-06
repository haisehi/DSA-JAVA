package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

//Calculate the sum and the maximum value in the list
// Write a program to:
//
// Input a list of integers (using ArrayList).
// Calculate the sum of the elements in the list.
// Find the maximum value in the list.
// Example:
//
// Input: [2, 5, 8, 3, 10]
// Output: Sum: 28, Maximum value: 10
public class baitap1 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arrl = new ArrayList<>();
        System.out.println("input initial value");
        int n = scanner.nextInt();
        System.out.println("insert list values");
        for (int i = 0; i < n; i++){
            arrl.add(scanner.nextInt());
        }
        System.out.println("display value in the list: ");
        for (int num:arrl){
            System.out.print(num+" ");
        }

        int max = 0;
        for (int num:arrl){
            if (max < num){
                max = num;
            }
        }
        System.out.println("\nthe maximum value in the list is "+max);
        int sum =0;
        for (int num:arrl){
            sum += num;
        }
        System.out.println("the sum value in the list is "+sum);
    }
}
