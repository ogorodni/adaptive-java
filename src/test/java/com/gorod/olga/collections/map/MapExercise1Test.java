package com.gorod.olga.collections.map;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapExercise1Test {

    @Test
    public void emptyString() {
        String str = "";
        Assert.assertEquals(new HashMap<>(), MapExercise1.printStatistics(str));
    }

    @Test
    public void oneWord() {
        String str = "aaa";
        Map<String,Integer> map = new HashMap<>(Map.of("aaa",1));
        Assert.assertEquals(map, MapExercise1.printStatistics(str));
    }

    @Test
    public void severalWords() {
        String str = "a aa abC aa ac abc bcd a";
        Map<String,Integer> map = new HashMap<>();
        map.put("a", 2);
        map.put("aa", 2);
        map.put("abc", 2);
        map.put("ac", 1);
        map.put("bcd", 1);
        Assert.assertEquals(map, MapExercise1.printStatistics(str));
    }
}