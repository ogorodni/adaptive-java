package com.gorod.olga.adaptiveJava3;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Once, while looking through the old books in the attic, schoolboy Mike found the Spanish-Latin dictionary. By that time, his knowledge of Spanish was perfect and his dream was to learn Latin. Therefore, his discovery was very useful.
 * <p>
 * Unfortunately, this one dictionary is not enough to learn the language: besides the Spanish-Latin dictionary, he needs a Latin-Spanish one. In the absence of better, he decided to make the second dictionary from the first one.
 * <p>
 * As it is well known, any dictionary consists of translated words, each of which has a few words-translations. For each of the Latin words, which are present somewhere in the dictionary, Mike offers to find all of their translations (i.e. all the Spanish words, for which our Latin word was specified in the list of its translations), and consider only such words the translations of the particular Latin word.
 * <p>
 * Help Mike to complete the task on creation of the Latin-Spanish dictionary from the Spanish-Latin one.
 * <p>
 * Input data
 * <p>
 * The first line contains the only integer number N that is the number of Spanish words in the dictionary. Then N descriptions follow: each of the descriptions is located in a separate line, where first goes a Spanish word, next goes the space separated dash (symbol number 45), and then go the translations of this Spanish word into Latin, separated by spaces and commas. Translations are sorted in the lexicographic order. The order of the Spanish words in the dictionary is also lexicographic.
 * <p>
 * All words consist of only the lowercase Latin letters; length of each word does not exceed 15 characters. The total number of words at the input is not greater than 100000.
 * <p>
 * Output data
 * <p>
 * Output the Latin-Spanish dictionary, corresponding to the given one, strictly observing the format of the input data. In particular, the first should be the translation of a lexicographically minimal Latin word, further - the second in this order, etc. Spanish words inside the translation must also be sorted in a lexicographic order.
 * <p>
 * Sample Input:
 * <p>
 * 3
 * apple - malum, pomum, popula
 * fruit - baca, bacca, popum
 * punishment - malum, multa
 * Sample Output:
 * <p>
 * 7
 * baca - fruit
 * bacca - fruit
 * malum - apple, punishment
 * multa - punishment
 * pomum - apple
 * popula - apple
 * popum - fruit
 */

public class SpanishLatinDictionary {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int num = Integer.parseInt(in.nextLine());
            TreeMap<String, Set<String>> spanishLatinDictionary = new TreeMap<>();
            for (int i = 0; i < num; i++) {
                String[] record = in.nextLine().split("-");
                String spanish = record[0].trim();
                Set<String> latin = Arrays.stream(record[1].split(",")).map(String::trim).collect(Collectors.toSet());
                spanishLatinDictionary.put(spanish, latin);
            }

            TreeMap<String, Set<String>> latinToSpanishDictionary = convert(spanishLatinDictionary);
            System.out.println(toString(latinToSpanishDictionary));
        }
    }

    public static TreeMap<String, Set<String>> convert(TreeMap<String, Set<String>> dict) {
        TreeMap<String, Set<String>> result = new TreeMap<>();

        for (Map.Entry<String, Set<String>> entry : dict.entrySet()) {
            for (String word : entry.getValue()) {
                Set<String> translatedWords;
                translatedWords = result.computeIfAbsent(word, t -> new TreeSet<>());
                translatedWords.add(entry.getKey());
                result.put(word, translatedWords);
            }
        }
        return result;
    }

    public static String toString(TreeMap<String, Set<String>> dict) {
        return dict.entrySet().stream().map( e -> e.getValue().stream().collect(Collectors.joining(", ", e.getKey() + " - ", "\n")))
            .collect(Collectors.joining());
    }
}