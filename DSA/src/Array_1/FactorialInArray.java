package Array_1;

import java.util.Scanner;

public class FactorialInArray {

    public static long factorial(int n){
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *=i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = scanner.nextInt();
        }
        for (int num:number) {
            System.out.println(num+":"+factorial(num));
        }
    }
}
