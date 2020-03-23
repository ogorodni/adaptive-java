package collections;
import java.util.*;

/**
 * The list of strings is given.
 *
 * List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
 * Output each its element in the loop. Each element must be in new line.
 *
 * Sample Input:
 *
 * Sample Output:
 * Mr.Green
 * Mr.Yellow
 * Mr.Red
 */

public class ListExercise2 {
    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));

        for (String name:nameList){
            System.out.println(name);
        }


    }
}
