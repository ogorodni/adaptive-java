package com.gorod.olga.collections.queue;

import java.util.*;

/**
 * Create ArrayDeque by name queue in any way known to you and push the following four numbers 2, 0, 1, 7.
 * The code for displaying the queue is already written.
 * Sample Input:
 *
 * Sample Output:
 * [2, 0, 1, 7]
 */

public class QueueExercise1 {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(2);
        queue.add(0);
        queue.add(1);
        queue.add(7);
        System.out.println(queue);

    }
}
