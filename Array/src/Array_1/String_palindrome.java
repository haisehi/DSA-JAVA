package Array_1;

public class String_palindrome {
    public static boolean isPalindrome(String str){
        if (str == null){
            return false;
        }

        String str2 = str.replaceAll("[^a-zA-Z]","").toLowerCase();
        int left = 0;
        int right = str2.length() -1;

        while (left<right){
            if(str2.charAt(left) != str2.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] Args){
        System.out.println(isPalindrome("Aerate, pet area.")); // true
        System.out.println(isPalindrome("A man, a plan, a canal, Panama.")); // true
        System.out.println(isPalindrome("Hello, World!")); // false
        System.out.println(isPalindrome("")); // true (chuỗi rỗng được coi là Palindrome)
        System.out.println(isPalindrome(null)); // false
    }
}
