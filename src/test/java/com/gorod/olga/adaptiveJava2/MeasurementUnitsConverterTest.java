package com.gorod.olga.adaptiveJava2;

import org.junit.Assert;
import org.junit.Test;

public class MeasurementUnitsConverterTest {
    MeasurementUnitsConverter converter = new MeasurementUnitsConverter();

    @Test
    public void convert() {
        Float out = 24.9395f;
        Assert.assertEquals(out, converter.convert(15.5f, "mile", "km"));
    }
}