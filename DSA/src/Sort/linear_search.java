package Sort;

public class linear_search {
    public static void main(String[] args) {
        int arrays[] = {5,1,9,2,10,15,20};
        int x = 10;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == x){
                System.out.println("index: " + i +", element: "+arrays[i]);
            }
        }
    }
}
