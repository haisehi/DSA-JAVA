package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

//Exercise 8: Sorting a list
// Write a program to:
//
// Input a list of integers (using ArrayList).
// Sort the list in ascending order and print the result.
// Example:
//
// Input: [5, 2, 8, 1, 9]
// Output: [1, 2, 5, 8, 9]
public class baitap8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input integers into the list
        System.out.println("Enter integers separated by spaces:");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        ArrayList<Integer> numList = new ArrayList<>();
        for (String num : numbers) {
            numList.add(Integer.parseInt(num));
        }

        System.out.println("Input list: " + numList);

        // Sort the list using Bubble Sort algorithm
        for (int i = 0; i < numList.size() - 1; i++) {
            for (int j = 0; j < numList.size() - i - 1; j++) {
                if (numList.get(j) > numList.get(j + 1)) {
                    // Swap numList[j] and numList[j+1]
                    int temp = numList.get(j);
                    numList.set(j, numList.get(j + 1));
                    numList.set(j + 1, temp);
                }
            }
        }

        System.out.println("Sorted list: " + numList);
    }
}
