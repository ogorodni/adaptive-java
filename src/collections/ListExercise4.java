package collections;
import java.util.*;

/**
 * The list of GreekLetter objects is given.
 *
 * List<GreekLetter> letterList = new ArrayList<>();
 * Convert it to the object array by name objArray.
 *
 * The code for displaying the array is already written.
 * Sample Input:
 *
 * Sample Output:
 *
 * {letter='Gamma', position=3}
 * {letter='Omega', position=24}
 * {letter='Alpha', position=1}
 *
 */
public class ListExercise4 {

    public static void main(String[] args) {

        List<GreekLetter> letterList = new ArrayList<>();
        letterList.add(new GreekLetter("Gamma",  3));
        letterList.add(new GreekLetter("Omega", 24));
        letterList.add(new GreekLetter("Alpha",  1));

        GreekLetter[] objArray = letterList.toArray(new GreekLetter[0]);

        for (int i = 0; i < objArray.length; i++) {
            System.out.println(objArray[i]);
        }
    }

    static class GreekLetter {

        private String letter;
        private Integer position;

        public GreekLetter(String letter, Integer position) {
            this.letter = letter;
            this.position = position;
        }

        @Override
        public String toString() {
            return "{" +
                    "letter='" + letter + '\'' +
                    ", position=" + position +
                    '}';
        }
    }
}
