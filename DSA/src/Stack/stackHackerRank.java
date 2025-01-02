package Stack;

import java.util.Scanner;
import java.util.Stack;
import java.util.*;

public class stackHackerRank {
    public static Boolean Stack(String line){
        Stack<Character> stack = new Stack<Character>();
        Map<Character, Character> matchingBrackets = new HashMap<>();
        matchingBrackets.put(')', '(');
        matchingBrackets.put('}', '{');
        matchingBrackets.put(']', '[');

        char[] mark = line.toCharArray();
        for (char c:mark){
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else if(c == ')' || c == '}' || c ==']'){
                if (stack.isEmpty() || stack.pop() != matchingBrackets.get(c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            System.out.println(Stack(scanner.next()));
        }
    }
}
