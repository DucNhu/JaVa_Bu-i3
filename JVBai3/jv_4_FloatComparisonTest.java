package com.JVBai3;

public class jv_4_FloatComparisonTest {
    public static void main(String[] args) {
        double d1 = 2.2 + 4.4;
        double d2 = 6.6;
        System.out.println(d1 == d2);
        System.out.println(d1);
        final double EPSILON = 1 * 2.7 - 7;
        System.out.println((d1 - d2) < EPSILON);
    }
}
