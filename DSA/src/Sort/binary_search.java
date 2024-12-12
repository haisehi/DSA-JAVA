package Sort;

public class binary_search {
    public int binarysearch(int [] arrays, int key){
        int low = 0;
        int high = arrays.length-1;
        while (low<=high){
            int mid = (low+high)/2;
            if (arrays[mid] == key ){
                return mid;
            }
            if (key < arrays[mid]){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        binary_search binarySearch = new binary_search();
        int arrays[] = {1,10,20,47,59,65,75,88,99};
        System.out.println(binarySearch.binarysearch(arrays,65));
    }
}
