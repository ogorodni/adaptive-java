package com.gorod.olga.collections.queue;
import java.util.*;

/**
 *There is a queue of 4 elements. Put in it one more element - the number 5, and then get 2 items out of the queue.
 * Sample Input:
 *
 * Sample Output:
 * [3, 4, 5]
 */

public class QueueExercise2 {
    public static void main(String[] args) {

        Deque<Integer> queue = new ArrayDeque<>(Arrays.asList(1,2,3,4));
        queue.add(5);
        queue.remove();
        queue.remove();
        System.out.println(queue);

    }
}
