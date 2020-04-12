package com.gorod.olga.adaptiveJava3;

import java.util.Scanner;

/**
 * Check if chocolate of MxN size can be divided by 1 break to 2 pieces one of them should have Z bars
 * Input:
 * M
 * N
 * Z
 * Output:
 * YES
 */

public class Chocolate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(new ChocolateDivider(in.nextInt(), in.nextInt(), in.nextInt()).isDivided());
    }

    public static class ChocolateDivider {
        int width;
        int height;
        int bars;

        ChocolateDivider(int width, int height, int bars) {
            this.width = width;
            this.height = height;
            this.bars = bars;
        }

        String isDivided() {
            String result = "NO";
            if (bars <= width * height && ((bars % width == 0) || (bars % height == 0))) {
                result = "YES";
            }
            return result;
        }

    }
}
