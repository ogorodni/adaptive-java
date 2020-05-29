package korman;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import static org.junit.Assert.*;

public class SortTest {

    ArrayList<Integer> list = new ArrayList<>(List.of(1, 3, 11, 2, 5, 4, 6, 7, 8));
    List<Integer> sortedList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 11);

    @Test
    public void testMergeSort() {
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(list, 0, list.size()-1);
        Assert.assertEquals(sortedList, list);
    }

    @Test
    public void testQuickSort() {
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(list, 0, list.size()-1);
        Assert.assertEquals(sortedList, list);
    }
}