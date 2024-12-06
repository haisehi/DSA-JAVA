package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

//Exercise 9: Palindrome word list
// Write a program to:
//
// Input a list of strings (ArrayList<String>).
// Find and print out the Palindrome strings (symmetric strings) in the list.
// Example:
//
// Input: ["madam", "hello", "racecar", "world", "level"]
// Output: ["madam", "racecar", "level"]
public class baitap9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter strings separated by spaces:");
        String input = scanner.nextLine();
        String[] words = input.split(" ");

        ArrayList<String> wordList = new ArrayList<>();
        for (String word : words) {
            wordList.add(word);
        }

        System.out.println("Input list: " + wordList);

        ArrayList<String> resultList = new ArrayList<>();
        for (String word : wordList) {
            if (isPalindrome(word)) {
                resultList.add(word);
            }
        }

        System.out.println("Result: " + resultList);
    }

    // Helper method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
