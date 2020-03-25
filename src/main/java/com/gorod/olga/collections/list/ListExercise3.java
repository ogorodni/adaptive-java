package com.gorod.olga.collections.list;
import java.util.*;

/**
 * The list of strings is given.
 * List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
 * Convert it to the string array by name strArray.
 * The code for displaying the array is already written.
 * Sample Input:
 *
 * Sample Output:
 * Mr.Green
 * Mr.Yellow
 * Mr.Red
 */

public class ListExercise3 {
    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));

        String[] strArray = nameList.toArray(new String[0]);

        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

    }
}
