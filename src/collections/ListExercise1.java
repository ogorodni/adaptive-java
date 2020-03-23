package collections;

import java.util.*;

/**
 * Create ArrayList by name list in any way known to you and fill it with the following four numbers 2, 0, 1, 7.
 * The code for displaying the list is already written.
 * Sample Input:
 *
 * Sample Output:
 * [2, 0, 1, 7]
 */

public class ListExercise1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2,0,1,7));
        System.out.println(list);
    }
}
