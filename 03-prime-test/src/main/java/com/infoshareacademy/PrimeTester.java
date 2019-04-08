package com.infoshareacademy;

/**
 * @author Marcin Kwiatkowski <m.kwiatkowski@int.pl>
 */
public class PrimeTester {

    static boolean isPrime(int number) {
        double sqrt = Math.sqrt(number);
        long rounded = Math.round(sqrt);

        for (int i = 2; i <= rounded; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
