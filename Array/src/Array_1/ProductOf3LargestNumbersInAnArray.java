package Array_1;

import java.util.Arrays;

public class ProductOf3LargestNumbersInAnArray {
    public static void main(String[] Args){
        System.out.println("Initialization array: ");
        int[] num1 = {3,4,7,10,5,2,6};
        for (int i = 0; i < num1.length; i++){
            System.out.print(num1[i]+" ");
        }
        Arrays.sort(num1);
        System.out.println("\nArray after sorted: ");
        for (int i = 0; i < num1.length; i++){
            System.out.print(num1[i]+" ");
        }
        int sum = num1[num1.length -1]*num1[num1.length -2]*num1[num1.length -3];
        System.out.println("\nProduct of 3 largest numbers in an array: "+sum);
    }
}
