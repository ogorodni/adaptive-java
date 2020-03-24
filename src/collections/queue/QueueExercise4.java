package collections.queue;

import java.util.*;

/**
 * Write a program that reads numbers and stores them to a deque.
 * An even number should be added as the first element, an odd number - as the last.
 * After, the program must output all elements from the first to the last.
 * <p>
 * The first string contains the number of elements. Each line followed the first one contains an element.
 * Sample Input:
 * 4
 * 1
 * 2
 * 3
 * 4
 * Sample Output:
 * 4
 * 2
 * 1
 * 3
 */

public class QueueExercise4 {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        Scanner in = new Scanner(System.in);
        int stackSize = in.nextInt();
        for (int i = 0; i < stackSize; i++) {
            int num = in.nextInt();
            if (num % 2 == 0) {
                stack.push(num);
            } else {
                stack.offer(num);
            }
        }

        while (stack.peek() != null) {
            System.out.println(stack.poll());
        }
    }
}
