package com.gorod.olga.collections.map;

import java.util.*;

/**
 * The simplest spell checker is based on a list of known words. Every word in the checked text is searched for in this list and, if such a word was not found, it is marked as erroneous.
 *
 * Write this spell checker.
 *
 * The first line of the input contains dd – number of records in the list of known word. Next go dd lines contain one known word per line, next — the number ll of lines of the text, after which — ll lines of the text.
 *
 * Write a program that outputs those words from the text, which are not found in the dictionary (i.e. erroneous). Your shell checker should be case insensitive. The words are entered in an arbitrary order. Words, which are not found in the dictionary, should not be duplicated in the output.
 *
 * Sample Input:
 *
 * 3
 * a
 * bb
 * cCc
 * 2
 * a bb aab aba ccc
 * c bb aaa
 * Sample Output:
 *
 * aaa
 * aab
 * c
 * aba
 */
public class MapExercise2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int numberOfKnownWords = Integer.parseInt(in.nextLine());
            Set<String> vocabulary = new HashSet<>();
            for (int i = 0; i < numberOfKnownWords; i++) {
                vocabulary.add(in.nextLine().toLowerCase());
            }
            int numberOfTextLines = Integer.parseInt(in.nextLine());
            Set<String> wordsToCheck = new HashSet<>();
            for (int i = 0; i < numberOfTextLines; i++) {
                Arrays.stream(in.nextLine().split(" ")).filter(t -> t.length() > 0)
                        .forEach(t -> wordsToCheck.add(t.toLowerCase()));
            }

            wordsToCheck.removeAll(vocabulary);
            wordsToCheck.forEach(System.out::println);
        }
    }

}

