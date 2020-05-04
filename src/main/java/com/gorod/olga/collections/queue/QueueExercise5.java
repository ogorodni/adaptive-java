package com.gorod.olga.collections.queue;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

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

        Map<Character, Character> BRACKETS = new HashMap<>() {{
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }};

        Deque<Character> stack = new ArrayDeque<>();
        try (Scanner in = new Scanner(System.in)) {
            String line = in.nextLine();
            AtomicBoolean result = new AtomicBoolean(true);

            line.chars().forEachOrdered(bracket -> {
                if (BRACKETS.containsValue(bracket)) {
                    stack.push((char) bracket);
                } else if (BRACKETS.containsKey(bracket)) {
                    if (!stack.isEmpty() && stack.peek() == BRACKETS.get(bracket)) {
                        stack.pop();
                    } else {
                        result.set(false);
                    }
                }

            });

            if (!stack.isEmpty()) {
                result.set(false);
            }
            System.out.println(result.get());
        }
    }
}
