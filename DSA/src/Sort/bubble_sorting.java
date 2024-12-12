package Sort;

public class bubble_sorting {
    public static void main(String[] Args){
        // initialize array has 5 elements
        int arrays[] = {60,50,95,80,70};
        // iterate through the elements of array
        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = 0; j < arrays.length - i - 1; j++) {
//                compare element j and element (j+1), if element j > element (j+1)
//                then swap the position of element j and element (j+1) using the temporary value
                if (arrays[j] > arrays[j+1]){
                    int temp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = temp;
                }
            }
        }
        for (int array:arrays){
            System.out.print(array+" ");
        }
    }
}
