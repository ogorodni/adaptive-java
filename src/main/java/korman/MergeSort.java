package korman;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MergeSort {
    void merge(ArrayList<Integer> list, int start, int middle, int end) {
        System.out.println("merge is started with list" + list + ", start = " + start + ", middle = " + middle + ", end = " + end);
        List<Integer> left = ((ArrayList<Integer>) list.clone()).subList(start, middle + 1);
        System.out.println("left: " + left);

        List<Integer> right = ((ArrayList<Integer>) list.clone()).subList(middle + 1, end + 1);
        System.out.println("right: " + right);
        left.add(Integer.MAX_VALUE);
        right.add(Integer.MAX_VALUE);
        for (int i = start; i <= end ; i++) {
            if (left.get(0) < right.get(0)) {
                list.set(i, left.remove(0));
            } else {
                list.set(i, right.remove(0));
            }
        }
    }

    void mergeSort(ArrayList<Integer> list, int start, int end) {
        System.out.println("mergeSort is started with list" + list + ", start = " + start + ", end = " + end);
        if (start < end) {
            mergeSort(list, start, (end + start) / 2);
            mergeSort(list, (end + start) / 2 + 1, end);
            merge(list, start, (end + start) / 2, end);
        }
    }
}
