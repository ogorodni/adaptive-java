package collections.queue;

import java.util.*;

/**
 * Given a string consisting of brackets, write a program to examine whether
 * the pairs and the orders of "{", "}", "(", ")", "[", "]" are correct (balanced).
 * For example, the program should print true for the string [()]{}{[()()]()} and false for ()[]}.
 * <p>
 * The classic algorithm for solving this problem relies on using a stack.
 * <p>
 * create an instance of a stack;
 * traverse the input string;
 * if the current character is a starting bracket "(" or "{" or "{" then push it to the stack;
 * if the current is a closing bracket ")" or "}" or "]" then remove (pop) the top element from the stack; if the popped bracket is the matching starting bracket then fine else parenthesis are not balanced;
 * after completing traversal, if there are some starting brackets left in the stack, then the parenthesis are not balanced.
 * Sample Input:
 * <p>
 * ([][])
 * Sample Output:
 * <p>
 * true
 */

public class QueueExercise5 {
    public static void main(String[] args) {
        Deque<Character> stack = new ArrayDeque<>();
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        boolean result = true;
        for (int i = 0; i < line.length(); i++) {
            Character bracket = line.charAt(i);
            switch (bracket) {
                case '(':
                case '{':
                case '[':
                    stack.push(bracket);
                    break;
                case ')':
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        result = false;
                    }
                        break;
                case '}':
                    if (!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        result = false;
                    }
                        break;
                case ']':
                    if (!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        result = false;
                    }
                        break;
                default:
                    break;
            }
        }
        if (!stack.isEmpty()){result=false;}
        System.out.println(result);
    }
}
