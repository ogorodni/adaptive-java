package com.gorod.olga.adaptiveJava2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * You should write a program that can transform some units of measurement into others.
 *
 * The following transformations should be supported:
 *
 * miles (1 mile = 1609 m),
 * yards (1 yard = 0.9144 m),
 * feet (1 foot = 30.48 cm),
 * inches (1 inch = 2.54 cm),
 * kilometres (1 km = 1000 m),
 * meters (m),
 * centimetres (1 cm = 0.01 m)
 * millimetres (1 mm = 0.001 m)
 * Use the units of measurement specified in the problem description with the exact specified accuracy.
 *
 * Input format:
 * Single line in the following format:
 * <number> <unit_from> in <unit_to>
 * For example: if you get the line "15.5 mile in km", then you should transform 15.5 miles into kilometers.
 *
 * Output format:
 * Real number in scientific format (exponential), with an accuracy of exactly two digits after decimal point.
 *
 * Sample Input:
 *
 * 15.5 mile in km
 * Sample Output:
 *
 * 2.49e+01
 */

public class UnitsOfMeasurement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Float num = Float.parseFloat(in.next());
        String from = in.next();
        in.next();
        String to = in.next();
        System.out.printf("%.2e",new MeasurementUnitsConverter().convert(num, from, to));
    }
}
class MeasurementUnitsConverter{
    Map<String, Float> map = new HashMap<>();
    {
        map.put("mile", 1609f);
        map.put("yard", 0.9144f);
        map.put("foot", 0.3048f);
        map.put("inch", 0.0254f);
        map.put("km", 1000f);
        map.put("cm", 0.01f);
        map.put("mm", 0.001f);
        map.put("m", 1f);
    }
    Float convert(Float num, String from, String to){
        return num*map.get(from)/map.get(to);
    }

}
