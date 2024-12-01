package Array_1;

public class RemoveEvenIntegersFromAnArray {
    public static void main(String[] Args){
        System.out.println("initialization array: ");
        int[] num1 = {3,2,4,7,10,5,6};
        for (int i = 0; i < num1.length; i++){
            System.out.print(num1[i]+" ");
        }
        // value of array after removing even numbers
        int oddCountNumber = 0;

        for(int i = 0; i < num1.length; i++){
            if(num1[i] % 2 != 0){
                oddCountNumber++;
            }
        }

        // Initialization array of odd numbers
        int[] result = new int[oddCountNumber];
        // array's position
        int idx=0;

        for(int i = 0; i < num1.length; i++){
            if(num1[i] % 2 != 0){
                result[idx] = num1[i];
                idx++;
            }
        }
        System.out.println("\nresult of array: ");
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}
