package collections;

import java.util.*;

public class ListExercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> resultList;
        resultList = Arrays.asList(in.nextLine().split(" "));
        System.out.println(resultList);
    }
}