package com.gorod.olga.adaptiveJava4;

import java.util.Scanner;

/**
 * GC-content is an important feature of the genome sequences and is defined as the percentage ratio of the sum of all guanines and cytosines to the overall number of nucleic bases in the genome sequence.
 * Write a program, which calculates the percentage of G characters (guanine) and C characters (cytosine) in the entered string. Your program should be case independent.
 *
 * For example, in the string "acggtgttat" the percentage of characters G and C equals to 4/10*100 = 40.0,
 * where 4 is the number of symbols G and C, and 10 is the length of the string.
 *
 * Output your result as a double value.
 * Sample Input:
 * acggtgttat
 * Sample Output:
 * 40.0
 */

public class GCContent {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println(calculateGCContent(in.next()));
        }
    }

    static double calculateGCContent(String str){
        return Double.valueOf(str.toLowerCase().chars().filter(it -> it == 'c' || it == 'g').count())/str.length()*100;
    }
}
