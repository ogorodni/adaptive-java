package collections.queue;

import java.util.*;

/**
 * Write a program that implements a simple load balancer.
 * <p>
 * The program must read tasks from the standard input and distribute them between two queues.
 * Tasks will be processed by a system (in future).
 * Each task has a unique identifier and a number indicating the load on the system (in parrots).
 * <p>
 * The balancer should distribute tasks between queues by the following rule - the task is added
 * to the lower-load queue (by the total load).
 * If both queues have the same total load indicator, the task must be added to the first queue.
 * <p>
 * It's guaranteed, the input data contain at least two tasks.
 * <p>
 * Input data format
 * <p>
 * The first line contains the number of tasks.
 * Other lines consist of task descriptions - an identifier and a load indicator (separated by a space).
 * <p>
 * Output data form
 * <p>
 * The first line should contain identifiers of tasks in the first queue, the second line - in the second queue.
 * Sample Input:
 * <p>
 * 6
 * 1 1
 * 2 1
 * 3 1
 * 4 3
 * 5 1
 * 6 1
 * Sample Output:
 * <p>
 * 1 3 5 6
 * 2 4
 */

public class QueueExercise6 {
    public static void main(String[] args) {
        Deque<Integer> stack1 = new ArrayDeque<>();
        Deque<Integer> stack2 = new ArrayDeque<>();
        int stack1Balance = 0;
        int stack2Balance = 0;
        Scanner in = new Scanner(System.in);
        int lineNumber = in.nextInt();
        int id;
        int balance;
        for (int i = 0; i < lineNumber; i++) {
            id = in.nextInt();
            balance = in.nextInt();
            if (stack1Balance > stack2Balance) {
                stack2Balance = stack2Balance + balance;
                stack2.add(id);
            } else {
                stack1Balance = stack1Balance + balance;
                stack1.add(id);
            }
        }
        for (int i = 0; stack1.size() > 0; i++) {
            System.out.print(stack1.poll() + " ");
        }
        System.out.print('\n');
        for (int i = 0; stack2.size() > 0; i++) {
            System.out.print(stack2.poll() + " ");
        }
    }
}
