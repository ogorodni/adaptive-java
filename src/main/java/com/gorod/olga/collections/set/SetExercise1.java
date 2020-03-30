package com.gorod.olga.collections.set;

import java.util.*;

/**
 * Write a program that reads a sequence of strings from the standard input and displays them in a lexicographic order without duplicates.
 * <p>
 * Try to write your solution using a set.
 * <p>
 * Input data format
 * <p>
 * The first line contains the size of a string sequence. Next lines contain strings.
 * <p>
 * Output data format
 * <p>
 * A sorted sequence of strings without duplicates. Each string must be in a new line.
 * <p>
 * Sample Input:
 * <p>
 * 6
 * postgres
 * sqlite
 * oracle
 * mongodb
 * postgres
 * mssql
 * Sample Output:
 * <p>
 * mongodb
 * mssql
 * oracle
 * postgres
 * sqlite
 */

public class SetExercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStrings = Integer.parseInt(in.nextLine());
        Set<String> set = new TreeSet<>();
        for (int i = 0; i < numberOfStrings; i++) {
            set.add(in.nextLine());
        }

        set.forEach(System.out::println);

    }
}
