package adaptiveJava;

import java.util.*;
import java.util.stream.LongStream;

//Find factorial using Stream

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long fact = LongStream.range(1, n + 1).reduce(1, (acc, x) -> acc * x);
        System.out.println(fact);
    }
}
