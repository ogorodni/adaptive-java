package com.gorod.olga.collections.utility;

import java.util.*;

public class CollectionsUtilityClassExercise2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int rowsNum = in.nextInt();
            int columnsNum = in.nextInt();
            List<List<Integer>> list = new ArrayList<>();
            for (int i = 0; i < rowsNum; i++) {
                List<Integer> row = new ArrayList<>();
                for (int j = 0; j < columnsNum; j++) {
                    row.add(in.nextInt());
                }
                list.add(row);
            }
            Collections.rotate(list, in.nextInt());
            list.forEach(row -> {
                System.out.println("");
                row.forEach(elem -> System.out.print(elem + " "));
            });
        }
    }
}
