package com.gorod.olga.adaptiveJava2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * In the Roman numbering system, the following symbols are used to represent numbers (on the right are the numbers, which correspond to these symbols in the decimal system):
 * <p>
 * I = 1
 * V = 5
 * X = 10
 * L = 50
 * C = 100
 * D = 500
 * M = 1000
 * <p>
 * We use an option in which the numbers 4, 9, 40, 90, 400 and 900 are represented by a subtraction of a smaller number from a larger one: IV, IX, XL, XC, CD and CM, respectively.
 * <p>
 * Write a program that converts the number from Roman system into the decimal one.
 * <p>
 * Input format:
 * The string, containing the number, encoded into the Roman numbering system. It is guaranteed that this number is less than 4000.
 * <p>
 * Output format:
 * The string, containing the number in the decimal numbering system, which corresponds to the input.
 */

public class RomanToDecimal {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            Converter converter = new Converter();
            System.out.println(converter.convert(in.nextLine()));
        }
    }
}

class Converter {
    Map<Character, Integer> ROMAN_TO_DECIMAL_MAP = new HashMap<>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    Integer convert(String roman) {
        List<Integer> numbers = roman.chars().mapToObj(item -> (char) item).map(t -> ROMAN_TO_DECIMAL_MAP.get(t)).collect(Collectors.toList());
        Integer result = numbers.get(numbers.size() - 1);
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) < numbers.get(i + 1)) {
                result = result - numbers.get(i);
            } else {
                result = result + numbers.get(i);
            }
        }
        return result;
    }
}