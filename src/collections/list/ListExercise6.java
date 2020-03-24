package collections.list;

import java.util.*;

/**
 * Given a sequence of strings separated by spaces. Read the sequence from the standard input and store all strings to the list. Output the list to the standard output using System.out.println(yourList). The order of elements must be the same as in the input.
 * Sample Input:
 * Google Oracle JetBrains
 * Sample Output:
 *
 * [Google, Oracle, JetBrains]
 */

public class ListExercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> resultList;
        resultList = Arrays.asList(in.nextLine().split(" "));
        System.out.println(resultList);
    }
}