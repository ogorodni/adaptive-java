package collections;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a program that reads the list of integer number separated by spaces from the standard input and then remove all
 * numbers with even indexes (0, 2, 4, and so on). After, the program should output the result sequence in the reverse order.
 * Sample Input:
 * 1 2 3 4 5 6 7
 * Sample Output:
 * 6 4 2
 */

public class ListExercise5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Object[] inputList = new Object[0];
        if (in.hasNextLine()) {
            String line = in.nextLine();
            if (line.length()>0) {
                inputList = Arrays.stream(line.split(" ")).map(Integer::parseInt).toArray();
            }
        }
        for (int i = inputList.length - 1; i >= 0; i--) {
            if (i % 2 != 0) {
                System.out.print(inputList[i] + " ");
            }
        }
    }
}
