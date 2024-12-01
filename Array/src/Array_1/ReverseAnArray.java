package Array_1;

public class ReverseAnArray {
    public static void main(String[] Args){
        System.out.println("initialization array: ");
        int[] num1 = {3,2,4,7,10,5,6};
        for (int i = 0; i < num1.length; i++){
            System.out.print(num1[i]+" ");
        }

        // the first value in an array
        int start = 0;
        // the last value in an array
        int end = num1.length -1;

        // swap position of the first value and the last value in an array
        while (start<end){
            int temp = num1[start];
            num1[start] = num1[end];
            num1[end] = temp;
            start++;
            end--;
        }

        System.out.println("\nResult of array: ");
        for (int i = 0; i < num1.length; i++){
            System.out.print(num1[i]+" ");
        }

    }
}
