package com.gorod.olga.collections.queue;

import java.util.*;

/**
 * Write a program simulating a stack that can effectively return the current max element. Your program should read a sequence of commands of different types from the standard input.
 * <p>
 * There are three types of commands:
 * <p>
 * push v - add an element (v) to a top of the stack;
 * pop - remove the top element of the stack;
 * max - return the current max in the stack.
 * The time complexity of these operations should not depend on the stack size (constant time, O(1)).
 * <p>
 * Hint: you may use several standard stacks to write a solution.
 * <p>
 * Input data format
 * <p>
 * The first line contains the number of commands. Next lines contain one of the following commands: push v, pop, max.
 * <p>
 * Output data format
 * <p>
 * The program must output the current max for each command max.
 * <p>
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
        Scanner in = new Scanner(System.in);
        int numberOfStrings = Integer.parseInt(in.nextLine());
        List<String> input = new ArrayList<>();
        for (int i = 0; i < numberOfStrings; i++) {
            input.add(in.nextLine());
        }
        findMax(input).stream().forEach(System.out::println);
    }

    //I had to make all my classes and methods static because they are called inside static. Is that correct?
    static List<Integer> findMax(List<String> input){
        List<Integer> result = new ArrayList<>();
        StackWithMaximum stackWithMaximum = new StackWithMaximum();
        for (String command: input) {
            switch (command) {
                case "pop":
                    stackWithMaximum.pop();
                    break;
                case "max":
                    result.add(stackWithMaximum.max());
                    break;
                default:
                    if (command.matches("push(.*)")) {
                        stackWithMaximum.push(Integer.parseInt(command.substring(5)));
                        break;
                    } else {
                        throw new IllegalArgumentException("Not supported command " + command);
                    }
            }
        }
        return result;
    }

    static class StackWithMaximum {
        Deque<Integer> stack;
        Deque<Integer> maximums;
//ask Andrey about this
        {
            stack = new ArrayDeque<>();
            maximums = new ArrayDeque<>();
        }

        void push(Integer n) {
            stack.push(n);
            if (maximums.isEmpty() || maximums.peek() < n) {
                maximums.push(n);
            } else {
                maximums.push(maximums.peek());
            }
        }

        Integer pop() {
            maximums.remove();
            return stack.pop();
        }

        Integer max() {
            return maximums.peek();
        }
    }
}
