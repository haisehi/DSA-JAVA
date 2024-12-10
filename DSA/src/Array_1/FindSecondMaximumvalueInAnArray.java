package Array_1;

public class FindSecondMaximumvalueInAnArray {
    public static void main(String[] Args){
        System.out.println("initialization array: ");
        int[] num1 = {3,4,2,10,5,6,7,2,6};
        for (int i = 0; i < num1.length; i++){
            System.out.print(num1[i]+" ");
        }

        int max = Integer.MIN_VALUE;
        int SecondMax = Integer.MIN_VALUE;

        System.out.println("\nInitialization max is "+max);
        System.out.println("Initialization SecondMax is "+SecondMax);
        System.out.println("------------------------------");

        for(int i = 0; i < num1.length; i++){
            if(num1[i]>max){
                SecondMax = max;
                System.out.println("Second max when i = "+i+" ,Second max = max ="+max+" ,Second max ="+SecondMax);
                max = num1[i];
                System.out.println("Max when i = "+i+" ,max = num1["+i+"] ="+max);
                System.out.println("------------------------------");
            } else if (num1[i] > SecondMax && num1[i] !=max) {
                SecondMax = num1[i];
                System.out.println("Second Max when i = "+i+" ,second max = num1["+i+"] ="+SecondMax);
            }
        }
        System.out.println("------------------------------");
        System.out.print("The second maximum value in array is: "+SecondMax);

    }
}
