package com.gorod.olga.collections.map;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.*;

/**
 * At some point in the Bioinformatics Institute, biology students no longer understood what did the computer
 * science students said: they spoke a strange set of sounds.
 *
 * And one of the biologists had suddenly discovered the secret of computer science students:
 * they used the substitution cipher in their communication, i.e. they replaced each symbol of
 * the initial message to the corresponding another symbol.
 * Biologists gained the key to the cipher and now they need help:
 *
 * Write a program that can encode and decode the substitution cipher.
 * The program accepts two input strings of the same length;
 * the first line contains the characters of the original alphabet, the second line -
 * the symbols of a resulting alphabet, then goes a line you need to encode by the transmitted key,
 * and another line to be decrypted.
 *
 * For example, the program takes the following input:
 * abcd
 * *d%#
 * abacabadaba
 * #*%*d*%
 * It means that symbol a of the initial message is changed to symbol * in the cipher, b changed to d,
 * c — to% and d — to #. You need to encode the string abacabadaba and decode the string #*%*d*% using
 * this cipher. So you get the following lines, which you should be the output of the program:
 *
 * *d*%*d*#*d*
 * dacabac
 * Sample Input:
 *
 * abcd
 * *d%#
 * abacabadaba
 * #*%*d*%
 * Sample Output:
 *
 * *d*%*d*#*d*
 * dacabac
 */

public class MapExercise3 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)){
            String word = in.nextLine();
            String encodedWord = in.nextLine();
            String wordToEncode = in.nextLine();
            String wordToDecode = in.nextLine();
            SubstitutionCipher cipher = new SubstitutionCipher(word, encodedWord);
            System.out.println(cipher.encode(wordToEncode));
            System.out.println(cipher.decode(wordToDecode));
        }
    }

    public static class SubstitutionCipher {
        BiMap<Character, Character> biMap= HashBiMap.create();

        SubstitutionCipher(String word, String encodedWord) {
            for (int i = 0; i < word.length(); i++) {
                biMap.put(word.charAt(i), encodedWord.charAt(i));
            }
        }

        String encode(String word) {
            return code(word, biMap);
        }

        String decode(String word) {
            return code(word, biMap.inverse());
        }

        String code(String word, BiMap<Character, Character> map) {
            String result = "";
            for (int i = 0; i < word.length(); i++) {
                result = result + map.get(word.charAt(i));
            }
            return result;
        }
    }
}

