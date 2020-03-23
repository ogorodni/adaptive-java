package adaptiveJava;

import java.util.Scanner;
import java.lang.Exception;

import static java.lang.Math.ceil;

//Snail creeps up the vertical pole of height H feets. Per day it goes A feets up, and per night it goes B feets down. In which day the snail will reach the top of the pole?

abstract class Snail {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int poleHeight = in.nextInt();
        int feetsUp = in.nextInt();
        int feetsDown = in.nextInt();

        if (isValidParameter(poleHeight) || isValidParameter(feetsUp) || isValidParameter(feetsDown)) {
            throw new Exception("Parameters should not be negative and exceed 100.");
        }
        if (poleHeight <= feetsDown) {
            throw new Exception("Snail can't goes down more or equal to height of pole.");
        }
        if (feetsUp <= feetsDown) {
            throw new Exception("Snail should move up more than down.");
        }

        int day = (int) ceil((double) (poleHeight - feetsUp) / (feetsUp - feetsDown)) + 1;

        System.out.printf("%d", day);
        in.close();
    }

    static boolean isValidParameter(int param) {
        return param < 0 || param > 100;
    }

}

