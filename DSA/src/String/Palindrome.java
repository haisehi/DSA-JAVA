package String;

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String str){
        if (str == null){
            return false;
        }
        String str2 = str.replaceAll("[^a-zA-Z]","").toLowerCase();
        int left = 0;
        int right = str2.length()-1;
        while (left < right){
            if (str2.charAt(left) != str2.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(isPalindrome(str));
    }
}
