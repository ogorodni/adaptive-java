package com.gorod.olga.adaptiveJava4;

import com.gorod.olga.adaptiveJava3.SpanishLatinDictionary;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GCContentTest {

    @Test
    public void calculateGCContent() {
        Assert.assertEquals("",40.0, GCContent.calculateGCContent("acggtgttat"), 0);
    }
}