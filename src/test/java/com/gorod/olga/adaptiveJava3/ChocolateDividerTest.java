package com.gorod.olga.adaptiveJava3;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ChocolateDividerTest {

    @Test
    public void dividerTest() {
        List<List<Integer>> YES = new ArrayList<>(List.of(
                List.of(4, 2, 6, 1),
                List.of(1, 1, 1, 1),
                List.of(1, 2, 3, 0),
                List.of(4, 2, 5, 0)
        ));
        YES.forEach(t -> {
            Chocolate.ChocolateDivider chocolateDivider = new Chocolate.ChocolateDivider(t.get(0), t.get(1), t.get(2));
            Assert.assertEquals(t.get(3) == 0 ? "NO" : "YES", chocolateDivider.isDivided());
        });


    }

}