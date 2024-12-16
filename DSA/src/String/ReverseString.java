package String;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {

    public static String reverse(String str){
        Stack<Character> stack = new Stack<Character>();

        char[] chars = str.toCharArray();
        for (char c:chars){
            stack.push(c);
        }
        for (int i = 0; i < str.length();i++){
            chars[i] = stack.pop();
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(reverse(str));
    }
}
