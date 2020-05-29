package korman;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int count = 0;
        for (int i = N; i > 0; i /= 2) {
            System.out.println(i);
            for (int j = 0; j < i; j++) {
                count++;
            }

        }
        System.out.println(count);
    }
}
