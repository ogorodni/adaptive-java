package com.gorod.olga.kormann.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PyramideSortingTest {

    @Test
    public void testHeapSort() {
        List<Integer> inputList = new ArrayList<Integer>(List.of(2, 5, 11, 4, 8, 9, 0, 12, 17, 15, 1));
        List<Integer> outputList = List.of(0, 1, 2, 4, 5, 8, 9, 11, 12, 15, 17);
        PyramideSorting.heapSort(inputList);
        Assert.assertEquals(outputList, inputList);
    }
}