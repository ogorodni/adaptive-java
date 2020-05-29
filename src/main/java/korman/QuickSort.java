package korman;

import java.util.List;

public class QuickSort {
    void quickSort(List<Integer> list, int start, int end) {

        int mid = partition(list, start, end);
        if (start < mid - 1) {
            quickSort(list, start, mid - 1);
        }
        if (mid + 1 < end) {
            quickSort(list, mid + 1, end);
        }
    }

    int partition(List<Integer> list, int start, int end) {
        int i = start - 1;
        Integer last = list.get(end);
        for (int j = start; j < end; j++) {
            if (list.get(j) < last) {
                i = i + 1;
                swap(list, i, j);
            }
        }
        swap(list, i + 1, end);
        return i + 1;
    }

    void swap(List<Integer> list, int i, int j) {
        Integer temp = list.get(j);
        list.set(j, list.get(i));
        list.set(i, temp);
    }
}
