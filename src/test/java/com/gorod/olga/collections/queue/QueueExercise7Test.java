package com.gorod.olga.collections.queue;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class QueueExercise7Test {
    @Test
    public void testEmpty() {
        List<String> input = List.of();
        List<Integer> output = new ArrayList<>();
        Assert.assertEquals(output, QueueExercise7.findMax(input));
    }

    @Test
    public void testNotEmpty() {
        List<String> input = List.of("push 2", "push 1", "max", "pop", "max");
        List<Integer> output = List.of(2, 2);
        Assert.assertEquals(output, QueueExercise7.findMax(input));
    }

    @Test
    public void testNoMax() {
        List<String> input = List.of("push 2", "push 1", "pop");
        List<Integer> output = new ArrayList<>();
        Assert.assertEquals(output, QueueExercise7.findMax(input));
    }
}
