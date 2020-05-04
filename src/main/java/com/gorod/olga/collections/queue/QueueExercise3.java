package com.gorod.olga.collections.queue;

import java.util.*;

/**
 * Write a program that reads the input elements and outputs them in the reverse order.
 * <p>
 * The first string contains the number of elements. Each line followed the first one contains an element.
 * Sample Input:
 * 3
 * 1
 * 2
 * 3
 * Sample Output:
 * 3
 * 2
 * 1
 */

public class QueueExercise3 {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        try (Scanner in = new Scanner(System.in)) {
            int stackSize = in.nextInt();
            for (int i = 0; i < stackSize; i++) {
                stack.push(in.nextInt());
            }
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
