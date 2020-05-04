package com.gorod.olga.kormann.sorting;

import java.util.Collections;
import java.util.List;

public class PyramideSorting {

    static void maxHeapify(List<Integer> list, int i, int heapSize) {
        System.out.printf("maxHeapify is starting with i = %d, and heapSize = %d \n", i, heapSize);
        int largest;
        int left = getLeft(i);
        int right = getRight(i);
        if (left <= heapSize && list.get(left) > list.get(i)) {
            largest = left;
        } else {
            largest = i;
        }
        if (right <= heapSize && list.get(right) > list.get(largest)) {
            largest = right;
        }
        if (i != largest) {
            Collections.swap(list, i, largest);
            maxHeapify(list, largest, heapSize);
        }
    }

    static void buildMaxHeap(List<Integer> list) {
        System.out.println("buildMaxHeap is starting...");
        int heapSize = list.size() - 1;
        for (int i = (list.size() - 1) / 2; i >= 0; i--) {
            maxHeapify(list, i, heapSize);
        }
    }

    static void heapSort(List<Integer> list) {
        System.out.println("heapSort is starting...");
        int heapSize = list.size() - 1;
        buildMaxHeap(list);
        System.out.println("buildMaxHeap is finished...");
        for (int i = list.size() - 1; i > 0; i--) {
            Collections.swap(list, 0, i);
            heapSize -= 1;
            maxHeapify(list, 0, heapSize);
        }
    }

    int getParent(int i) {
        return i / 2;
    }

    static int getLeft(int i) {
        return 2 * i + 1;
    }

    static int getRight(int i) {
        return 2 * i + 2;

    }
}
