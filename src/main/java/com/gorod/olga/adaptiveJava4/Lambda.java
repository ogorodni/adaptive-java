package com.gorod.olga.adaptiveJava4;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.LongStream;

/**
 * Write a lambda expression that accepts two long arguments as a range borders and calculates (returns) production of all numbers in this range (inclusively). It's guaranteed that 0 <= left border <= right border. if left border == right border then the result is any border.
 *
 * Solution format. Submit your lambda expression in any valid format with ; on the end.
 *
 * Examples: (x, y) -> x + y; (x, y) -> { return x + y; };
 *
 * Sample Input 1:
 *
 * 0 1
 * Sample Output 1:
 *
 * 0
 * Sample Input 2:
 *
 * 2 2
 * Sample Output 2:
 *
 * 2
 * Sample Input 3:
 *
 * 1 4
 * Sample Output 3:
 *
 * 24
 * Sample Input 4:
 *
 * 5 15
 * Sample Output 4:
 *
 * 54486432000
 */

public class Lambda {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            BiFunction lambda = (x, y) -> LongStream.rangeClosed((Long)x, (Long)y).reduce(1L, (i, j) -> i * j);
            System.out.println(lambda.apply(in.nextLong(), in.nextLong()));
        }
    }
}
