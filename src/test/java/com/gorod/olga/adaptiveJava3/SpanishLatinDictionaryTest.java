package com.gorod.olga.adaptiveJava3;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class SpanishLatinDictionaryTest {

    @Test
    public void test(){
        TreeMap<String, Set<String>> spanishLatinDictionary = new TreeMap<>(Map.of(
                "apple", Set.of("malum", "pomum", "popula"),
                "fruit", Set.of("baca", "bacca", "popum"),
                "punishment", Set.of("malum", "multa")
        ));

        TreeMap<String, Set<String>> latinSpanishDictionary = new TreeMap<>(Map.of(
                "baca", Set.of("fruit"),
                "bacca", Set.of("fruit"),
                "malum", Set.of("apple", "punishment"),
                "multa", Set.of("punishment"),
                "pomum", Set.of("apple"),
                "popula", Set.of("apple"),
                "popum", Set.of("fruit")
        ));
        Assert.assertEquals(latinSpanishDictionary, SpanishLatinDictionary.convert(spanishLatinDictionary));
    }

}