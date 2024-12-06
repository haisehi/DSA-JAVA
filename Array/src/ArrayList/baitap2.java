package ArrayList;


import java.util.ArrayList;
import java.util.Scanner;

//Exercise 2: Remove duplicate numbers
//        Write a program to:
//
//        Enter a list of integers (using ArrayList).
//        Remove duplicate numbers and print the resulting list.
//        For example:
//
//        Input: [2, 3, 5, 2, 8, 5, 10]
//        Output: [2, 3, 5, 8, 10]
public class baitap2 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrNum = new ArrayList<>();
        System.out.println("Input initial value");
        int n = scanner.nextInt();
        System.out.println("Input list value");
        for (int i=0; i< n;i++){
            arrNum.add(scanner.nextInt());
        }
        System.out.println("Display list value");
        for (int num:arrNum){
            System.out.print(num+" ");
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int num:arrNum){
            if(!result.contains(num)){
                result.add(num);
            }
        }

        System.out.println("\nList after remove duplicate values "+result);

    }
}
