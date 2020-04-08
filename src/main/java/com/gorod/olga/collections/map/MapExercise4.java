package com.gorod.olga.collections.map;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * Write a program that reads key-value pairs and outputs pairs whose keys belongs to the specified range
 * (inclusive) in the ascending order by the key.
 *
 * Input data format
 *
 * The first line contains two values - range borders.
 * The second line contains the number of key-value pairs.
 * Next lines contain pair (an integer key and a string value separated by a space).
 *
 * Output data format
 *
 * All pairs whose keys belong to the range. Each pair in a new line.
 * The key and the value of a pair must be separated by a space.
 * Sample Input:
 *
 * 2 4
 * 5
 * 1 aa
 * 5 ee
 * 2 bb
 * 4 dd
 * 3 cc
 * Sample Output:
 *
 * 2 bb
 * 3 cc
 * 4 dd
 */

public class MapExercise4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = in.nextInt();
        int max = in.nextInt();
        int numberOfLines = in.nextInt();

        TreeMap<Integer, String> map = new TreeMap<>();

        for (int i = 0; i < numberOfLines; i++) {
            map.put(in.nextInt(), in.next());
        }

        map.subMap(min, max + 1).forEach((k, v) -> System.out.println(k + " " + v));
    }
}
