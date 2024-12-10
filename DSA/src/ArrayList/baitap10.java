package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

//Exercise 10: Sum of the largest value of 3 consecutive numbers
// Write a program to:
//
// Input a list of integers (using ArrayList).
// Find the largest sum of 3 consecutive numbers in the list.
// Example:
//
// Input: [1, 2, 3, 4, 5, 6]
// Output: 15 (sum of 4 + 5 + 6)
public class baitap10 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrNum = new ArrayList<>();
        System.out.println("Input initial value");
        int n = scanner.nextInt();
        System.out.println("Input list value");
        for (int i=0; i< n;i++){
            arrNum.add(scanner.nextInt());
        }

        for (int i = 0; i < arrNum.size() - 1; i++) {
            for (int j = 0; j < arrNum.size() - i - 1; j++) {
                if (arrNum.get(j) > arrNum.get(j + 1)) {
                    // Swap numList[j] and numList[j+1]
                    int temp = arrNum.get(j);
                    arrNum.set(j, arrNum.get(j + 1));
                    arrNum.set(j + 1, temp);
                }
            }
        }


        int n2 = arrNum.size();
        int n3 = arrNum.size()-1;
        int n4 = arrNum.size()-2;
        int sum = n2 + n3 + n4;
        System.out.println("Result: "+n2+"+"+n3+"+"+n4+"="+sum);
    }
}
