package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

//Exercise 5: Check prime numbers in a list
// Write a program to:
//
// Input a list of integers (using ArrayList).
// Check and print out the prime numbers in the list.
// Example:
//
// Input: [2, 4, 5, 9, 11, 15]
// Output: [2, 5, 11]
public class baitap5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input a list of integers
        System.out.println("Enter integers separated by spaces:");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        ArrayList<Integer> numList = new ArrayList<>();
        for (String num : numbers) {
            numList.add(Integer.parseInt(num));
        }

        System.out.println("Input list: " + numList);

        // Step 2: Check for prime numbers
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int num : numList) {
            if (isPrime(num)) {
                primeNumbers.add(num);
            }
        }

        // Step 3: Print prime numbers
        System.out.println("Prime numbers in the list: " + primeNumbers);
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
