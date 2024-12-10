package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

//Exercise 4: Count the number of occurrences
// Write a program to:
//
// Input a list of integers (using ArrayList).
// Count the number of occurrences of each number and print the result.
// Example:
//
// Input: [1, 2, 2, 3, 3, 3, 4]
// Output:
// Number 1: 1 time
// Number 2: 2 times
// Number 3: 3 times
// Number 4: 1 time
public class baitap4 {
    public static void main(String Args[]){
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
            if (!arrNum2.contains(num)){
                arrNum2.add(num);
                System.out.println("Number "+ num +" : "+arrNum2.stream().count()+" time ");
            }
        }
    }
}
