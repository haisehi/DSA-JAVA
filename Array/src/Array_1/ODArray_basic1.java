package Array_1;

public class ODArray_basic1 {
    public static void main(String Args[]){
        System.out.println("the first via syntax to declare an array");
        int[] num1 = {1,2,3,4,5,6,7,8};
        System.out.println("int[] num1 = {1,2,3,4,5,6,7,8};: ");
        for (int i = 0; i < num1.length; i++){
            System.out.print(num1[i]+" ");
        }
        System.out.println("\nthe second via syntax to declare an array");
        System.out.println("int num2[] = {1,2,3,4,5,6,7,8};: ");
        int num2[] = {1,2,3,4,5,6,7,8};
        for (int i = 0; i < num2.length; i++){
            System.out.print(num2[i]+" ");
        }

    }
}
