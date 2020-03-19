package com.JVBai3;

public class baitap_4_10 {

    public static void main(String[] args) {
        int age = 18;
        double weight = 71.23;
        int height = 191;
        boolean married = false;
        boolean attached = false;
        char gender = 'm';

        System.out.println(!married && !attached && (gender == 'm'));
        System.out.println((height >= 180) || (weight >= 90));
        System.out.println((height >= 180) && (weight >= 65) && (weight <= 80));
    }
}