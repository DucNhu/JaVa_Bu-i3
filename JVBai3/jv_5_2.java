package com.JVBai3;

public class jv_5_2 {
    public static void main(String[] args) {
        int absValue = -5;
        if (absValue < 0) absValue = -absValue;

        int min = 0, value = -5;
        if (value < min) {
        }
        min = value;
        System.out.println("Found new min");
        int mark = 50;
        if (mark >= 50)
            System.out.println("PASS");
        else {
            System.out.println("FAIL");
            System.out.println("Try Harder");
        }
        int number1 = 0, number2 = 9, absDiff;
        if (number1 > number2)
            absDiff = number1 - number2;
        else absDiff = number2 - number1;

        if (mark >= 80) {
            System.out.println("A");
        } else if (mark >= 65) {
            System.out.println("B");
        } else if (mark >= 50) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }
        if (mark < 50) {
            System.out.println("F");
        } else if (mark < 65) {
            System.out.println("C");
        } else if (mark < 80) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }

    }
}