package com.gorod.olga.adaptiveJava2;

import org.junit.Assert;
import org.junit.Test;

public class RomanToDecimalTest {
    Converter converter = new Converter();

    @Test
    public void converterTest1() {
        String roman = "MCMLXXXIV";
        Integer decimal = 1984;
        Assert.assertEquals(decimal, converter.convert(roman));
    }

    @Test
    public void converterTest2() {
        String roman = "IX";
        Integer decimal = 9;
        Assert.assertEquals(decimal, converter.convert(roman));
    }

    @Test
    public void converterTest3() {
        String roman = "III";
        Integer decimal = 3;
        Assert.assertEquals(decimal, converter.convert(roman));
    }

}