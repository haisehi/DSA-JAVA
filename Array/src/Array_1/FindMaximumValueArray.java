package Array_1;

public class FindMaximumValueArray {
    public static void main(String[] Args){
        System.out.println("initialization array: ");
        int[] num1 = {3,4,7,10,5,2,6};
        for (int i = 0; i < num1.length; i++){
            System.out.print(num1[i]+" ");
        }
        int max = num1[0];
        for (int i = 0; i < num1.length;i++){
            if(num1[i]>max){
                max = num1[i];
            }
        }
        System.out.print("\nMaximum value is "+max);
    }
}
