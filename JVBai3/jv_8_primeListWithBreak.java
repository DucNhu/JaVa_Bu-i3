package com.JVBai3;

public class jv_8_primeListWithBreak {
    public static void main(String[] args) {
        int uppperbound = 100;
        for (int number = 2; number <= uppperbound; ++number) {
            int maxFactor = (int) Math.sqrt(number);

            boolean isPrime = true;
            for (int factor = 2; factor <= maxFactor; ++factor) {
                if (number % factor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(number + " is a prime");
        }

    }
}
