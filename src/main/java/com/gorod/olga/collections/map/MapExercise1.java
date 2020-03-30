package com.gorod.olga.collections.map;

import java.util.*;

/**
 * When Anthony read "War and Peace", he wondered how many words and how much of them were used in this book.
 * <p>
 * Help Anthony to write a simplified version of a program that can count the words, separated by a space and output the resulting statistics.
 * <p>
 * The program must read one line from the standard input and for each unique word in this line output the count of its repeated occurrence (case insensitive) in the "word amount" format (see the output example).
 * <p>
 * The order of words output may be arbitrary. Each unique word must appear in the output only once.
 * <p>
 * Sample Input:
 * <p>
 * a aa abC aa ac abc bcd a
 * Sample Output:
 * <p>
 * a 2
 * aa 2
 * abc 2
 * ac 1
 * bcd 1
 */

public class MapExercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printStatistics(in.nextLine()).forEach((k, v) -> System.out.println(k + " " + v));

    }

    static Map<String, Integer> printStatistics(String input) {
        Map<String, Integer> map = new HashMap<>();
        Arrays.stream(input.split(" ")).filter(t -> t.length() > 0).forEach(t -> {
            String wordInLowerCase = t.toLowerCase();
            if (map.containsKey(wordInLowerCase)) {
                map.put(wordInLowerCase, map.get(wordInLowerCase) + 1);
            } else {
                map.put(wordInLowerCase, 1);
            }
        });
        return map;
    }
}
