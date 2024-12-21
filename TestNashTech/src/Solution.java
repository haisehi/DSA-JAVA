import java.util.*;

class Solution {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StaffCounting(input);
    }

    private static void StaffCounting(String input) {
        // TODO: Let's Rock 'n Roll here
        String[] arr = input.split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}