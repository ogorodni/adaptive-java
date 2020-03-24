package collections.queue;
import java.util.*;

/**
 * Write a program simulating a stack that can effectively return the current max element. Your program should read a sequence of commands of different types from the standard input.
 *
 * There are three types of commands:
 *
 * push v - add an element (v) to a top of the stack;
 * pop - remove the top element of the stack;
 * max - return the current max in the stack.
 * The time complexity of these operations should not depend on the stack size (constant time, O(1)).
 *
 * Hint: you may use several standard stacks to write a solution.
 *
 * Input data format
 *
 * The first line contains the number of commands. Next lines contain one of the following commands: push v, pop, max.
 *
 * Output data format
 *
 * The program must output the current max for each command max.
 *
 * Sample Input:
 * 5
 * push 2
 * push 1
 * max
 * pop
 * max
 * Sample Output:
 * 2
 * 2
 */

public class QueueExercise7 {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> orderedQueue = new ArrayDeque<>();
        Deque<Integer> maximums = new ArrayDeque<>();
        Scanner in = new Scanner(System.in);
        int lineNumber = in.nextInt();
        for (int i = 0; i < lineNumber; i++) {

        }
    }
}
